package com.rightsallocate.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * ×ÊÔ´±í
 * @author yy
 *
 */
public class Resource implements Serializable {
	
	private String rid;
	private String name;
	private String value;
	private String des;
	private Function fid;
	private Set<Role> roleList = new HashSet<Role>();
	private Function function;
	
	public Function getFunction() {
		return function;
	}
	public void setFunction(Function function) {
		this.function = function;
	}
	public Set<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(Set<Role> roleList) {
		this.roleList = roleList;
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
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Function getFid() {
		return fid;
	}
	public void setFid(Function fid) {
		this.fid = fid;
	}
	
	public Resource() {
		super();
	}

}
