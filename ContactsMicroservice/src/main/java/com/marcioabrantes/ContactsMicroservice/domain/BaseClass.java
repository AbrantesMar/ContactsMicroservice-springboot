package com.marcioabrantes.ContactsMicroservice.domain;

import java.util.Date;

public abstract class BaseClass {
	private long id;
	private String description;
	private Date dateInput;
	private Date dateDelete;
	
	public BaseClass() {
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getDateInput() {
		return dateInput;
	}
	
	public void setDateInput(Date dateInput) {
		this.dateInput = dateInput;
	}
	
	public Date getDateDelete() {
		return dateDelete;
	}
	
	public void setDateDelete(Date dateDelete) {
		this.dateDelete = dateDelete;
	}
	

}
