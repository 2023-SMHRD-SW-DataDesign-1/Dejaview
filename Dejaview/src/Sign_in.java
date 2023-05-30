import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sign_in {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== 로그인 ==");
		System.out.print("ID 입력 >> ");
	    String ID = sc.next();
	    System.out.print("PW 입력 >> ");
	    String PW = sc.next();
	    
	    ResultSet rs = null;
	    PreparedStatement psmt = null;
	    Connection conn = null;
	    
	    String signin_ID = null;
	    String signin_PW = null;
	    
	    try {
	    	Class.forName("oracle.jdbc.driver.OracleDriver");
	    	
	    	String dburl = "jdbc:oracle:thin:@project-db-stu.smhrd.com:1524:xe";
	    	String dbuser = "campus_g_0530_3";
	    	String dbpw = "smhrd3";
	    	
	    	conn = DriverManager.getConnection(dburl, dbuser, dbpw);
			if (conn != null) {
				System.out.println("접속성공");
			}else {
				System.out.println("접속실패");
			}
			
			String sql = "SELECT * FROM Member WHERE ID = ? AND PW = ?";
			
			psmt = conn.prepareStatement(sql);
	    	
			psmt.setString(1, ID);
			psmt.setString(2, PW);
			
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				signin_ID = rs.getString("ID");
				signin_PW = rs.getString("PW");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    if (signin_ID != null) {
	    	System.out.println("환영합니다, " + signin_ID + "님.");
	    }else {
	    	System.out.println("틀렸습니다. 아이디, 비밀번호를 확인해주세요");
	    }

	}

}
