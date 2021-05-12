package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	public void inputData(ResultSet rs) {
		try {normal_pk = rs.getInt("normal_pk");} catch (Exception e) {}
		try {m_pk = rs.getInt("m_pk");} catch (Exception e) {}
		try {regDate = rs.getString("regDate");} catch (Exception e) {}
		try {ctnt = rs.getString("ctnt");} catch (Exception e) {}
		try {doCheck = rs.getBoolean("docheck");} catch (Exception e) {}
	}
	
	
}
