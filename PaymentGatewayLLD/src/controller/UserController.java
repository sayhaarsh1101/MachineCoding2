package controller;

import Service.UserService;
import models.UserDo;


public class UserController {

    private UserService userService;

    public UserController() {
        userService = new UserService();
    }

    //postMapping to add the user
    public UserDo addUser(UserDo userdo){
        userService.addUser(userdo);
        return userdo;
    }

    //getMapping to get the user
    public UserDo getUser(String userId){
        UserDo userdo = userService.getUserDetails(userId);
        return userdo;
    }
    
}
