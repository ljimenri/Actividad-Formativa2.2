package com.everis.data.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.data.services.PersonaService;

@Controller
public class PersonaController {

	@Autowired
	PersonaService personaService;

	@RequestMapping("/personas")
	public String persona(@RequestParam(value = "nombre") String nombre,
			@RequestParam(value = "apellido") String apellido, @RequestParam(value = "email") String email,
			@RequestParam(value = "correo") String correo) {

		return "index.jsp";
	}

}
