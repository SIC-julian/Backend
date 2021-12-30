package com.sic.juluri.person.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sic.juluri.person.model.PC;
import com.sic.juluri.person.service.PCService;

@RestController
@RequestMapping ("/pc/")
public class PCREST {
	@Autowired
	private PCService pcService;
	
	@GetMapping
	private ResponseEntity<List<PC>> getAllPaises (){
		return ResponseEntity.ok(pcService.findAll());
	}	
}