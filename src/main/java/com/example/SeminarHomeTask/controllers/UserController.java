package com.example.SeminarHomeTask.controllers;

import com.example.SeminarHomeTask.domain.User;
import com.example.SeminarHomeTask.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RegistrationService service;

    @GetMapping
    public List<User> userList(){
        return service.getDataProcessingService().getRepository().getUsers();
    }

    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user){
        service.getDataProcessingService().getRepository().getUsers().add(user);
        return "User added from body!";
    }
}
