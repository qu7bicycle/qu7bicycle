package com.qu7bicycle.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.qu7bicycle.exception.UserException;
import com.qu7bicycle.model.User;
import com.qu7bicycle.service.UserService;

@Controller
@Scope("prototype")
public class LoginAction extends ActionSupport implements RequestAware,SessionAware{
	private static final long serialVersionUID = -6709931695988565201L;
	
	private Map<String,Object> requestMap;
	private Map<String,Object> sessionMap;
	
	private User form_User;
	private String verifyCode;
	private String formMessageCode;
	
	@Autowired
	private UserService userService;

	/**
	 * �û���¼��Action����
	 * @return
	 * @author ���
	 * @date 2016��8��16��
	 */
	public String login(){
		//1.�ж��Ƿ���֤����ȷ
		if(verifyCode == null || !verifyCode.equals(sessionMap.get("checkCode"))){
			requestMap.put("msg", "��֤�����");
			return "login_fail";
		}else if(form_User == null){
			requestMap.put("msg", "�������Ϊ��");
			return "login_fail";
		}
		//2.���û����ֻ��ź�������е�½
		try {
			//TODO ��session�л�ȡ���������û��Ķ�����
			String trueMessageCode = "";
			User db_User = userService.loginForPhone(form_User.getPhone(),formMessageCode,trueMessageCode);
			sessionMap.put("user", db_User);
			return "login_success";
		} catch (UserException e) {
			requestMap.put("msg", e.getMessage());
			return "login_fail";
		}
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

	public String getFormMessageCode() {
		return formMessageCode;
	}

	public void setFormMessageCode(String formMessageCode) {
		this.formMessageCode = formMessageCode;
	}

	public void setSession(Map<String, Object> arg0) {
		sessionMap = arg0;
	}

	public void setRequest(Map<String, Object> arg0) {
		requestMap = arg0;
	}
	
}
