package com.rightsallocate.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rightsallocate.common.MD5Util;
import com.rightsallocate.dao.AbstractBaseDao;
import com.rightsallocate.model.User;

@Service
@Transactional
public class UserServiceImpl extends AbstractBaseDao<User, String> implements UserService {

	public User login(String name, String password) {
		String md5_pwd = MD5Util.MD5(password);
		String hql = "from User where name = '"+name+"' and password = '"+md5_pwd+"'"; 
		List<User> list = findByHql(hql);
		if(list != null && list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}

	public User reg(User user) {
		
		return null;
	}

	
	
}
