package com.bae.pokeapi.service;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.pokeapi.persistence.domain.Pokemon;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SourceServiceMockitoTests {

	@InjectMocks
	SourceServiceImplementation service;

	@Mock
	RestTemplate restTemplate;

	private static final Object MOCK_POKEMON = new Pokemon(1L, "bulbasaur", "chlorophyll", "grass");

//	@Test
//	public void findByPokemonTest() {
//		Mockito.when(restTemplate
//				.exchange("https://pokeapi.co/api/v2/pokemon/bulbasaur", HttpMethod.GET, null, Object.class).getBody())
//				.thenReturn(MOCK_POKEMON);
//		assertEquals(MOCK_POKEMON, service.findPokemon("bulbasaur"));
//	}

//	@Test
//	public void findByTypeTest() {
//		Mockito.when(service.findType("grass")).thenReturn(MOCK_POKEMON);
//		assertEquals(MOCK_POKEMON, controller.findType("grass").getBody());
//	}
//
//	@Test
//	public void findByAbilityTest() {
//		Mockito.when(service.findAbility("chlorophyll")).thenReturn(MOCK_POKEMON);
//		assertEquals(MOCK_POKEMON, controller.findAbility("chlorophyll").getBody());
//	}

}