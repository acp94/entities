package com.jharkhola.entities.management;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "JHAR_ACCOUNT" )
public class Account {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private long id;

	@Column( unique = true, nullable = false, length = 255)
	private String userName;
	
	@Column( unique = false, nullable = false, length = 255)
	private String hashedPassword;
	
	@Column( unique = true, nullable = false, length = 255)
	private String email;
	
	/*===================Getters and Setters===================*/
	public void setId( final long id ) {
		this.id = id;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setUserName( final String userName ) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setEmail( String email ) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	/*===================Getters and Setters===================*/
}
