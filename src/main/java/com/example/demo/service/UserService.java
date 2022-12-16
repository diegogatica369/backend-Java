package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
    User getUser(Integer id);

    User save(User user);

    void delete(Integer id);

    List<User> getAllUsers();
}
