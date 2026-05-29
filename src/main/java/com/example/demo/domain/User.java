package com.example.demo.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
//data anotatios indicates lombok library that generates all the getters and the setters for this class
@Data
@AllArgsConstructor
public class User {
	
	//fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String password;
	private double balance;
	private String age;
	private int phonenumber;
	private boolean isActive;
	private String gender;
	private String description;
	
	
	
	
	



	//constructors
	


	public User(long id) {
		this.id = id;
	}


	
	
	
	
	

}
