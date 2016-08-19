package com.qu7bicycle.action;

import java.nio.channels.SeekableByteChannel;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.qu7bicycle.exception.UserException;
import com.qu7bicycle.model.Major;
import com.qu7bicycle.model.School;
import com.qu7bicycle.model.User;
import com.qu7bicycle.service.UserService;

public class LoginAction extends ActionSupport implements RequestAware,SessionAware{
	private static final long serialVersionUID = -6709931695988565201L;
	
	private Map<String,Object> requestMap;
	private Map<String,Object> sessionMap;
	
	private User form_User;
	private String verifyCode;
	
	@Autowired
	private UserService userService;

	/**
	 * �û���¼��Action����
	 * @return
	 * @author ���
	 * @date 2016��8��16��
	 */
	public String login(){
		System.out.println("LoginAction_login");
//		//1.�ж��Ƿ���֤����ȷ
//		if(verifyCode == null || !verifyCode.equals(sessionMap.get("checkCode"))){
//			requestMap.put("msg", "��֤�����");
//			return "login_fail";
//		}
		//2.���û����ֻ��ź�������е�½
//		try {
//			User db_User = userService.login(form_User.getPhone(),form_User.getPwd());
			User db_User = new User();
			db_User.setPhone("123131");
			db_User.setMoney(1000);
			School school = new School();
			school.setName("���");
			db_User.setSchool(school);
			Major major = new Major();
			major.setName("�����");
			db_User.setMajor(major);
			sessionMap.put("user", db_User);
			return "login_success";
//		} catch (UserException e) {
//			requestMap.put("msg", e.getMessage());
//			return "login_fail";
//		}
	}

	public User getForm_User() {
		return form_User;
	}

	public void setForm_User(User form_User) {
		this.form_User = form_User;
	}
	
	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public void setSession(Map<String, Object> arg0) {
		sessionMap = arg0;
	}

	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}
	
}
