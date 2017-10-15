package com.marcioabrantes.ContactsMicroservice.domain.builder;

import java.util.Date;

import com.marcioabrantes.ContactsMicroservice.domain.BaseClass;

public abstract class BaseClassBuilder {
	private BaseClass baseClass;
	
	public BaseClassBuilder withId(long id) {
		this.baseClass.setId(id);
		return this;
	}
	
	public BaseClassBuilder withDescription(String description) {
		this.baseClass.setDescription(description);
		return this;
	}
	
	public BaseClassBuilder withDateInput(Date dateInput) {
		this.baseClass.setDateInput(dateInput);
		return this;
	}
	
	public BaseClassBuilder withDateDelete(Date dateDelete) {
		this.baseClass.setDateDelete(dateDelete);
		return this;
	}
	
	public BaseClass build() {
		return this.baseClass;
	}

}
