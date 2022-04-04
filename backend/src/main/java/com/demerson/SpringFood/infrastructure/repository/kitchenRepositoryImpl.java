package com.demerson.SpringFood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.demerson.SpringFood.domain.entity.Kitchen;
import com.demerson.SpringFood.domain.repository.KitchenRepository;

@Component
public class kitchenRepositoryImpl implements KitchenRepository {

	@PersistenceContext
	private EntityManager manager;
    
	@Override
	public List<Kitchen> kitchenFindAll() {

		return manager.createQuery("from Kitchen", Kitchen.class).getResultList();
	}
     
    @Override
	public Kitchen kitchenFindById(Long id) {
		return manager.find(Kitchen.class, id);
	}

	@Transactional
	public Kitchen newKitchenByUpdate(Kitchen kitchen) {
		return manager.merge(kitchen);

	}

	@Transactional
	@Override
	public void deleteKitchen(Kitchen kitchen) {
		kitchen = kitchenFindById(kitchen.getId());
		manager.remove(kitchen);
	}
}
