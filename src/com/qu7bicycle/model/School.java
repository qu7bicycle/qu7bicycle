package com.qu7bicycle.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * School Model
 * @author yy
 *
 */

public class School implements Serializable {
	
	private int id;
	private String name;
	private String province;
	private String city;
	private String area;
	private int registered_num;
	private String description;
	private boolean available;
	private Set<Major> majorSet = new HashSet<Major>();
	private Set<User> userSet = new HashSet<User>();
	
	public Set<User> getUserSet() {
		return userSet;
	}
	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
	}
	public Set<Major> getMajorSet() {
		return majorSet;
	}
	public void setMajorSet(Set<Major> majorSet) {
		this.majorSet = majorSet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getRegistered_num() {
		return registered_num;
	}
	public void setRegistered_num(int registered_num) {
		this.registered_num = registered_num;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}

}
