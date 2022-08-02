package com.test.TestService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.TestService.domain.Country;
import com.test.TestService.service.TestService;

@RestController
public class CrudController {
	
	@Autowired
	TestService service;
	
	
	@GetMapping("/test")
	public ResponseEntity<String> testApi(){
		 return new ResponseEntity<>("testtt!!!", HttpStatus.OK);
	}
	
	@GetMapping("/getName")
	public ResponseEntity<Country> getName(){
		Country country = service.getCountryName();
		
		 return ResponseEntity.ok(country);
	}

}
