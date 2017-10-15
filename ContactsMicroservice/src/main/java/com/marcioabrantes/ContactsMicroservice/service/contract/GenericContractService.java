package com.marcioabrantes.ContactsMicroservice.service.contract;

import java.util.List;


public interface GenericContractService<T> {
	public void create(T entity);
	public T getById(long id);
	public T update(T entity);
	public void deleted(long id);
	public List<T> getList();

}
