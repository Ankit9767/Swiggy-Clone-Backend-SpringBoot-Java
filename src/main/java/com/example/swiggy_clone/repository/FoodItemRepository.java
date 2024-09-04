package com.example.swiggy_clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swiggy_clone.entity.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}


