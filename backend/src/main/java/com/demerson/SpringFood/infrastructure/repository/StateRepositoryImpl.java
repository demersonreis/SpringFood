package com.demerson.SpringFood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import com.demerson.SpringFood.domain.entity.State;
import com.demerson.SpringFood.domain.repository.StateRepository;

@Component
public class StateRepositoryImpl implements StateRepository{

	@PersistenceContext
	private EntityManager manager;
    
	@Override
	public List<State> StateFindAll() {
	   
	  return manager.createQuery("from State", State.class).getResultList();
	}
     
   
}
