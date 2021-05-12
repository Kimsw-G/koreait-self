package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.DdayTodoVO;
import com.model.MemberVO;
import com.util.JDBCUtil;

public class DdayTodoDAO {

	public static List<DdayTodoVO> selectDdayTodoList(MemberVO mv){
		List<DdayTodoVO> list = new ArrayList<DdayTodoVO>();
		Connection con = JDBCUtil.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from ddaytodo where m_pk = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, mv.getM_pk());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DdayTodoVO dv = new DdayTodoVO();
				dv.setContent(rs.getString("content"));
				dv.setdDay_pk(rs.getInt("dday_pk"));
				dv.setM_pk(rs.getInt("m_pk"));
				list.add(dv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, pstmt, rs);
		}
		return list;
	}
}
