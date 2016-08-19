package com.qu7bicycle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qu7bicycle.dao.AbstractBaseDao;
import com.qu7bicycle.dao.Qu7UserDao;
import com.qu7bicycle.exception.UserException;
import com.qu7bicycle.model.User;

@Service
@Transactional
public class UserServiceImpl extends AbstractBaseDao<User, Integer> implements UserService {
	
	@Autowired
	private Qu7UserDao qu7UserDao;
	
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
		User db_User = qu7UserDao.getUserByPhone(phone);
		//2.如果不存在，则创建一条用户记录，将电话存放进去
		if(db_User==null){
			db_User = new User();
			db_User.setPhone(phone);
			db_User.setPwd(password);
			qu7UserDao.save(db_User);
		}else{
			//3.如果存在，则比较
		}
		
		
		return null;
	}

}
