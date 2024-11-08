package com.example.SeminarHomeTask.services;

import com.example.SeminarHomeTask.domain.User;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }


    private DataProcessingService dataProcessingService;


    private  UserService userService;


    private NotificationService notificationService;


    public RegistrationService(DataProcessingService dataProcessingService,
                               UserService userService,
                               NotificationService notificationService) {
        this.dataProcessingService = dataProcessingService;
        this.userService = userService;
        this.notificationService = notificationService;
    }


    public void processRegistration(String name, int age, String email) {
        User createUser = userService.createUser(name, age, email);
        dataProcessingService.addUserToList(createUser);
        notificationService.notifyUser(createUser);
    }

}
