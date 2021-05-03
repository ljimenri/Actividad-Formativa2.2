package com.everis.data.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.data.models.Persona;
import com.everis.data.services.PersonaService;

@RestController
public class ApiController {
	
	@Autowired
	PersonaService personaservice;
	
	@RequestMapping("/personas/eliminar/{id}")
	public String eliminarPersonas(@PathVariable("id") Long id) {	
		personaService.deleteById(id);
		return "Persona eliminada";
	}
	
	@Autowired
	PersonaService personaService;
	
	@RequestMapping("/api/personas/lista")
	public List<Persona> listaPersonas(){
		List<Persona> personasLista = personaService.ListAll();
		return personasLista;
	}
	@Autowired
	PersonaService personaService;
	
	@RequestMapping("/api/personas/editar")
	public Optional<Persona> editarPersona(@PathVariable("id") Long id,
			Model model) {
		Optional<Persona> persona = personaService.findById(id);
		model.addAttribute("persona", persona);
		return persona;
	}
	
	@RequestMapping("/api/personas/actualizar/")
	public Persona actualizarPersona(@Valid @ModelAttribute("persona") Persona persona
			) {
		Optional<Persona> persona1 = personaService.findById(persona.getId());
		personaService.updatePersona(persona);
		return persona;
	}

}
