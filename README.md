# SpringBoot
In this Repo we are making CRUD examples with spring boot.

HOW TO USE IT ?

1    - WITH USING LOCAL HOST -

First if you are using an IDE you need to choose a import project and choose the file.
![Screenshot_26](https://user-images.githubusercontent.com/60350565/111508207-800cde00-875c-11eb-95a3-805997eb8ed6.png)

After implementing process, First you need to start the server with running ServerStarter.java

![Screenshot_27](https://user-images.githubusercontent.com/60350565/111509071-6750f800-875d-11eb-8027-100f94dc525f.png)

If it is perfectly works you need to see this log.
![image](https://user-images.githubusercontent.com/60350565/111509286-9ff0d180-875d-11eb-91bb-3b77eb5680ab.png)

So our system is on !  ıf u  want  to see the website go to  http://localhost:8080/User .

2   - WITH HEROKU -

If you want to try it out with heroku it is the easiest way ! just go to https://spring-boot-herokuu.herokuapp.com/User website and you can check it that it is on .

 
----COMMANDS----

Because of having different types of terminals on different operating systems, syntax might be different time to time...
If you want to try it out locally you can just replace http link with localhost:8080/User .
After typing these commands you can go to the website and check the differences !!

1- For Windows Users :

A) Getting All Of The Users: curl -X POST https://spring-boot-herokuu.herokuapp.com/User 

![Screenshot_32](https://user-images.githubusercontent.com/60350565/111702662-ab232a80-884d-11eb-9ec0-ac55c2cb188b.png)


B) Getting Specific Single User (Write the specific id to inside curly brackets) : curl -X POST https://spring-boot-herokuu.herokuapp.com/User/{id}

![Screenshot_31](https://user-images.githubusercontent.com/60350565/111702675-b0807500-884d-11eb-8027-95720ccce302.png)


C) Adding New User : curl -X POST https://spring-boot-herokuu.herokuapp.com/User -H "Content-type:application/json" -d "{\\"name\\": \\"John\\", \\"surname\\": \\"Cameron\\",\\"email\\": \\"johncameron@gmail.com\\"}"  

![Screenshot_28](https://user-images.githubusercontent.com/60350565/111702756-d0b03400-884d-11eb-8b8e-8542cd9db258.png)


D) Changing The Parameters Of User (Write the specific id to inside curly brackets) : curl -X PUT https://spring-boot-herokuu.herokuapp.com/User/{id} -H "Content-type:application/json" -d "{\\"name\\": \\"Arthur\\", \\"surname\\": \\"Morgan\\",\\"email\\": \\"arthurmorgan@hotmail.com\\"}" 

![Screenshot_29](https://user-images.githubusercontent.com/60350565/111702771-d7d74200-884d-11eb-98b9-e1779059ff3f.png)


E) Delete The User (Write the specific id to inside curly brackets) :
curl -X DELETE https://spring-boot-herokuu.herokuapp.com/User/{id}   

![Screenshot_30](https://user-images.githubusercontent.com/60350565/111702802-df96e680-884d-11eb-8c08-6d827b4df53f.png)



2- For Linux/Mac Users :

A) Getting All Of The Users: curl -X POST localhost:8080/User


B) Getting Specific Single User (Write the specific id to inside curly brackets) : curl -X POST localhost:8080/User/{id}


C) Adding New User : curl -X POST localhost:8080/User -H 'Content-type:application/json' -d '{"name": "John", "surname": "Cameron","email": "johncameron@gmail.com"}'  


D) Changing The Parameters Of User (Write the specific id to inside curly brackets) : curl -X PUT localhost:8080/User/{id} -H 'Content-type:application/json' -d '{"name": "Arthur", "surname": "Morgan","email": "arthurmorgan@hotmail.com"}' 

E) Delete The User (Write the specific id to inside curly brackets) :
curl -X DELETE localhost:8080/User/{id}  


