package com.qu7bicycle.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * User Model
 * @author yy
 *
 */

public class User implements Serializable {
	
	private Integer id;
	private String name;
	private String pwd;
	private School school;
	private Major major;
	private String phone;
	private int sex;
	private String created;
	private String lasted;
	private double money;
	private boolean available;
	private int login_times;
	private boolean authenticated;
	private String description;
	private Set<Log> logSet = new HashSet<Log>();
	
	
	public Set<Log> getLogSet() {
		return logSet;
	}
	public void setLogSet(Set<Log> logSet) {
		this.logSet = logSet;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getLasted() {
		return lasted;
	}
	public void setLasted(String lasted) {
		this.lasted = lasted;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public int getLogin_times() {
		return login_times;
	}
	public void setLogin_times(int login_times) {
		this.login_times = login_times;
	}
	public boolean isAuthenticated() {
		return authenticated;
	}
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
