package com.example.SeminarHomeTask.controllers;

import com.example.SeminarHomeTask.domain.User;
import com.example.SeminarHomeTask.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private DataProcessingService service;

    @GetMapping
    public List<String> getAllTasks() {

        List<String> tasks = new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calc");
        return tasks;
    }

    @GetMapping("/sort")
    public List<User> sortUsersByAge() {
        return service.sortUsersByAge(service.getRepository().getUsers());
    }

    @GetMapping("/filter/{age}") //localhost:8080/tasks/filter/23
    public List<User> filterUsersByAge(@PathVariable("age") int age) {

        return service.filterUserByAge(service.getRepository().getUsers(), age);

    }

    @GetMapping("/calc")
    public Double calculateAverageAge() {

        return service.calculateAverageAge(service.getRepository().getUsers());

    }
}
