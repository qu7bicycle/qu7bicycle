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
	 * �û����е�½
	 * @param phone
	 * @param password
	 * @return
	 * @author ���
	 * @date 2016��8��16��
	 */	
	public User login(String phone, String password) throws UserException {
		//1.�����ֻ����Ƿ����
		
		//2.��������ڣ��򴴽�һ���û���¼�����绰��Ž�ȥ
		
		//3.������ڣ���Ƚ�
		
		return null;
	}

}
