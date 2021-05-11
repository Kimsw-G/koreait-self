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
		String pw = "";
		Connection con = JDBCUtil.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select pw from member where id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getM_id());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				pw = rs.getString(1);
			}
			return pw;
		} catch (SQLException e) {
			System.out.println("pw 구하기 실패!");
			e.printStackTrace();
			return pw;
		}finally {
			JDBCUtil.close(con, pstmt, rs);
		}
	}
}
