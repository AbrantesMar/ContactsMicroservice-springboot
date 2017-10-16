package com.marcioabrantes.ContactsMicroservice.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.marcioabrantes.ContactsMicroservice.application.request.PeopleRequest;
import com.marcioabrantes.ContactsMicroservice.application.resource.PeopleResource;
import com.marcioabrantes.ContactsMicroservice.application.response.PeopleResponse;
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
		try {
			this.peopleService.create(entity.getPeople());
			return ResponseEntity.ok("Criado com sucesso").status(201).build();
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.badRequest().build();
		}
		
	}

	@Override
	public ResponseEntity<PeopleResponse> getById(long id) {
		// TODO Auto-generated method stub
		try {
			PeopleResponse peopleResponse = new PeopleResponse(this.peopleService.getById(id));
			return ResponseEntity.ok().body(peopleResponse);
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.badRequest().build();
		}
	}

	@Override
	public ResponseEntity<PeopleResponse> update(PeopleRequest entity) {
		// TODO Auto-generated method stub
		try {
			this.peopleService.update(entity.getPeople());
			return ResponseEntity.ok("Atualizado com sucesso").status(200).build();
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.badRequest().build();
		}
	}

	@Override
	public ResponseEntity<?> deleted(long id) {
		// TODO Auto-generated method stub
		try {
			this.peopleService.deleted(id);
			return ResponseEntity.ok("Deletado com sucesso").status(200).build();
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.badRequest().build();
		}
	}

	@Override
	public ResponseEntity<List<PeopleResponse>> getList() {
		// TODO Auto-generated method stub
		try {
			return ResponseEntity.ok(new ArrayList<PeopleResponse>());
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.badRequest().build();
		}
		
	}

	
	
	
}