package HNU;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ScoreDAO {
	
	Connection conn = null;
	PreparedStatement psmt = null;
	
	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String dburl = "jdbc:oracle:thin:@project-db-stu.smhrd.com:1524:xe";
			String dbuser = "campus_g_0530_3";
			String dbpw = "smhrd3";

			conn = DriverManager.getConnection(dburl, dbuser, dbpw);

			if (conn != null)
				System.out.println("서버 접속 완료");
			else
				System.out.println("서버 접속 실패");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getClose() {
		try {
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int insertMember(ScoreDTO sto) {
		getCon();
		String sql = "insert into GameMember(score) values(?)";
		int cnt = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sto.getScore());
			cnt = psmt.executeUpdate();
			return cnt;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return cnt;
	}

}
