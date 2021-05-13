package com.dao;

import java.sql.Connection;
import java.sql.Date;
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
		
		String sql = "select content, dday_pk, m_pk, datediff(now(),date(dday))"
				+ "from ddaytodo where m_pk = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, mv.getM_pk());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DdayTodoVO dv = new DdayTodoVO();
				dv.setContent(rs.getString(1));
				dv.setDday_pk(rs.getInt(2));
				dv.setM_pk(rs.getInt(3));
				dv.setNowDday(rs.getInt(4));
				list.add(dv);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, pstmt, rs);
		}
		return list;
	}
	
	public static void insertDdayTodo(DdayTodoVO dv) {
		Connection con = JDBCUtil.getCon();
		PreparedStatement pstmt = null;
		String sql = "insert into ddaytodo (content, m_pk, dday) values (?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dv.getContent());
			pstmt.setInt(2, dv.getM_pk());
			pstmt.setDate(3, dv.getDday());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, pstmt);
		}
	}
}
