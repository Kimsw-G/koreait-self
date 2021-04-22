package infromSanGi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Tester {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    
    Scanner sc = new Scanner(System.in);

    // TODO : 실행시킬 메인 메소드
    public boolean run(){

        try {
            getData();
            printQ();
        } catch (Exception e) {
        }finally{
            if(rs != null) try { rs.close(); } catch(SQLException ex) {}
            if(pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if(con != null) try { con.close(); } catch(SQLException ex) {}
        }


        return true;
    }

    public void printQ() throws SQLException{
        
        while(rs.next()){
            System.out.println(rs.getString("info"));
            System.out.print("정답 : ");
            if(sc.nextLine().equals(rs.getString("name"))){
                System.out.println("정답입니다!");
            }else{
                System.out.println("오답입니다!");
            }
            System.out.print(rs.getString("name"));
            System.out.printf("(%s)\n",rs.getString("fullname"));
        }
    }

    // TODO : DB불러오기!
    public void getData() throws Exception{
        
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://localhost:3306/ksw";
        String id = "root";
        String pw = "koreait";
        con = DriverManager.getConnection(url,id,pw);

        String sql = "select * from workprocess";
        pstmt = con.prepareStatement(sql);
        rs = pstmt.executeQuery();
    }
}
