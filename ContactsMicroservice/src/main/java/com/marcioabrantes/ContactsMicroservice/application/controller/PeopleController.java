package com.marcioabrantes.ContactsMicroservice.application.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.marcioabrantes.ContactsMicroservice.application.request.PeopleRequest;
import com.marcioabrantes.ContactsMicroservice.application.resource.PeopleResource;
import com.marcioabrantes.ContactsMicroservice.application.response.PeopleResponse;
import com.marcioabrantes.ContactsMicroservice.domain.builder.PeopleBuilder;
import com.marcioabrantes.ContactsMicroservice.service.PeopleService;

@RestController
public class PeopleController implements PeopleResource{
	private PeopleService peopleService;
	
	@Autowired
	public PeopleController(PeopleService peopleService) {
		this.peopleService = peopleService;
	}

	@Override
	public ResponseEntity<?> create(PeopleRequest entity) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok("Requisão Ok");
	}

	@Override
	public ResponseEntity<PeopleResponse> getById(long id) {
		// TODO Auto-generated method stub
		
		return ResponseEntity.ok(new PeopleResponse(new PeopleBuilder().build()));
	}

	@Override
	public ResponseEntity<PeopleResponse> update(PeopleRequest entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> deleted(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<PeopleResponse>> getList() {
		// TODO Auto-generated method stub
		
		return ResponseEntity.ok(new ArrayList<PeopleResponse>());
	}

	
	
	
}
