package com.example.swiggy_clone.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swiggy_clone.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findByLocation(String location);
}

