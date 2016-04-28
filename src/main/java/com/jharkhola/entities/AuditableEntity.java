package com.jharkhola.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public class AuditableEntity {
	
	@Column( insertable = true, updatable = false )
	private Timestamp createDate;
	
	@Column( insertable = true, updatable = true )
	private Timestamp updateDate;
	
	@Column
	private int version;
	
	/*==============Getters and Setters==================*/
	
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate( final Timestamp createDate ) {
		this.createDate = createDate;
	}
	
	public Date getUpdateDate() {
		return updateDate;
	}
	
	public void setUpdateDate( Timestamp updateDate ) {
		this.updateDate = updateDate;
	}
	
	public int getVersion() {
		return version;
	}
	
	public void setVersion( int version ) {
		this.version = version;
	}
	
	/*==============Getters and Setters==================*/
	
	@PrePersist
	public void onCreate() {
		Date now = new Date();
		this.setCreateDate(new Timestamp(now.getTime()));
		this.setUpdateDate(new Timestamp(now.getTime()));
		this.setVersion(1);
	}
	
	@PreUpdate
	public void onPersist() {
		this.setUpdateDate(new Timestamp(new Date().getTime()));
		this.setVersion(this.getVersion()+1);
	}
}
