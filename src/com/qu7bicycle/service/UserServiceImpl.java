package com.qu7bicycle.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qu7bicycle.dao.AbstractBaseDao;
import com.qu7bicycle.model.User;

@Service
@Transactional
public class UserServiceImpl extends AbstractBaseDao<User, Integer> implements UserService {

}
