package com.jharkhola.entities.management;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "JHAR_ROLE" )
public class Role {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;
	
	
	private String roleName;
	
	/*==================Getters and Setters==========================*/
	
	public int getId() {
		return id;
	}
	
	public void setId(final int id) {
		this.id = id;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(final String roleName) {
		this.roleName = roleName;
	}
	
	/*==================Getters and Setters==========================*/

}
