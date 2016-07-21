package com.rightsallocate.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.rightsallocate.common.Page;
import com.rightsallocate.service.SysPropertiesServiceImpl;

public class SysPropertiesAction extends ActionSupport {
	
	
	private int pno;
	
	@Resource(name="sysPropertiesService")
	private SysPropertiesServiceImpl sysPropertiesService;
	
	
	public String listSysProperties() {
		sysPropertiesService.init(pno);
		Page myPage = sysPropertiesService.getPage();
		List myList = myPage.getList();
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("myPage", myPage);
        session.setAttribute("sysProperties", myList);
	
		return SUCCESS;
	}
	
	
	
	
	
	
	
	public SysPropertiesServiceImpl getSysPropertiesService() {
		return sysPropertiesService;
	}
	public void setSysPropertiesService(
			SysPropertiesServiceImpl sysPropertiesService) {
		this.sysPropertiesService = sysPropertiesService;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}


	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
