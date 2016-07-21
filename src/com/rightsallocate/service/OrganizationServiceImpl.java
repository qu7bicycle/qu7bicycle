package com.rightsallocate.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rightsallocate.dao.AbstractBaseDao;
import com.rightsallocate.model.Organization;

@Service
@Transactional
public class OrganizationServiceImpl extends AbstractBaseDao<Organization, String> implements OrganizationService {

}
