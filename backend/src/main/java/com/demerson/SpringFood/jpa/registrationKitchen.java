package com.demerson.SpringFood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.demerson.SpringFood.domain.entity.Kitchen;

@Component
public class registrationKitchen {
	
	@PersistenceContext
	private EntityManager manager;

	public List<Kitchen> kitchenFindAll() {
		
		return  manager.createQuery("from tb_kitchen", Kitchen.class)
				.getResultList();

		
	}
}
