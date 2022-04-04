package com.demerson.SpringFood.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

	// @ResponseStatus(value = HttpStatus.CREATED)
	@GetMapping(value = "/{id}")
	public ResponseEntity<Kitchen> kitchenById(@PathVariable("id") Long id) {
		Kitchen kitchen = kitchenRepository.kitchenFindById(id);

		if (kitchen != null) {
			return ResponseEntity.ok(kitchen);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public Kitchen newKitchen(@RequestBody Kitchen kitchen) {
		return kitchenRepository.newKitchenByUpdate(kitchen);
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus(value = HttpStatus.CREATED)
	public ResponseEntity<Kitchen> updateKitchen(@PathVariable Long id, @RequestBody Kitchen kitchen) {
		Kitchen upadatekitchen = kitchenRepository.kitchenFindById(id);
		BeanUtils.copyProperties(kitchen, upadatekitchen);
		kitchenRepository.newKitchenByUpdate(upadatekitchen);	
		return ResponseEntity.ok(upadatekitchen);

	}
}
