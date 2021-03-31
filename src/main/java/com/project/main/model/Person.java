package com.project.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String fName;
	private String lName;
	private Integer age;
	private String role;
	private String password;
	
	
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	@OneToOne(cascade=CascadeType.ALL)
//	private Address address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
	
	public Person(Integer id, String fName, String lName, Integer age, String role, String password, Address address) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.role = role;
		this.password = password;
		//this.address = address;
	}
	public Person() {}
	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", role=" + role
				+ ", password=" + password + "]";
	}
	//@Override
//	public String toString() {
//		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", role=" + role
//				+ ", password=" + password + ", address=" + address + "]";
//	}
	
	
	
}
