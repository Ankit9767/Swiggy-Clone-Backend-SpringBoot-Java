package com.example.swiggy_clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swiggy_clone.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}


