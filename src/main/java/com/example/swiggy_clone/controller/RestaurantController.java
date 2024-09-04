package com.example.swiggy_clone.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.swiggy_clone.entity.Restaurant;
import com.example.swiggy_clone.exceptions.ResourceNotFoundException;
import com.example.swiggy_clone.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/add")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {
        return restaurantService.getRestaurantById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id " + id));
    }

    @GetMapping("/search")
    public List<Restaurant> searchRestaurants(@RequestParam String location) {
        return restaurantService.findRestaurantsByLocation(location);
    }
}
