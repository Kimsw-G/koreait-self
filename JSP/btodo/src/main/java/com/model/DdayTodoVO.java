package com.model;

import java.sql.Date;

public class DdayTodoVO {
	private int dDay_pk;
	private int m_pk;
	private String content;
	private Date dday;
	public int getdDay_pk() {
		return dDay_pk;
	}
	public void setdDay_pk(int dDay_pk) {
		this.dDay_pk = dDay_pk;
	}
	public int getM_pk() {
		return m_pk;
	}
	public void setM_pk(int m_pk) {
		this.m_pk = m_pk;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDday() {
		return dday;
	}
	public void setDday(Date dday) {
		this.dday = dday;
	}
	
	
}
