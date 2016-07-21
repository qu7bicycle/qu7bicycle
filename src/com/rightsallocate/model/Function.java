package com.rightsallocate.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * ¹¦ÄÜ±í
 * @author yy
 *
 */
public class Function implements Serializable {
	
	private String fid;
	private String name;
	private String des;
	private Set<Role> roleList = new HashSet<Role>();
	private Set<Resource> resourceList = new HashSet<Resource>();
	
	public Set<Resource> getResourceList() {
		return resourceList;
	}

	public void setResourceList(Set<Resource> resourceList) {
		this.resourceList = resourceList;
	}

	public Set<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(Set<Role> roleList) {
		this.roleList = roleList;
	}

	public Function() {
		super();
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
	

}
