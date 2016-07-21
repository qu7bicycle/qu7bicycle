package com.rightsallocate.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rightsallocate.dao.AbstractBaseDao;
import com.rightsallocate.model.Function;

@Service
@Transactional
public class FunctionServiceImpl extends AbstractBaseDao<Function, String> implements FunctionService {

}
