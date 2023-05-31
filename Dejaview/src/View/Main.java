package View;

import java.util.Scanner;
import Controller.JoinCon;
import Controller.LoginCon;
import Model.GameDTO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 회원가입 구간
		while (true) {
			System.out.println("1. 회원가입 2. 로그인 3. 랭킹보기");
			int n = sc.nextInt();
			int b = 0;
			if (n == 1) {

				System.out.println("== 회원가입 ==");
				System.out.print("ID 입력 >> ");
				String id = sc.next();
				System.out.print("PW 입력 >> ");
				String pw = sc.next();

				JoinCon joinCon = new JoinCon();
				String result = joinCon.join(new GameDTO(id, pw));

				System.out.println("회원가입에 " + result + "하셨습니다.");

			}
			// 로그인 구간
			if (n == 2) {
				System.out.println("== 로그인 ==");
				System.out.print("ID 입력 >> ");
				String id = sc.next();
				System.out.print("PW 입력 >> ");
				String pw = sc.next();

				LoginCon loginCon = new LoginCon();
				String name = loginCon.login(new GameDTO(id, pw));

				if (name != null) {
					System.out.println(name + "님 로그인에 성공하셨습니다.");
					b = 1;
					break;
				} else {
					System.out.println("아이디와 비밀번호를 잘못입력하셨습니다.");
				}
				if (b == 1)
					break;
			}
			// 랭킹확인

			if (b == 1)
				break;
		}
		// 로그인 성공시 브레이크로 빠져나옴.
		// 변수값 DTO로 넘김
		GameDTO gameDTO = new GameDTO(null, null);
		gameDTO.setDay(5); // 게임 기한 설정
		while (true) {

			System.out.println("어서오십시오.");
			System.out.println("이곳은 로비입니다.");
			System.out.println("남은 기한 " + gameDTO.getDay() + "일");
			System.out.println("오늘도 행운이 가득하시길.");
			System.out.println("향할 곳을 정해주세요.");
			System.out.println("[1] 도박장 [2] 사냥터 [3] 골든벨");
			System.out.print("갈곳을 선택 하세요 >> ");
			int s = sc.nextInt();
			System.out.println();
			// 야바위 도박장 코드
			

		}
	}
}