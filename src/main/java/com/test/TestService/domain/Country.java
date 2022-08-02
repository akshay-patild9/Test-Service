package com.test.TestService.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Country")
public class Country {

	@Id
	@Column(name = "Code")
	private String code;

	@Column(name = "Name")
	private String name;

	@Column
	private String Continent;

	@Column(name = "Region")
	private String region;
	
	@Column(name = "SurfaceArea")
	private BigDecimal surfaceArea;
	
	@Column(name = "IndepYear")
	private Long indepYear;

	@Column(name = "Population")
	private String population;
	
	@Column(name = "LifeExpectancy")
	private BigDecimal lifeExpectancy;
	
	@Column(name = "GNP")
	private Double gnp;
	
	@Column(name = "GNPOld")
	private Double GNPOld;
	
	@Column(name = "LocalName")
	private String localName;
	
	@Column(name = "GovernmentForm")
	private String governmentForm;
	
	@Column(name = "HeadOfState")
	private String headOfState;
	
	@Column(name = "Capital")
	private Integer capital;
	
	@Column(name = "Code2")
	private String code2;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return Continent;
	}

	public void setContinent(String continent) {
		Continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public BigDecimal getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(BigDecimal surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public Long getIndepYear() {
		return indepYear;
	}

	public void setIndepYear(Long indepYear) {
		this.indepYear = indepYear;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public BigDecimal getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(BigDecimal lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public Double getGnp() {
		return gnp;
	}

	public void setGnp(Double gnp) {
		this.gnp = gnp;
	}

	public Double getGNPOld() {
		return GNPOld;
	}

	public void setGNPOld(Double gNPOld) {
		GNPOld = gNPOld;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	
	
}
