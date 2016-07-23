package com.qu7bicycle.model;

import java.io.Serializable;

/**
 * Log Model
 * @author yy
 *
 */

public class Log implements Serializable {
	
	private int id;
	private User user;
	private Bicycle bicycle;
	private String startTime;
	private String endTime;
	private double money;
	private boolean isPay;
	private String updateTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Bicycle getBicycle() {
		return bicycle;
	}
	public void setBicycle(Bicycle bicycle) {
		this.bicycle = bicycle;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public boolean getIsPay() {
		return isPay;
	}
	public void setIsPay(boolean isPay) {
		this.isPay = isPay;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
