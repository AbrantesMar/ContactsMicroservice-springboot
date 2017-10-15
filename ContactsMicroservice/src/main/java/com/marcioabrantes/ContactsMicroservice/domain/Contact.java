package com.marcioabrantes.ContactsMicroservice.domain;

public class Contact extends BaseClass {
	private eCategory category;

	public eCategory getCategory() {
		return category;
	}

	public void setCategory(eCategory category) {
		this.category = category;
	}
	
}
