package com.bae.pokeapi.service;

import org.springframework.stereotype.Service;

@Service
public interface SourceService {

	public Object findPokemon(String pokemon);

	public Object findType(String type);

	public Object findAbility(String ability);

}
