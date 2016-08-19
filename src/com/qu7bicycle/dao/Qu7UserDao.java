package com.qu7bicycle.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.qu7bicycle.model.User;

@Repository
public class Qu7UserDao extends BaseDAO<User>{
	
	/**
	 * �����û����ֻ��ŷ����û�
	 * @return
	 * @author ���
	 * @date 2016��8��19��
	 */
	public User getUserByPhone(String phone){
		String hql = "FROM User WHERE phone =?";
		Query query = getSession().createQuery(hql);
		query.setParameter(1, phone);
		List<User> list = query.list();
		return list.size()==0?null:list.get(0);
	}
	
}
