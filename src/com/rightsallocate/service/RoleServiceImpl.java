package com.rightsallocate.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rightsallocate.dao.AbstractBaseDao;
import com.rightsallocate.model.Role;

@Service
@Transactional
public class RoleServiceImpl extends AbstractBaseDao<Role, String> implements RoleService {

}
