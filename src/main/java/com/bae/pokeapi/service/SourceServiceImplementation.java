package com.bae.pokeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SourceServiceImplementation implements SourceService {

	private RestTemplate restTemplate;

	@Autowired
	public SourceServiceImplementation(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public Object findPokemon(String pokemon) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<Object> pokemonToFind = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/" + pokemon,
				HttpMethod.GET, entity, Object.class);
		Object pokemonFound = pokemonToFind.getBody();
		return pokemonFound;

	}

// might need this instead for tests
//	@Override
//	public Object findPokemon(String pokemon) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("user-agent",
//				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
//		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//
//		Object pokemonToFind = restTemplate
//				.exchange("https://pokeapi.co/api/v2/pokemon/" + pokemon, HttpMethod.GET, entity, Object.class)
//				.getBody();
//		return pokemonToFind;
//
//	}

	@Override
	public Object findType(String type) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<Object> typeToFind = restTemplate.exchange("https://pokeapi.co/api/v2/type/" + type,
				HttpMethod.GET, entity, Object.class);
		Object typeFound = typeToFind.getBody();
		return typeFound;
	}

	@Override
	public Object findAbility(String ability) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<Object> abilityToFind = restTemplate.exchange("https://pokeapi.co/api/v2/ability/" + ability,
				HttpMethod.GET, entity, Object.class);
		Object abilityFound = abilityToFind.getBody();
		return abilityFound;
	}

}
