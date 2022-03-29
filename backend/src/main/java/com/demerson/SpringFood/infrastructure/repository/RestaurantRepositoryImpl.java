package com.demerson.SpringFood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.demerson.SpringFood.domain.entity.Restaurant;
import com.demerson.SpringFood.domain.entity.Restaurant;
import com.demerson.SpringFood.domain.repository.RestaurantRepository;
import com.demerson.SpringFood.domain.repository.RestaurantRepository;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

	@PersistenceContext
	private EntityManager manager;
    
  
	@Override
	public List<Restaurant> RestaurantFindAll() {
		return manager.createQuery("from Restaurant", Restaurant.class).getResultList();
	}
}
