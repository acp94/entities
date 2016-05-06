package com.jharkhola.entities.user.admin;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "JHAR_LOGIN_ATTEMPT" )
public class LoginAttempt {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	public int loginAttemptId;
	
	@Column(columnDefinition = "VARCHAR(255) NOT NULL DEFAULT 'NOT_APPLICABLE'")
	public String accountName;
	
	public String password;
	
	public String ipNumber;
	
	public String browserType;
	
	@Column(nullable = false, columnDefinition = "bit(1) default 0 not null")
    private Boolean success;
	
	public Timestamp createDate;
	
	
	/*========================Getters and Setters==========================*/
	public int getLoginAttemptId() {
		return loginAttemptId;
	}
	
	public void setLoginAttemptId( final int loginAttemptId ) {
		this.loginAttemptId = loginAttemptId;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName( final String accountName ) {
		this.accountName = accountName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword( final String password ) {
		this.password = password;
	}
	
	public String getBrowserType() {
		return browserType;
	}
	
	public boolean getSuccess() {
		return success;
	}
	
	public void setSuccess( final boolean success ) {
		this.success = success;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate( final Timestamp createDate) {
		this.createDate = createDate;
	}
	
	
	/*========================Getters and Setters==========================*/
	
}
