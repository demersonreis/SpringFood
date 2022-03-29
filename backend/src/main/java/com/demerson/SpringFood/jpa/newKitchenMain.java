package com.demerson.SpringFood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.demerson.SpringFood.SpringFoodApplication;
import com.demerson.SpringFood.domain.entity.Kitchen;

public class newKitchenMain {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringFoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		registrationKitchen registrationKitchen = applicationContext.getBean(registrationKitchen.class);

		 Kitchen kitchen1 = new Kitchen();
		 kitchen1.setName("Brasileira");
		 
		 Kitchen kitchen2 = new Kitchen();
		 kitchen2.setName("Brasileira_01");
		 
		 Kitchen kitchen3 = new Kitchen();
		 kitchen3.setName("Brasileira_02");
		 
		 kitchen1 = registrationKitchen.newKitchen(kitchen1);
		 kitchen2 =  registrationKitchen.newKitchen(kitchen3);
		 kitchen3 = registrationKitchen.newKitchen(kitchen3);
		
		 System.out.printf("%d - %s\n", kitchen1.getId(), kitchen1.getName());
		 System.out.printf("%d - %s\n", kitchen2.getId(), kitchen2.getName());
		 System.out.printf("%d - %s\n", kitchen3.getId(), kitchen3.getName());
	}
}
