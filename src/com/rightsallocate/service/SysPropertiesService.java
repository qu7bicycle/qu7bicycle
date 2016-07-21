package com.rightsallocate.service;

import com.rightsallocate.common.Page;
import com.rightsallocate.dao.BaseDao;
import com.rightsallocate.model.SysProperties;

public interface SysPropertiesService extends BaseDao<SysProperties, String> {
	
	/**
	 * 分页初始化
	 * @param pno
	 */
	public void init(int pno);
	
	
	/**
	 * 分页实现
	 * @return
	 */
	public Page getPage();

}
