package com.gserafim.auri.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping ("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/name")
    public String createUserName(@RequestParam String name) {
        userService.createUserName(name);
        return "User created with name: " + name;
    }
    
    @PostMapping("/email")
    public String createUserEmail(@RequestParam String email) {
        userService.createUserEmail(email);
        return "User created with email: " + email;
    }
 
}

