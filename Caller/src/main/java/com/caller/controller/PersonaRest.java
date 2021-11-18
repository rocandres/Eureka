package com.caller.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.caller.reponse.ResponseCda;



@FeignClient(name = "ServicioPersona")
@RequestMapping("cda")
public interface PersonaRest {
	
	@RequestMapping(value = "persona/"
			+ "{cedula}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getPersonaById(@PathVariable("cedula") String cedula);

}
