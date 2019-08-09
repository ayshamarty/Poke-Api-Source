package com.bae.pokeapi.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.pokeapi.persistence.domain.Pokemon;
import com.bae.pokeapi.service.SourceService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SourceControllerMockitoTests {

	@InjectMocks
	SourceController controller;

	@Mock
	SourceService service;

	private static final Object MOCK_POKEMON = new Pokemon(1L, "bulbasaur", "chlorophyll", "grass");

	@Test
	public void findByPokemonTest() {
		Mockito.when(service.findPokemon("bulbasaur")).thenReturn(MOCK_POKEMON);
		assertEquals(MOCK_POKEMON, controller.findPokemon("bulbasaur").getBody());
	}

	@Test
	public void findByTypeTest() {
		Mockito.when(service.findType("grass")).thenReturn(MOCK_POKEMON);
		assertEquals(MOCK_POKEMON, controller.findType("grass").getBody());
	}

	@Test
	public void findByAbilityTest() {
		Mockito.when(service.findAbility("chlorophyll")).thenReturn(MOCK_POKEMON);
		assertEquals(MOCK_POKEMON, controller.findAbility("chlorophyll").getBody());
	}

}
