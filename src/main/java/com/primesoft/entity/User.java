package com.primesoft.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="users",schema="food_truck")
public class User implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;  
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, unique = true, length=45)
	private String email;
	
	@Column(nullable = false, length = 64)
	private String password;
	
	@Column(name= "first_name", nullable = false, length=20)
	private String firstName;
	
	@Column(name = "last_name", nullable = false, length = 20)
	private String lastName;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	@Override
	public String toString() {
		return "User [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
