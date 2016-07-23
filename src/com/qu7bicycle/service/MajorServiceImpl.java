package com.qu7bicycle.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qu7bicycle.dao.AbstractBaseDao;
import com.qu7bicycle.model.Major;

@Service
@Transactional
public class MajorServiceImpl extends AbstractBaseDao<Major, Integer> implements MajorService {

}
