package com.model;

public class NormalTodoVO {
	private int normal_pk;
	private int m_pk;
	private String regDate;
	private String ctnt;
	private boolean doCheck;
	
	public int getNormal_pk() {
		return normal_pk;
	}
	public void setNormal_pk(int normal_pk) {
		this.normal_pk = normal_pk;
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
	public String getCtnt() {
		return ctnt;
	}
	public void setCtnt(String ctnt) {
		this.ctnt = ctnt;
	}
	public boolean isDoCheck() {
		return doCheck;
	}
	public void setDoCheck(boolean doCheck) {
		this.doCheck = doCheck;
	}
	
}
