package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GameDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

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
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 회원가입
	public int insertMember(GameDTO dto) {
		getCon();

		String sql = "insert into GameMember(id,pw) values(?,?)";

		int cnt = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			cnt = psmt.executeUpdate();
			return cnt;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return cnt;
	}

	// 로그인
	public String login(GameDTO dto) {
		getCon();
		String name = null;
		try {
			String sql = "select id from GameMember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery();

			if (rs.next()) {
				name = rs.getString("id");
			}

		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		getClose();
		return name;
	}

	// 랭킹 시스템
	public ArrayList<GameDTO> rankingLIst(GameDTO dto) {

		getCon();
		ArrayList<GameDTO> rankingLIst = new ArrayList<GameDTO>();

		try {
			String sql = "select id, score from GameMember order by score ";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				int score = rs.getInt(2);

				dto = new GameDTO(id, score);
				rankingLIst.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return rankingLIst;

	}

}
