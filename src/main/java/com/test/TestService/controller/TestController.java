package com.test.TestService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/servertest")
	public ResponseEntity<String> testApi(){
		
		
		 return new ResponseEntity<>("Server is up!!!", HttpStatus.OK);
	}
}