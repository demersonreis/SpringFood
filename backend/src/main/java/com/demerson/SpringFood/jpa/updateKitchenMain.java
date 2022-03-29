package com.demerson.SpringFood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.demerson.SpringFood.SpringFoodApplication;
import com.demerson.SpringFood.domain.entity.Kitchen;
import com.demerson.SpringFood.domain.repository.KitchenRepository;

public class updateKitchenMain {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new SpringApplicationBuilder(SpringFoodApplication.class)
				.web(WebApplicationType.NONE).run(args);

		KitchenRepository registrationKitchen = applicationContext.getBean(KitchenRepository.class);
		Kitchen kitchen1 = new Kitchen();
		kitchen1.setId(1L);
		kitchen1.setName("Amaricana");

		kitchen1 = registrationKitchen.newKitchenByUpdate(kitchen1);

		System.out.printf("%d - %s\n", kitchen1.getId(), kitchen1.getName());
	}
}
