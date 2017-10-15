package com.marcioabrantes.ContactsMicroservice.application.response;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.marcioabrantes.ContactsMicroservice.domain.People;

@Component
public class PeopleResponse {
	@NotNull
	private People people;
	
	public PeopleResponse(People people) {
		this.people = people;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}
	
	

}
