package com.demerson.SpringFood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demerson.SpringFood.domain.entity.State;
import com.demerson.SpringFood.domain.repository.StateRepository;


@RestController
@RequestMapping(value = "/States")
public class StateController {
  
	@Autowired
	private StateRepository StateRepository;
	
	@GetMapping
	public List<State> findAll(){
		return StateRepository.StateFindAll();
	}
}
