package com.example.swiggy_clone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swiggy_clone.entity.FoodItem;
import com.example.swiggy_clone.exceptions.ResourceNotFoundException;
import com.example.swiggy_clone.service.FoodItemService;

@RestController
@RequestMapping("/fooditems")
public class FoodItemController {
    @Autowired
    private FoodItemService foodItemService;

    @PostMapping("/add")
    public FoodItem addFoodItem(@RequestBody FoodItem foodItem) {
        return foodItemService.addFoodItem(foodItem);
    }
    
    // Get all food items
    @GetMapping
    public List<FoodItem> getAllFoodItems() {
        return foodItemService.getAllFoodItems();
    }

    // Get a food item by ID
    @GetMapping("/{id}")
    public FoodItem getFoodItemById(@PathVariable Long id) {
        return foodItemService.getFoodItemById(id)
            .orElseThrow(() -> new ResourceNotFoundException("FoodItem not found with id " + id));
    }
}


