package com.test.TestService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.TestService.domain.Country;

@Repository
public interface TestRepository extends JpaRepository<Country, String> {

	public Country findByCode(String code);
	public Country findByName(String name);
		

}
