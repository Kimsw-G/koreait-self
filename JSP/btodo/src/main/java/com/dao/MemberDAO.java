package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.MemberVO;
import com.util.JDBCUtil;

public class MemberDAO {
	
	
	public static int insertMember(MemberVO vo) { // 유저 추가 sql
		Connection con = JDBCUtil.getCon();
		PreparedStatement pstmt = null;
		
		String sql = "insert into member "
				+"(m_id,m_pw,m_name,m_tel)"
				+"values "
				+"(?,?,?,?)";
		try {
			System.out.println(vo.getM_name());
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getM_id());
			pstmt.setString(2, vo.getM_pw());
			pstmt.setString(3, vo.getM_name());
			pstmt.setString(4, vo.getM_tel());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}finally {
			JDBCUtil.close(con, pstmt);
		}
	}
	
	public static String selectPw(MemberVO vo) {
		String pw = selectMemberVOById(vo.getM_id()).getM_pw();
		System.out.println(pw);
		if(pw == null) pw = "";
		
		return pw;
	}
	
	public static MemberVO selectMemberVOById(String id) {
		MemberVO vo = new MemberVO();
		Connection con = JDBCUtil.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from member where m_id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				vo.setM_id(rs.getString("m_id"));
				vo.setM_name(rs.getString("m_name"));
				vo.setM_pk(rs.getInt("m_pk"));
				vo.setM_pw(rs.getString("m_pw"));
				vo.setM_tel(rs.getString("m_tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, pstmt, rs);
		}
		return vo;
	}
}
