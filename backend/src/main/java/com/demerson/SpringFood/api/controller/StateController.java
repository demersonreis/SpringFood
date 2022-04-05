package com.demerson.SpringFood.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import com.demerson.SpringFood.domain.entity.State;
import com.demerson.SpringFood.domain.repository.StateRepository;

@RestController
@RequestMapping(value = "/States")
public class StateController {

	@Autowired
	private StateRepository StateRepository;

	@GetMapping
	public List<State> findAll() {
		return StateRepository.StateFindAll();
	}

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public State newKitchen(@RequestBody State state) {
		return StateRepository.newStateByUpdate(state);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<State> StateById(@PathVariable("id") Long id) {
		State state = StateRepository.StateFindById(id);

		if (state != null) {
			return ResponseEntity.ok(state);
		}
		return ResponseEntity.notFound().build();
	}

	@PutMapping(value = "/{id}")
	@ResponseStatus
	public ResponseEntity<State> updateState(@PathVariable Long id, @RequestBody State state) {
		State upadateState = StateRepository.StateFindById(id);
		BeanUtils.copyProperties(state, upadateState);
		StateRepository.newStateByUpdate(upadateState);
		return ResponseEntity.ok(upadateState);
	}

}
