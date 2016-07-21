package com.rightsallocate.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rightsallocate.common.Page;
import com.rightsallocate.dao.AbstractBaseDao;
import com.rightsallocate.dao.PageDaoImpl;
import com.rightsallocate.model.SysProperties;

@Service
@Transactional
public class SysPropertiesServiceImpl extends AbstractBaseDao<SysProperties, String> implements SysPropertiesService {

	public void init(int pno) {
		String tableName = "SysProperties";
		getPageDao().init(pno, tableName);
	}

	public Page getPage() {	
		return getPageDao().getPage();
	}

}
