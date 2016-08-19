package com.qu7bicycle.action;

import java.io.ByteArrayInputStream;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qu7bicycle.common.SecurityCode;
import com.qu7bicycle.common.SecurityImage;


@Controller
@Scope("prototype")
public class SecurityCodeImageAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = -2610219351327673424L;

	private Map<String,Object> sessionMap;
	
	// 图片流
	private ByteArrayInputStream imageStream;
	private String timestamp;// 得到时间戳
	
	public ByteArrayInputStream getImageStream() {
		return imageStream;
	}

	public void setImageStream(ByteArrayInputStream imageStream) {
		this.imageStream = imageStream;

	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String execute() throws Exception {
		try{
			// 获取默认难度和长度的验证码
			String securityCode = SecurityCode.getSecurityCode();
			imageStream = SecurityImage.getImageAsInputStream(securityCode);
			// 放入session中
			sessionMap.put("checkCode", securityCode);
		}catch(Exception e){
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public void setSession(Map<String, Object> arg0) {
		 sessionMap = arg0;
	}
}
