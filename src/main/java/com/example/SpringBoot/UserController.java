package com.example.SpringBoot;

import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class UserController {
    private final Controllers repository;
    UserController(Controllers repository){
        this.repository = repository;
    }



    //For seeing all of the users in the list.
    @GetMapping("/User")
    List<User>all(){

        return repository.findAll();


    }
  //For the single search
    @GetMapping("/User/{id}")
    User one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new UserNotFound(id));
    }

  // To add a new user to our database.
    @PostMapping("/User")
    User newUser(@RequestBody User newUser){
        return repository.save(newUser);
    }

    //To update our specified user in database.
    // If it is not in the list it will create as a new user.
    @PutMapping("/User/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {

        return repository.findById(id)
                .map(User -> {
                       if(newUser.getName()!=(null)){
                        User.setName(newUser.getName());
                    }



                    if(newUser.getSurname()!=(null)) {
                        User.setSurname(newUser.getSurname());
                    }

                        if(newUser.getEmail()!=(null)) {
                            User.setEmail(newUser.getEmail());
                        }

                    return repository.save(User);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return repository.save(newUser);
                });
    }


 //To delete specified user.
    @DeleteMapping("/User/{id}")
    void deleteUser(@PathVariable Long id) {
        try{
            repository.deleteById(id);
        }
        catch(UserNotFound exception) {
            exception = new UserNotFound(id);
        }
        };


}

