package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.model.DailyTodoVO;
import com.model.MemberVO;
import com.util.JDBCUtil;

public class DailyTodoDAO {

	public static List<DailyTodoVO> selectDailyTodoList(MemberVO mv) {
		List<DailyTodoVO> list = new ArrayList<DailyTodoVO>();
		Connection con = JDBCUtil.getCon();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from dailytodo where m_pk = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, mv.getM_pk());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DailyTodoVO dv = new DailyTodoVO();
				dv.setCtnt(rs.getString("ctnt"));
				dv.setDaily_pk(rs.getInt("daily_pk"));
				dv.setDday_pk(rs.getInt("dday_pk")); // default project의 dday_pk를 0으로 설정해준다.					
				dv.setM_pk(mv.getM_pk());
				dv.setRegDate(rs.getString("regdate"));
				dv.setTodoDate(rs.getInt("todoDate"));
				list.add(dv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, pstmt, rs);
		}
		return list;
	}
	
	public static void insertDailyTodoList(DailyTodoVO dv) {
		Connection con = JDBCUtil.getCon();
		PreparedStatement pstmt = null;
		String sql = "insert into dailytodo (ctnt,todoDate,m_pk) "
				+ "values (?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dv.getCtnt());
			pstmt.setInt(2, dv.getTodoDate());
			pstmt.setInt(3, dv.getM_pk());
			// pstmt.setInt(4,dv.getDday_pk());
			pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, pstmt);
		}
	}
}
