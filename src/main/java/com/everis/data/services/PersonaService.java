package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Persona;
import com.everis.data.repositories.PersonaRepository;

@Service
public class PersonaService {
	@Autowired
	PersonaRepository personaRepository;

	// GUARDA UNA PERSONA
	public Persona guardarPersona(Persona persona) {

		return personaRepository.save(persona);
	}

	// OBTIENE TODAS LAS PERSONAS
	public List<Persona> allPersonas() {
		return personaRepository.findAll();
	}

	// ENCUENTRA UNA PERSONA POR ID
	public Optional<Persona> findById(Long id) {
		Optional<Persona> persona = personaRepository.findById(id);
		return persona;
	}

	// BORRAR PERSONA POR ID
	public void deleteById(Long id) {
		personaRepository.deleteById(id);
	}

	// ACTUALIZAR PERSONA POR ID
	public Persona actualizarPersona(@Valid Persona persona) {

		return personaRepository.save(persona);
	}
}
