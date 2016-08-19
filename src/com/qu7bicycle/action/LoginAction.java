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
	 * 用户登录的Action方法
	 * @return
	 * @author 张昊
	 * @date 2016年8月16日
	 */
	public String login(){
		//1.判断是否验证码正确
		if(verifyCode == null || !verifyCode.equals(sessionMap.get("checkCode"))){
			requestMap.put("msg", "验证码错误");
			return "login_fail";
		}else if(form_User == null){
			requestMap.put("msg", "所填参数为空");
			return "login_fail";
		}
		//2.对用户的手机号和密码进行登陆
		try {
			//TODO 从session中获取到发给该用户的短信码
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
