package com.example.SeminarHomeTask.services;

import com.example.SeminarHomeTask.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }
}
