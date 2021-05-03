package com.everis.data.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.everis.data.models.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
	List<Persona> findAll();
}
