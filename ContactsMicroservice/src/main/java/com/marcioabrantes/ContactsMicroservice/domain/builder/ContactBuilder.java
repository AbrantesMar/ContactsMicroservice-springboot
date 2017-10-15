package com.marcioabrantes.ContactsMicroservice.domain.builder;

import com.marcioabrantes.ContactsMicroservice.domain.Contact;
import com.marcioabrantes.ContactsMicroservice.domain.eCategory;

public class ContactBuilder extends BaseClassBuilder {
	private Contact contact;
	
	public ContactBuilder() {
		contact = new Contact();
	}
	
	public ContactBuilder withCategory(eCategory category) {
		this.contact.setCategory(category);
		return this;
	}
	
	public Contact build() {
		return this.contact;
	}
}
