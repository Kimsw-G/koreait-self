package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import jdbc.connection.ConnectionProvider;

import static jdbc.JdbcUtil.*;

//싱글톤으로 구현한다
public class MemberDAO {

	//싱글톤 파트
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    public MemberDAO() {}

    
    public void insertMember(MemberBean bean) {
        try {
        	con = ConnectionProvider.getConnection();
        	// 쿼리 준비
        	String sql = "insert into member values(?,?,?,?,?,?,?,?)";
        	// pstpt 생성. 쿼리 실행하기
        	pstmt = con.prepareStatement(sql);
        	// ? 대입
        	pstmt.setString(1, bean.getId());
        	pstmt.setString(2, bean.getPass1());
        	pstmt.setString(3, bean.getEmail());
        	pstmt.setString(8, bean.getTel());
        	pstmt.setString(4, bean.getHobby());
        	pstmt.setString(5, bean.getJob());
        	pstmt.setString(6, bean.getAge());
        	pstmt.setString(7, bean.getInfo());
        	//실행
        	pstmt.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
        	close(con);
        	close(pstmt);
        }
    }
    
    public Vector<MemberBean> getAllMember(){
    	Vector<MemberBean> v = new Vector<MemberBean>();
    	
    	try {
			con = ConnectionProvider.getConnection();
			// 쿼리 준비하기
			String sql = "select * from member";
			// 쿼리 실행
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberBean bean = new MemberBean();
				bean.setId(rs.getString(1));
				bean.setPass1(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setTel(rs.getString(4));
				bean.setHobby(rs.getString(5));
				bean.setAge(rs.getString(6));
				bean.setJob(rs.getString(7));
				bean.setInfo(rs.getString(8));
				//벡터에 저장
				v.add(bean);
			}
		} catch(Exception e) {
            e.printStackTrace();
        } finally {
        	close(con);
        	close(pstmt);
        }
    	return v;
    }
}


