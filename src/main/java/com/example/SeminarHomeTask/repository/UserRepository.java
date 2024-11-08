package com.example.SeminarHomeTask.repository;

import com.example.SeminarHomeTask.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    public void addUser(User user){
        users.add(user);
    }

}
