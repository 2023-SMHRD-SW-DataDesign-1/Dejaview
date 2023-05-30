import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Sign_up {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== 회원가입 ==");
		System.out.print("ID 입력 >> ");
		String ID = sc.next();
		System.out.print("PW 입력 >> ");
		String PW = sc.next();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String dburl = "jdbc:oracle:thin:@project-db-stu.smhrd.com:1524:xe";
			String dbuser = "campus_g_0530_3";
			String dbpw = "smhrd3";
			
			conn = DriverManager.getConnection(dburl, dbuser, dbpw);
			int a = 3;
			
			if (conn == null) {
				System.out.println("접속실패");
			}else {
				System.out.println("접속성공");
			}
			
			String sql = "INSERT INTO Member VALUES(?, ?)";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, ID);
			psmt.setString(2, PW);
			
			int row = psmt.executeUpdate();
			
			if (row > 0) {
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
			
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null) psmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
