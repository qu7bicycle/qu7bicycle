package com.rightsallocate.service;

import com.rightsallocate.dao.BaseDao;
import com.rightsallocate.model.User;

public interface UserService extends BaseDao<User, String> {
	
	public User login(String name, String password);
	
	public User reg(User user);

}
