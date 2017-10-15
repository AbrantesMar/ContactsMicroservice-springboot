package com.marcioabrantes.ContactsMicroservice.domain.repository.contract;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface RepositoryGenericsContract<T> {
	public void create(T entiry);
	public T getById(long id);
	public T update(T entity);
	public void deleted(long id);
	public List<T> getList();
}
