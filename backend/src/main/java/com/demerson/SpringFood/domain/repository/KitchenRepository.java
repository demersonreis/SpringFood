package com.demerson.SpringFood.domain.repository;

import java.util.List;

import com.demerson.SpringFood.domain.entity.Kitchen;

public interface KitchenRepository  {
   
	 Kitchen kitchenFindById(Long id);
	 
	 List<Kitchen> kitchenFindAll();
	 
	 Kitchen newKitchenByUpdate(Kitchen kitchen);
	 
	 void deleteKitchen(Kitchen kitchen);
}
