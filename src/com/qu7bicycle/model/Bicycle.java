package com.qu7bicycle.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Bicycle Model
 * @author yy
 *
 */

public class Bicycle implements Serializable {
	
	private int id;
	private int num;
	private String pwd;
	private int times;
	private String lasted;
	private boolean available;
	private String description;
	private String buyDate;
	private String type;
	private String fromFactory;
	private Set<Log> logSet = new HashSet<Log>();
	
	public Set<Log> getLogSet() {
		return logSet;
	}
	public void setLogSet(Set<Log> logSet) {
		this.logSet = logSet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	public String getLasted() {
		return lasted;
	}
	public void setLasted(String lasted) {
		this.lasted = lasted;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFromFactory() {
		return fromFactory;
	}
	public void setFromFactory(String fromFactory) {
		this.fromFactory = fromFactory;
	}
	

}
