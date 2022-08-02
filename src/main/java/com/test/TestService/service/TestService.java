package com.test.TestService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.TestService.domain.Country;
import com.test.TestService.repository.TestRepository;

@Service
public class TestService {
	
	@Autowired
	TestRepository repository;

	public Country getCountryCode(String code) {

		return repository.findByCode(code);
		//return repository.findByName("INDIA");
		
	}

	public Country addCountry(Country country) {
		
		return repository.save(country);
	}

	public Country updateCountry(Country country) {
		
		Country oldCountry = getCountryCode(country.getCode());
		oldCountry.setName(country.getName());
		repository.save(oldCountry);
		return oldCountry;
	}

	public void deleteCountry(String code) {

		Country oldCountry = getCountryCode(code);
		repository.delete(oldCountry);;
	}

	


}
