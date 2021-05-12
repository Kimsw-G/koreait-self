package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	// TODO : 맞는 DB로 변경 필요
	public static Connection getCon() {
		Connection con = null;
		try {
			final String DB_NAME = "btodo";
			final String DRIVER = "org.mariadb.jdbc.Driver";
			final String URL = "jdbc:mysql://localhost/" + DB_NAME;
			final String USER_NAME = "root";
			final String PASSWORD = "koreait";
					
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

		} catch (Exception e) {
			System.out.println("Connectiont fail");
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close(Connection con, PreparedStatement pstmt){
		close(con, pstmt, null);
	}
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs)  {
		try {
			closeObject(con);
			closeObject(pstmt);
			closeObject(rs);
		} catch (Exception e) {
			System.out.println("close error ");
			e.printStackTrace();
		}
	}
	private static void closeObject(AutoCloseable o) throws Exception {
		if(o != null) o.close();
	}
}
        