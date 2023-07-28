package com.methcook.methacademy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

// write @Entity then mouse-over and pick the "jakarta" persistence option for both 
@Entity
@Table(name = "students")
public class Student {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	//right-click > source > 
	
	//right-click > Source > Generate Getters and Setters 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
