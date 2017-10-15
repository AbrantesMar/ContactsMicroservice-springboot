package com.marcioabrantes.ContactsMicroservice.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.marcioabrantes.ContactsMicroservice.domain.People;

@Component
public class PeopleRepository extends RepositoryGenerics<People> {
	@Autowired
	public PeopleRepository(People entity) {
		super(entity);
		// TODO Auto-generated constructor stub
	}

}
