package com.dao.retail;

import java.io.Serializable;
import java.util.List;

public interface RetailDao<T,id extends Serializable> {
	public void persist(T entity);
	public T findById(id id);
	public List<T> findAll();
	public T findByName(String name);
    
}
