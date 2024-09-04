package com.example.swiggy_clone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    private Long userId;

  
    private Long foodItemId;

    private int quantity;

	public OrderEntity (Long id, Long userId, Long foodItemId, int quantity) {
		super();
		this.id = id;
		this.userId = userId;
		this.foodItemId = foodItemId;
		this.quantity = quantity;
	}

	public OrderEntity () {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getFoodItemId() {
		return foodItemId;
	}

	public void setFoodItemId(Long foodItemId) {
		this.foodItemId = foodItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

