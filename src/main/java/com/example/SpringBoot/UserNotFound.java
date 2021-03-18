package com.example.SpringBoot;


public class UserNotFound extends RuntimeException  {
//Specific message for User not found exception
    UserNotFound(Long id) {
        super("Could not find the User " + id);
    }

}


