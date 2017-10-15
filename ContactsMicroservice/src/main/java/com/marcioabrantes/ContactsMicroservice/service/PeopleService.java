package com.marcioabrantes.ContactsMicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcioabrantes.ContactsMicroservice.domain.People;
import com.marcioabrantes.ContactsMicroservice.domain.repository.PeopleRepository;
import com.marcioabrantes.ContactsMicroservice.service.contract.PeopleServiceContract;

@Service
public class PeopleService extends GenericService<People> implements PeopleServiceContract{
	
	@Autowired
	public PeopleService(PeopleRepository people) {
		super(people);
	}

}
