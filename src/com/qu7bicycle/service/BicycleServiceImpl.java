package com.qu7bicycle.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qu7bicycle.dao.AbstractBaseDao;
import com.qu7bicycle.model.Bicycle;

@Service
@Transactional
public class BicycleServiceImpl extends AbstractBaseDao<Bicycle, Integer> implements BicycleService {

}
