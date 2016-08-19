package com.qu7bicycle.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ������һЩͨ�õ�CRUD���� ��Ҫ�������̳�
 * @author ������
 * @param <T>Ҫ������ʵ����
 */
public abstract class BaseDAO<T> {
	@Autowired
	private SessionFactory sessionFactory;
	private Class<T> clazz;

	@SuppressWarnings("unchecked")
	public BaseDAO() {
		ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];
	}

	/**
	 * ����һ��ʵ��
	 * @param t Ҫ�����ʵ��
	 * @return �������֮���ʵ��
	 */
	public Integer save(T t) {
		return (Integer) getSession().save(t);
	}

	/**
	 * ������߸���һ��ʵ��
	 * @param t Ҫ������߸��µ�ʵ��
	 * @return ������߸���֮���ʵ��
	 */
	public void saveOrUpdate(T t) {
		getSession().saveOrUpdate(t);
	}
	
	/**
	 * ����һ��ʵ����
	 * @param t Ҫ���µ�ʵ��
	 */
	public void update(T t){
		getSession().update(t);
	}

	/**
	 * ɾ��һ��ʵ��
	 * @param t Ҫɾ����ʵ��, ֻ��ҪID�Ϳ�����
	 */
	public void delete(T t) {
		getSession().delete(t);
	}

	/**
	 * ��ȡһ��ʵ��
	 * @param id  ʵ�������ݿ��ж�Ӧ��ID
	 * @return ʵ����
	 */
	public T get(Integer id) {
		return getSession().get(clazz, id);
	}

	/**
	 * ��ȡһ��ͳ��ֵ
	 * @return
	 */
	protected Object getForValue(String hql, Object... args) {
		Query query = getSession().createQuery(hql);
		for (int i = 0; i < args.length; i++) {
			query.setParameter(i, args[i]);
		}
		return query.uniqueResult();
	}

	/**
	 * ���ݴ����HQL, �������Ĳ�ѯ����
	 * @return ��������������
	 */
	@SuppressWarnings("unchecked")
	protected List<T> getByHQL(String hql, Object... args) {
		Query query = getSession().createQuery(hql);
		query.setCacheable(true);
		for (int i = 0; i < args.length; i++) {
			query.setParameter(i, args[i]);
		}
		return query.list();
	}


	/**
	 * �Żص�ǰ�߳��е�Session
	 * @return
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}
