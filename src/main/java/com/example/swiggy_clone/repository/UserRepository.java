package com.example.swiggy_clone.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swiggy_clone.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

