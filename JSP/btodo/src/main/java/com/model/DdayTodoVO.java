package com.model;

import java.sql.Date;

public class DdayTodoVO {
	private int dday_pk;
	private int m_pk;
	private String content;
	private Date dday;
	private int nowDday;

	public int getDday_pk() {
		return dday_pk;
	}
	public void setDday_pk(int dDay_pk) {
		this.dday_pk = dDay_pk;
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
	public int getNowDday() {
		return nowDday;
	}
	public void setNowDday(int nowDday) {
		this.nowDday = nowDday;
	}
	
	

	
	
}
