package hong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// 회원가입 구간
		while (true) {
			System.out.println("1. 회원가입 2. 로그인 3. 랭킹보기");
			int n = sc.nextInt();
			int b = 0;
			if (n == 1) {

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
					} else {
						System.out.println("접속성공");
					}

					String sql = "INSERT INTO Member VALUES(?, ?)";

					psmt = conn.prepareStatement(sql);

					psmt.setString(1, ID);
					psmt.setString(2, PW);

					int row = psmt.executeUpdate();

					if (row > 0) {
						System.out.println("회원가입 성공");
					} else {
						System.out.println("회원가입 실패");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (psmt != null)
							psmt.close();
						if (conn != null)
							conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}

			// 로그인 구간
			if (n == 2) {
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
					} else {
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
					b = 1;
					break;

				} else {
					System.out.println("틀렸습니다. 아이디, 비밀번호를 확인해주세요");
				}
				if (b == 1)
					break;
			}
			if (b == 1)
				break;
		}
		// 로그인 성공시 브레이크로 빠져나옴/!
		int day = 5; // 날짜
		int gold = 0; // 골드
		int hp = 16; // 영웅 체력
		int Ghp = 10; // 고블린 체력

		while (true) {

			if (day == 0)
				break;
			System.out.println("남은 기한 " + day + "일");
			System.out.println("로비입니다.");
			System.out.println("1. 도박장 2. 사냥터 3. 골든벨");
			System.out.print("갈곳을 선택 하세요 >> ");
			int s = sc.nextInt();
			System.out.println();

			if (s == 1) {
				// 도박장 코드
				
			}

			if (s == 2) {

				System.out.println("야생의 고블린이 나타났다.");

				System.out.println("⠀⠀⠀⠀⠀⠀⣀⢀⠀");
				System.out.println("⠀⠀⠀⠀⠀⠀⠺⠾⡀⣀");
				System.out.println("⠀⠀⠀⠀⠀⢬⢱⡷⠿⠾⣃⠂⠀");
				System.out.println("⠀⠀⠀⠀⠹⣿⣿⣾⣲⠉⠪⠁⠀");
				System.out.println("⠀⠀⣰⢼⣴⣶⢽⡻⣷⣠⠿⠤⣆⣀⠀");
				System.out.println("⠀⠀⣾⣽⠿⣿⣟⣝⡟⠱⣽⣢⠿⡏⢆⠠⡀⠀");
				System.out.println("⠀⠐⡻⡧⡀⠈⣿⣿⣿⣿⣿⡈⠀⣼⣈⣠⡜⣄⠀⠀");
				System.out.println("⠀⠺⣷⣖⣄⠐⢻⡏⠍⠹⠻⣇⠀⣽⣧⠹⠷⠛⠚⠀");
				System.out.println("⠀⠀⠈⢿⣿⡿⠛⢻⣷⢴⣾⣿⠁⢿⣿⣯⣷⣿⣮⠀");
				System.out.println("⠀⠈⠞⢲⡇⠀⠀⠀⡙⠘⠟⣿⠁⠀⠻⢻⣟⠿⡍⠀");
				System.out.println("⠀⠀⠀⠀⢷⡦⠀⠀⠁⠀⢀⣿⠦⠀⠀⠁⠉⠈⠁⠀");
				System.out.println("⠀⠀⠀⢰⣿⡏⡀⠀⠀⠀⣹⣫⢅⠀⠀⠀⠐⠀⠀⠀");
				System.out.println("⠀⠀⠈⠜⠊⠒⠈⠒⠒⠊⠀⠉⠉⠀⠁⠀⠀⠀");

				while (true) {
					System.out.print("공격을 하세요 >> ");
					System.out.println("1. 공격");
					int ck = sc.nextInt();
					if (ck == 1) {
						Ghp -= 2;
						System.out.println("고블린 의 HP가 " + Ghp + "남았습니다.");
						hp--;
						System.out.println("용사의 HP은 " + hp + "남았습니다.");
						System.out.println();
						if (hp <= 0) {
							System.out.println("용사의 체력이 다떨어졌습니다.");
							System.out.println("총 획득한 골드 : " + gold);
							break;
						}
					} else {
						System.out.println("잘못된 입력입니다.");
					}
					if (Ghp <= 0) {
						System.out.println("고블린을 잡았습니다.");
						int hunt = rand.nextInt(10);
						if (hunt == 0) {
							gold += 200;
							System.out.println("   .aMMMMP    .aMMMb     dMP     dMMMMb ");
							System.out.println("  dMP\"       dMP\"dMP    dMP     dMP VMP ");
							System.out.println(" dMP MMP\"   dMP dMP    dMP     dMP dMP  ");
							System.out.println("dMP.dMP    dMP.aMP    dMP     dMP.aMP");
							System.out.println("VMMMP\"     VMMMP\"    dMMMMMP dMMMMP\"   ");
							System.out.println("운이 좋았습니다. 황금 고블린이 였습니다. 골드 200G를 획득합니다.");
							System.out.println("현재 골드는 : " + gold);
							System.out.println();

						} else {
							gold += 100;
							System.out.println("골드 100G를 획득합니다. 현재 골드는 : " + gold);
							System.out.println();
						}

						Ghp = 10;
						break;
					}
				}

			}

			if (s == 3) {
				// 골든벨 코드
			}

			day--;
		}
	}

}
