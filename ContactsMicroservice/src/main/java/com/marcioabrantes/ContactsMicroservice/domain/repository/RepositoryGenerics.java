package com.marcioabrantes.ContactsMicroservice.domain.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcioabrantes.ContactsMicroservice.domain.repository.contract.RepositoryGenericsContract;

@Repository
public abstract class RepositoryGenerics<T> implements RepositoryGenericsContract<T> {
	private T entity;
	
	@Autowired
	public RepositoryGenerics(T entity) {
		this.entity = entity;
	}
	
	public void create(T entiry) {
		
	}
	public T getById(long id) {
		return entity;
	}
	public T update(T entity) {
		return entity;
	}
	
	public void deleted(long id) {
		
	}
	
	public List<T> getList(){
		return new ArrayList<T>();
	}
}