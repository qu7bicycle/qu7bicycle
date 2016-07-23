package com.qu7bicycle.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Major Model
 * @author yy
 *
 */

public class Major implements Serializable {
	
	private int id;
	private String name;
	private School school;
	private int registered_num;
	private String description;
	private boolean available;
	private Set<User> userSet = new HashSet<User>();
	
	public Set<User> getUserSet() {
		return userSet;
	}
	public void setUserSet(Set<User> userSet) {
		this.userSet = userSet;
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
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
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
