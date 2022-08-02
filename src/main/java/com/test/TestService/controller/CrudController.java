package com.test.TestService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/getName/{code}")
	public ResponseEntity<Country> getName(@PathVariable String code){
		Country country = service.getCountryCode(code);
		
		 return ResponseEntity.ok(country);
	}
	
	@PostMapping("/addCountry")
	public ResponseEntity<Country> addCountry(@RequestBody Country country)
	{
		country = service.addCountry(country);
		return new ResponseEntity<>(country , HttpStatus.OK);
		
	}
	
	@PutMapping("/updateCountry")
	public ResponseEntity<Country> updateCountry(@RequestBody Country country){
		
		country = service.updateCountry(country);
		
		return new ResponseEntity<Country>(country, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteCountry/{code}")
	public ResponseEntity<String> deleteCountry(@RequestParam String code){
		
		service.deleteCountry(code);
		
		return new ResponseEntity<String>("country deleted="+code, HttpStatus.OK);
	}
	
	
	
	

}
