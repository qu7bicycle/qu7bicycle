package com.qu7bicycle.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.qu7bicycle.model.User;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements RequestAware,SessionAware{
	private static final long serialVersionUID = 2801432029987858517L;
	
	private Map<String,Object> requestMap;
	private Map<String,Object> sessionMap;
	
	private User formUser;
	
	/**
	 * ת�������û���Ϣ�鿴����
	 * @return
	 * @author ���
	 * @date 2016��8��19��
	 */
	public String toPersonInfo(){
		System.out.println("UserAction_toPersonInfo");
		return "toPersonInfo";
	}


	public void setSession(Map<String, Object> arg0) {
		sessionMap = arg0;
	}


	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}
	
}
