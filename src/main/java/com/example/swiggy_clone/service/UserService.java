package com.example.swiggy_clone.service;

import java.util.List;
import java.util.Optional;

import com.example.swiggy_clone.entity.User;

public interface UserService {
    User registerUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
}


