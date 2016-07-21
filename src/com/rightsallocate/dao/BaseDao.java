package com.rightsallocate.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface BaseDao<T,PK extends Serializable> {

	public void save(T entity);
	public void delete(PK...pks);
	public T findById(PK pk);
	public List<T> findAll();
	public void update(T entity);
	public List<T> findByHql(String hql);
}
