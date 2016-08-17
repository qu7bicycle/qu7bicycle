package com.qu7bicycle.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qu7bicycle.dao.AbstractBaseDao;
import com.qu7bicycle.exception.UserException;
import com.qu7bicycle.model.User;

@Service
@Transactional
public class UserServiceImpl extends AbstractBaseDao<User, Integer> implements UserService {
	
	/**
	 * 用户进行登陆
	 * @param phone
	 * @param password
	 * @return
	 * @author 张昊
	 * @date 2016年8月16日
	 */	
	public User login(String phone, String password) throws UserException {
		//1.检验手机号是否存在
		
		//2.如果不存在，则创建一条用户记录，将电话存放进去
		
		//3.如果存在，则比较
		
		return null;
	}

}
