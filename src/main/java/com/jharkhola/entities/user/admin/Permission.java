package com.jharkhola.entities.user.admin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "JHAR_PERMISSION" )
public class Permission {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	public int permissionId;
	
	public String permissionName;
	
	public String permissionDescription;
	
	/*Getters and Setters*/
	
	public int getPermissionId() {
		return permissionId;
	}
	
	public void setPermissionId( final int permissionId ) {
		this.permissionId = permissionId;
	}
	
	public String getPermissionName() {
		return permissionName;
	}
	
	public void setPermissionName( final String permissionName ) {
		this.permissionName = permissionName;
	}
	
	public String getPermissionDescription() {
		return permissionDescription;
	}
	
	public void setPermissionDescription( final String permissionDescription ) {
		this.permissionDescription = permissionDescription;
	}
	
	/*Getters and Setters*/

}
