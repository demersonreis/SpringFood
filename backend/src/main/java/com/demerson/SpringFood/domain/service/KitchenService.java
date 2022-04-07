package com.demerson.SpringFood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.demerson.SpringFood.domain.entity.Kitchen;
import com.demerson.SpringFood.domain.exception.entityNotFound;
import com.demerson.SpringFood.domain.exception.entityUseException;
import com.demerson.SpringFood.domain.repository.KitchenRepository;

@Service
public class KitchenService {

	@Autowired
	private KitchenRepository kitchenRepository;

	public Kitchen newKitchenByUpdate(Kitchen kitchen) {
		return kitchenRepository.newKitchenByUpdate(kitchen);
	}

	public void deleteKitchen(Long id) {
		try {
			kitchenRepository.deleteKitchen(id);
			
		}catch(EmptyResultDataAccessException e){
			throw new entityNotFound(String.format("Não existe cadastro de cozinha com o Id %d", id));
		
		} catch (DataIntegrityViolationException e) {			
			throw new entityUseException(String.format("Cozinha do Id %d não pode ser removida pois está em uso", id));			
		}
	}
}
