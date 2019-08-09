package com.bae.pokeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.pokeapi.service.SourceService;

@RestController
@RequestMapping("/Source")
public class SourceController {

	private SourceService service;

	@Autowired
	public SourceController(SourceService service) {
		this.service = service;
	}

	@GetMapping("/getPokemon/{pokemon}")
	public ResponseEntity<Object> findPokemon(@PathVariable String pokemon) {
		return new ResponseEntity<>(service.findPokemon(pokemon), HttpStatus.OK);
	}

	@GetMapping("/getType/{type}")
	public ResponseEntity<Object> findType(@PathVariable String type) {
		return new ResponseEntity<>(service.findType(type), HttpStatus.OK);
	}

	@GetMapping("/getAbility/{ability}")
	public ResponseEntity<Object> findAbility(@PathVariable String ability) {
		return new ResponseEntity<>(service.findAbility(ability), HttpStatus.OK);
	}

}
