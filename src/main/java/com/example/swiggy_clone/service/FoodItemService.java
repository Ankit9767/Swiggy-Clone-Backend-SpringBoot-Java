package com.example.swiggy_clone.service;
import java.util.List;
import java.util.Optional;

import com.example.swiggy_clone.entity.FoodItem;

public interface FoodItemService {
    FoodItem addFoodItem(FoodItem foodItem);
    List<FoodItem> getAllFoodItems();
    Optional<FoodItem> getFoodItemById(Long id);
}
