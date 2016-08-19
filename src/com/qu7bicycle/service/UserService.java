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
	 * �û����е�½
	 * @param phone
	 * @param password
	 * @return
	 * @author ���
	 * @date 2016��8��16��
	 */	
	public User loginForPhone(String phone, String formCode,String trueCode) throws UserException {
		//0.�����Ƿ�Ϸ�
		if(phone==null||formCode==null||trueCode==null){
			throw new UserException("��¼����Ϊ��");
		}
		//1.�����ֻ����Ƿ����
		User db_User = qu7UserDao.getUserByPhone(phone);
		//2.��������ڣ��򴴽�һ���û���¼�����绰��Ž�ȥ
		if(db_User==null){
			db_User = new User();
			db_User.setPhone(phone);
			db_User.setMoney(0);
			qu7UserDao.save(db_User);
		}
		//3.�Ƚϵ绰��֤��Ϣ���û���д��֤���Ƿ�һ��
//		if(!formCode.equals(trueCode)){
//			throw new UserException("������֤�����");
//		}
		return db_User;
	}

}
