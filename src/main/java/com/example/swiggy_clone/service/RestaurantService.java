package com.example.swiggy_clone.service;

import java.util.List;
import java.util.Optional;

import com.example.swiggy_clone.entity.Restaurant;

public interface RestaurantService {
    Restaurant addRestaurant(Restaurant restaurant);
    List<Restaurant> getAllRestaurants();
    Optional<Restaurant> getRestaurantById(Long id);
    List<Restaurant> findRestaurantsByLocation(String location);
}

