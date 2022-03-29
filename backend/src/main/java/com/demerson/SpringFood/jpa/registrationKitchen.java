package com.demerson.SpringFood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.demerson.SpringFood.domain.entity.Kitchen;

@Component
public class registrationKitchen {

	@PersistenceContext
	private EntityManager manager;

	public List<Kitchen> kitchenFindAll() {

		return manager.createQuery("from Kitchen", Kitchen.class).getResultList();
	}
    
	@Transactional
	public Kitchen newKitchen(Kitchen kitchen) {
		return manager.merge(kitchen);
		
	}
}
