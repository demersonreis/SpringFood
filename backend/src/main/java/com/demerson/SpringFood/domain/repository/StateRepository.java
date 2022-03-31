package com.demerson.SpringFood.domain.repository;

import java.util.List;
import com.demerson.SpringFood.domain.entity.State;

public interface StateRepository {
   
	List<State> StateFindAll();
	
}
