package com.rightsallocate.dao;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Resource;
import com.rightsallocate.common.GetEntityClassUtil;

public abstract class AbstractBaseDao<T, PK extends Serializable> implements
		BaseDao<T, PK> {
	
	@Resource
	private Idao<T, PK> iDao;
	@Resource(name="pageDao")
	private PageDaoImpl pageDao;
	
	
	
	public PageDaoImpl getPageDao() {
		return pageDao;
	}

	public void setPageDao(PageDaoImpl pageDao) {
		this.pageDao = pageDao;
	}
	
	public Class<T> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	private Class<T> entityClass = GetEntityClassUtil.getEntityClass(getClass());
	public void save(T entity) {
		iDao.save(entity);
	}
	
	public List<T> findByHql(String hql){
		return iDao.findByHql(hql);
	}

	public void delete(PK... pks) {
		iDao.delete(entityClass, pks);
	}

	public T findById(PK pk) {
		return iDao.findById(entityClass, pk);
	}

	public List<T> findAll() {
		return iDao.findAll(entityClass);
	}

	public void update(T entity) {
		iDao.update(entity);
	}

	public Idao<T, PK> getiDao() {
		return iDao;
	}

	public void setiDao(Idao<T, PK> iDao) {
		this.iDao = iDao;
	}

}
