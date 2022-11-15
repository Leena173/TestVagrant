package com.Assessment.pojo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/*
 * This pojo class used to deserialize players details 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class playerDetails {
	String name;
	String country;
	String role;
	String price_in_crores;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	public String getPrice_in_crores() {
		return price_in_crores;
	}

	public void setPrice_in_crores(String price_in_crores) {
		this.price_in_crores = price_in_crores;
	}

	public playerDetails(String name, String country, String role, String price_in_crores) {
		this.name = name;
		this.country = country;
		this.role = role;
		this.price_in_crores = price_in_crores;
	}

	public playerDetails() {

	}

}
