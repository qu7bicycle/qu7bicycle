package com.qu7bicycle.service;

import com.qu7bicycle.dao.BaseDao;
import com.qu7bicycle.exception.UserException;
import com.qu7bicycle.model.User;

public interface UserService extends BaseDao<User, Integer> {

	/**
	 * 用户登录
	 * @return
	 * @throws UserException
	 * @author 张昊
	 * @date 2016年8月16日
	 */
	public User login(String phone,String password) throws UserException;
	
}
