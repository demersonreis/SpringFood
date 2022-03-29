package com.demerson.SpringFood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.demerson.SpringFood.SpringFoodApplication;
import com.demerson.SpringFood.domain.entity.Restaurant;
import com.demerson.SpringFood.domain.repository.RestaurantRepository;

public class consultationRestaurantMain {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringFoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		RestaurantRepository registrationRestaurant = applicationContext.getBean(RestaurantRepository.class);

		List<Restaurant> Restaurants = registrationRestaurant.RestaurantFindAll();
		
		for(Restaurant Restaurant : Restaurants) {
			System.out.printf("%s - %f - %s\n",Restaurant.getName(), 
					Restaurant.getShippingFee(), Restaurant.getKitchen().getName());
		}
	}
}
