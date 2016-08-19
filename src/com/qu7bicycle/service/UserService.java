package com.qu7bicycle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qu7bicycle.dao.Qu7UserDao;
import com.qu7bicycle.exception.UserException;
import com.qu7bicycle.model.User;

@Service
public class UserService {
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
	public User loginForPhone(String phone, String formCode,String trueCode) throws UserException {
		//0.检验是否合法
		if(phone==null||formCode==null||trueCode==null){
			throw new UserException("登录参数为空");
		}
		//1.检验手机号是否存在
		User db_User = qu7UserDao.getUserByPhone(phone);
		//2.如果不存在，则创建一条用户记录，将电话存放进去
		if(db_User==null){
			db_User = new User();
			db_User.setPhone(phone);
			db_User.setMoney(0);
			qu7UserDao.save(db_User);
		}
		//3.比较电话验证短息和用户填写验证是是否一致
//		if(!formCode.equals(trueCode)){
//			throw new UserException("短信验证码错误");
//		}
		return db_User;
	}

}
