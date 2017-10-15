package com.marcioabrantes.ContactsMicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcioabrantes.ContactsMicroservice.domain.repository.contract.RepositoryGenericsContract;
import com.marcioabrantes.ContactsMicroservice.service.contract.GenericContractService;

@Service
public abstract class GenericService<T> implements GenericContractService<T>{
	protected RepositoryGenericsContract repository;
	
	@Autowired
	public GenericService(RepositoryGenericsContract<T> repository) {
		this.repository = repository;
	}
	
	@Override
	public void create(T entity) {
		// TODO Auto-generated method stub
		this.repository.create(entity);
	}

	@Override
	public T getById(long id) {
		// TODO Auto-generated method stub
		return (T) this.repository.getById(id);
	}

	@Override
	public T update(T entity) {
		// TODO Auto-generated method stub
		return (T) this.repository.update(entity);
	}

	@Override
	public void deleted(long id) {
		// TODO Auto-generated method stub
		this.repository.deleted(id);
	}

	@Override
	public List<T> getList() {
		// TODO Auto-generated method stub
		return this.repository.getList();
	}

}
