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
	 * �û����е�½
	 * @param phone
	 * @param password
	 * @return
	 * @author ���
	 * @date 2016��8��16��
	 */	
	public User login(String phone, String password) throws UserException {
		//1.�����ֻ����Ƿ����
		User db_User = qu7UserDao.getUserByPhone(phone);
		//2.��������ڣ��򴴽�һ���û���¼�����绰��Ž�ȥ
		if(db_User==null){
			db_User = new User();
			db_User.setPhone(phone);
			db_User.setPwd(password);
			qu7UserDao.save(db_User);
		}else{
			//3.������ڣ���Ƚ�
		}
		
		
		return null;
	}

}
