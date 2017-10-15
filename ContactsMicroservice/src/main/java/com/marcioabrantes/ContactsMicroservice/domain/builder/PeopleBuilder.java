package com.marcioabrantes.ContactsMicroservice.domain.builder;

import java.util.Date;
import java.util.List;

import com.marcioabrantes.ContactsMicroservice.domain.Contact;
import com.marcioabrantes.ContactsMicroservice.domain.People;

public class PeopleBuilder extends BaseClassBuilder {
	private People people;
	
	public PeopleBuilder() {
		this.people = new People();
	}
	
	public PeopleBuilder withName(String name) {
		this.people.setName(name);
		return this;
	}
		
	public PeopleBuilder withBirthDate(Date birthDate) {
		this.people.setBirthDate(birthDate);
		return this;
	}
	
	public PeopleBuilder withContacts(List<Contact> contacts) {
		this.people.setContacts(contacts);
		return this;
	}
	
	public People build() {
		return this.people;
	}
}
