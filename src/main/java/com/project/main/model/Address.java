package com.project.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String country;
	private String city;
	private String state;
	private String pinCode;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Person user;
	
	public Person getPerson() {
		return user;
	}
	public void setPerson(Person user) {
		this.user = user;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public Address(String country, String city, String state, String pinCode, Person user) {
		super();
		this.country = country;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.user = user;
	}
	public Address() {
		
	}
}
