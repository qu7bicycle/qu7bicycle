package com.qu7bicycle.dao;

import java.io.Serializable;
import java.util.List;


public interface Idao<T,PK extends Serializable> {
	
	public void save(T entity);
	
	public void delete(Class<T> entityClass,PK... pks);
	
	public void update(T entity);
	
	public List<T> findAll(Class<T> entityClass);
	
	public T findById(Class<T> entityClass,PK pk);
	
	public List<T> findByHql(String hql);

}
