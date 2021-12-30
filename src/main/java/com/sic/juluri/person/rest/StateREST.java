package com.sic.juluri.person.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sic.juluri.person.model.State;
import com.sic.juluri.person.service.StateService;

@RestController
@RequestMapping ("/state/")
public class StateREST {
	
	@Autowired
	private StateService estadoService;
	
	@GetMapping ("{id}")
	private ResponseEntity<List<State>> getAllEstadosByPais (@PathVariable("id") Long idPais){
		return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
		
	}
}