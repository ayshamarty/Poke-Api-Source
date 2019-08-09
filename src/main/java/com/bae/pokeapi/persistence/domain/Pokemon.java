package com.bae.pokeapi.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pokemon {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String ability;
	private String type;

	public Pokemon(Long id, String name, String ability, String type) {
		super();
		this.id = id;
		this.name = name;
		this.ability = ability;
		this.type = type;
	}

	public Pokemon() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}