package com.qu7bicycle.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

@Service
public class IdaoImpl<T,PK extends Serializable> extends HibernateDaoSupport implements Idao<T, PK>{

	public void save(T entity) {
		getHibernateTemplate().save(entity);
	}

	public void delete(Class<T> entityClass, PK... pks) {
		for (PK pk : pks) {
			getHibernateTemplate().delete(getHibernateTemplate().load(entityClass, pk));
		}
	}

	public void update(T entity) {
		getHibernateTemplate().update(entity);
	}

	public List<T> findAll(Class<T> entityClass) {
		String hql = "from "+entityClass.getName(); 
		return getHibernateTemplate().find(hql);
	}

	public T findById(Class<T> entityClass, PK pk) {
		return (T) getHibernateTemplate().get(entityClass, pk);
	}
	
	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}


	public List<T> findByHql(String hql) {
		return getHibernateTemplate().find(hql);
	}
	
}
