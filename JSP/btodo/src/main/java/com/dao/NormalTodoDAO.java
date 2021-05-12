package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.MemberVO;
import com.model.NormalTodoVO;
import com.util.JDBCUtil;

public class NormalTodoDAO {

	
	public static List<NormalTodoVO> selectNormalTodoList(MemberVO vo){
		// normal todolist를 vo(id)정보를 통해 가져옴
		List<NormalTodoVO> list = new ArrayList<NormalTodoVO>();
		Connection con = JDBCUtil.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from normaltodo where m_pk = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, vo.getM_pk());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				NormalTodoVO nv = new NormalTodoVO();
//				nv.setCtnt(rs.getString("ctnt"));
//				nv.setDoCheck(rs.getBoolean("docheck"));
//				nv.setM_pk(rs.getInt("m_pk"));
//				nv.setNormal_pk(rs.getInt("normal_pk"));
//				nv.setRegDate(rs.getString("regdate"));
				nv.inputData(rs);
				list.add(nv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, pstmt, rs);
		}
		
		
		return list;
	}
	
	public static void insertNormalTodo(NormalTodoVO vo) {
		Connection con = JDBCUtil.getCon();
		PreparedStatement pstmt = null;
		
		String sql = "insert into normaltodo"
				+ "(ctnt, m_pk)"
				+ "values(?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getCtnt());
			pstmt.setInt(2, vo.getM_pk());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, pstmt);
		}
	}
}
