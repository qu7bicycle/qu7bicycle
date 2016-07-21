package com.rightsallocate.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


/**
 * ½ÇÉ«±í
 * @author yy
 *
 */
public class Role implements Serializable {
	
	private String rid;
	private String name;
	private Set<Resource> resourceList = new HashSet<Resource>();
	private Set<Function> functionList = new HashSet<Function>();
	private Set<User> userList = new HashSet<User>();
	private String des;
	
	
	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Set<User> getUserList() {
		return userList;
	}

	public void setUserList(Set<User> userList) {
		this.userList = userList;
	}

	public Set<Resource> getResourceList() {
		return resourceList;
	}

	public void setResourceList(Set<Resource> resourceList) {
		this.resourceList = resourceList;
	}

	public Set<Function> getFunctionList() {
		return functionList;
	}

	public void setFunctionList(Set<Function> functionList) {
		this.functionList = functionList;
	}

	public Role() {
		super();
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
