package com.demerson.SpringFood.domain.repository;

import java.util.List;

import com.demerson.SpringFood.domain.entity.Restaurant;
import com.demerson.SpringFood.domain.entity.State;

public interface StateRepository {
   
	List<State> StateFindAll();
	State newStateByUpdate(State state);
	State StateFindById(Long id);

	
}
