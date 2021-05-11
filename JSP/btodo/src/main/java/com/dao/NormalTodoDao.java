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

public class NormalTodoDao {

	
	public static List<NormalTodoVO> selectNormalTodoList(MemberVO vo){
		List<NormalTodoVO> list = new ArrayList();
		Connection con = JDBCUtil.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select regdate, ctnt "
				+ "from normaltodo A join member B "
				+ "where A.m_pk ";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getM_id());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				NormalTodoVO nv = new NormalTodoVO();
				nv.setCtnt(rs.getString("ctnt"));
				nv.setRegDate(rs.getString("regdate"));
				list.add(nv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, pstmt, rs);
		}
		
		
		return list;
	}
}
