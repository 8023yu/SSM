package com.gao.po;

import java.util.List;

public class B_User {
	
	private Integer userid;
	private String yhm;
	private String mm;
	private List<B_Xxk> xxks;
	
	public Integer getUserid() {
		return userid;
	}
	public List<B_Xxk> getXxks() {
		return xxks;
	}
	public void setXxks(List<B_Xxk> xxks) {
		this.xxks = xxks;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getYhm() {
		return yhm;
	}
	public void setYhm(String yhm) {
		this.yhm = yhm;
	}
	public String getMm() {
		return mm;
	}
	public void setMm(String mm) {
		this.mm = mm;
	}

	

}
