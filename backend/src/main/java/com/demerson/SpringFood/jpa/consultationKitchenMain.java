package com.demerson.SpringFood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.demerson.SpringFood.SpringFoodApplication;
import com.demerson.SpringFood.domain.entity.Kitchen;

public class consultationKitchenMain {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringFoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		registrationKitchen registrationKitchen = applicationContext.getBean(registrationKitchen.class);

		List<Kitchen> kitchens = registrationKitchen.kitchenFindAll();
		
		for(Kitchen Kitchen : kitchens) {
			System.out.println(Kitchen.getName());
		}
	}
}
