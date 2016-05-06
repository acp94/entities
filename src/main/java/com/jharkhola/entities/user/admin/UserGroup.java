package com.jharkhola.entities.user.admin;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "JHAR_USER_GROUP" )
public class UserGroup {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int userGroupId;
	
	private String groupName;
	
	private String groupDescription;
	
	@OneToMany( fetch = FetchType.LAZY, mappedBy = "permissionId")
	private Set<Permission> permissions; 
	
	/*=====================Getters and Setters========================*/
	
	public void setUserGroupId( final int userGroupId ) {
		this.userGroupId = userGroupId;
	}
	
	public int getUserGroupId() {
		return userGroupId;
	}
	
	public void setGroupName( final String groupName ) {
		this.groupName = groupName;
	}
	
	public String getGroupName() {
		return groupName;
	}
	
	public String getGroupDescription() {
		return groupDescription;
	}
	
	public void setGroupDescription( final String groupDescription ) {
		this.groupDescription = groupDescription;
	}
	
	/*=====================Getters and Setters========================*/

}
