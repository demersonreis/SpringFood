package com.demerson.SpringFood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.demerson.SpringFood.SpringFoodApplication;
import com.demerson.SpringFood.domain.entity.Kitchen;

public class deleteKitchenMain {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringFoodApplication.class)
				.web(WebApplicationType.NONE).run(args);

		registrationKitchen registrationKitchen = applicationContext.getBean(registrationKitchen.class);

		Kitchen kitchen1 = new Kitchen();
		kitchen1.setId(2L);

		 registrationKitchen.deleteKitchen(kitchen1);

	}
}
