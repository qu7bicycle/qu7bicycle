package com.rightsallocate.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 组织机构表
 * @author yy
 *
 */
public class Organization implements Serializable {
	
	private String oid;
	private String name;
	private Organization parentOrganization;
	private String des;
	private String phone;
	private Set<Organization> childOrganizations = new HashSet<Organization>();
	private Set<User> userList = new HashSet<User>();
	
	
	public Set<User> getUserList() {
		return userList;
	}


	public void setUserList(Set<User> userList) {
		this.userList = userList;
	}


	public Set<Organization> getChildOrganizations() {
		return childOrganizations;
	}


	public void setChildOrganizations(Set<Organization> childOrganizations) {
		this.childOrganizations = childOrganizations;
	}


	public Organization() {
		super();
	}
	
	
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Organization getParentOrganization() {
		return parentOrganization;
	}


	public void setParentOrganization(Organization parentOrganization) {
		this.parentOrganization = parentOrganization;
	}


	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
