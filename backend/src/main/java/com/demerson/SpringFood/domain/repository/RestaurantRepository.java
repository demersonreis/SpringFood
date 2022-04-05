package com.demerson.SpringFood.domain.repository;

import java.util.List;

import com.demerson.SpringFood.domain.entity.Kitchen;
import com.demerson.SpringFood.domain.entity.Restaurant;

public interface RestaurantRepository  {
   
	List<Restaurant> RestaurantFindAll();	
	 Restaurant newRestaurant(Restaurant restaurant);
}
