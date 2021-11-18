package com.caller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping(path = "/call")
public class CallPersona {
	
	@Autowired
	PersonaRest persona;
	
	@ResponseStatus(HttpStatus.OK)
	@CrossOrigin
	@RequestMapping(value = "persona/"
			+ "{cedula}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getPersonaById(@PathVariable("cedula") String cedula) {
		
		try {
			System.out.println("Cedula:"+cedula);
			
			  
			
			return persona.getPersonaById(cedula);
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}

}
