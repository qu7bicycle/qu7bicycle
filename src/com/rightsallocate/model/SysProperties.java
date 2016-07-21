package com.rightsallocate.model;

import java.io.Serializable;

/**
 * 系统属性表
 * @author yy
 *
 */
public class SysProperties implements Serializable {
	
	private String name;
	private String value;
	private String des;
	
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
	
	public SysProperties() {
		super();
	}

}
