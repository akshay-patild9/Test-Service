package com.test.TestService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.TestService.domain.Country;
import com.test.TestService.repository.TestRepository;

@Service
public class TestService {
	
	@Autowired
	TestRepository repository;

	public Country getCountryName() {
		
		
		//return repository.findByCode("IND");
		return repository.findByName("INDIA");
		
	}

}
