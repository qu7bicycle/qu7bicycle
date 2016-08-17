package com.qu7bicycle.service;

import com.qu7bicycle.dao.BaseDao;
import com.qu7bicycle.exception.UserException;
import com.qu7bicycle.model.User;

public interface UserService extends BaseDao<User, Integer> {

	/**
	 * �û���¼
	 * @return
	 * @throws UserException
	 * @author ���
	 * @date 2016��8��16��
	 */
	public User login(String phone,String password) throws UserException;
	
}
