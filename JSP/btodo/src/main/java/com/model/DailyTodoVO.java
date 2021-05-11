package com.model;

public class DailyTodoVO {
	private int daily_pk;
	private int m_pk;
	private String regDate;
	private int todoDate;//요일 계산
	private String ctnt;
	private int dday_pk; // ddaytodo에서 가져올 fk
	public int getDaily_pk() {
		return daily_pk;
	}
	public void setDaily_pk(int daily_pk) {
		this.daily_pk = daily_pk;
	}
	public int getM_pk() {
		return m_pk;
	}
	public void setM_pk(int m_pk) {
		this.m_pk = m_pk;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getTodoDate() {
		return todoDate;
	}
	public void setTodoDate(int todoDate) {
		this.todoDate = todoDate;
	}
	public String getCtnt() {
		return ctnt;
	}
	public void setCtnt(String ctnt) {
		this.ctnt = ctnt;
	}
	public int getDday_pk() {
		return dday_pk;
	}
	public void setDday_pk(int dday_pk) {
		this.dday_pk = dday_pk;
	}
	
}
