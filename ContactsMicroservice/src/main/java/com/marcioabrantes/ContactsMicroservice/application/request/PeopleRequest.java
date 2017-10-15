package com.marcioabrantes.ContactsMicroservice.application.request;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.marcioabrantes.ContactsMicroservice.domain.People;

@Component
public class PeopleRequest {
	@NotNull
	private People people;
	
	public PeopleRequest(People people) {
		this.people = people;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}
	
	

}
