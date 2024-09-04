package com.example.swiggy_clone.service;

import java.util.List;
import java.util.Optional;

import com.example.swiggy_clone.entity.OrderEntity;

public interface OrderService {
	OrderEntity placeOrder(OrderEntity order);
    List<OrderEntity> getAllOrders();
    Optional<OrderEntity> getOrderById(Long id);
}


