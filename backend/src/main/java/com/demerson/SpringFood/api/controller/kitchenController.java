package com.demerson.SpringFood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demerson.SpringFood.domain.entity.Kitchen;
import com.demerson.SpringFood.domain.repository.KitchenRepository;

@RestController
@RequestMapping(value = "/kitchens", produces = MediaType.APPLICATION_JSON_VALUE)
public class kitchenController {

	@Autowired
	private KitchenRepository kitchenRepository;

	@GetMapping()
	public List<Kitchen> findAll() {
		return kitchenRepository.kitchenFindAll();
	}

	@GetMapping(value = "/{id}")
	public Kitchen kitchenById(@PathVariable("id") Long id) {
		return kitchenRepository.kitchenFindById(id);
	}
}
