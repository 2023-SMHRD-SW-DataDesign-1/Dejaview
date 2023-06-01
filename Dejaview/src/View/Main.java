package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.*;
import Model.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GameDTO gameDTO = new GameDTO(null, null);
		GameDAO gameDAO = new GameDAO();
		String rId = null;
		// 회원가입 구간
		System.out.println("\r\n"
				+ "______         _       _                        ______                                    _   __        _         _      _   \r\n"
				+ "| ___ \\       (_)     (_)                       | ___ \\                                  | | / /       (_)       | |    | |  \r\n"
				+ "| |_/ /  __ _  _  ___  _  _ __    __ _    __ _  | |_/ /  ___   __ _   __ _   __ _  _ __  | |/ /  _ __   _   __ _ | |__  | |_ \r\n"
				+ "|    /  / _` || |/ __|| || '_ \\  / _` |  / _` | | ___ \\ / _ \\ / _` | / _` | / _` || '__| |    \\ | '_ \\ | | / _` || '_ \\ | __|\r\n"
				+ "| |\\ \\ | (_| || |\\__ \\| || | | || (_| | | (_| | | |_/ /|  __/| (_| || (_| || (_| || |    | |\\  \\| | | || || (_| || | | || |_ \r\n"
				+ "\\_| \\_| \\__,_||_||___/|_||_| |_| \\__, |  \\__,_| \\____/  \\___| \\__, | \\__, | \\__,_||_|    \\_| \\_/|_| |_||_| \\__, ||_| |_| \\__|\r\n"
				+ "                                  __/ |                        __/ |  __/ |                                 __/ |            \r\n"
				+ "                                 |___/                        |___/  |___/                                 |___/             ");
		while (true) {
			System.out.println();
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
					rId = id;
					b = 1;
					break;
				} else {
					System.out.println("아이디와 비밀번호를 잘못입력하셨습니다.");
				}
				if (b == 1)
					break;
			}
			// 랭킹확인
			if (n == 3) {
				GameDAO dao = new GameDAO();
				ArrayList<GameDTO> LIst = dao.rankingLIst(gameDTO);
				for (int i = 0; i < LIst.size(); i++) {
					System.out.println((i+1) + ". id : " + LIst.get(i).getId() + ", 점수 : " + LIst.get(i).getScore());
				}

			}

			if (b == 1)
				break;
		}
		// 로그인 성공시 브레이크로 빠져나옴.
		// 변수값 DTO로 넘김
		BgmController bgm = new BgmController();
		bgm.play(0);
		gameDTO.setDay(5); // 게임 기한 설정
		// 스토리 설명
		sc.nextLine();
		System.out.println("   , ,, ,                              \r\n"
				+ "   | || |    ,/  _____  \\.             \r\n"
				+ "   \\_||_/    ||_/     \\_||             \r\n"
				+ "     ||       \\_| . . |_/              \r\n"
				+ "     ||         |  L  |                \r\n"
				+ "    ,||         |`==='|                \r\n"
				+ "     ||      ___`; -- ;'___             \r\n"
				+ "     ||\\    /             \\            \r\n"
				+ "     || \\  /  ,    .    .  |           \r\n"
				+ "     ||  \\/  /| .  |  . |  |           \r\n"
				+ "     ||\\  ` / | ___|___ |  |     (     \r\n"
				+ "  (( || `--'  | _______ |  |     ))  ( \r\n"
				+ "(  )\\|| (  )\\ | - --- - | -| (  ( \\  ))\r\n"
				+ "(\\/  || ))/ ( | -- - -- |  | )) )  \\(( \r\n"
				+ " ( ()||((( ())|         |  |( (( () )");
		
		
		
		System.out.println("마왕이 용사의 손에 생을 마감하고 왕국은 평화로운 세상이 펼쳐졌습니다.");
		sc.nextLine(); 
		System.out
		.println("                                     .-.\r\n"
				+ "                                    /___\\\r\n"
				+ "                                    |___|\r\n"
				+ "                                    |]_[|\r\n"
				+ "                                    / I \\\r\n"
				+ "                                 JL/  |  \\JL\r\n"
				+ "      .-.                    i   ()   |   () i                      .-.\r\n"
				+ "      |_|     .^.           /_\\  LJ=======LJ  /_\\           .^.     |_|\r\n"
				+ "_._._/___\\._./___\\_._._._._.L_J_/.-. .-. .-.\\_L_J._._._._._/___\\._./___\\._._._\r\n"
				+ ".,        ., |-,-| .,       L_J  |_| [I] |_|  L_J       ., |-,-| .,        .,\r\n"
				+ "JL        JL |-O-| JL       L_J%%%%%%%%%%%%%%%L_J       JL |-O-| JL        JL\r\n"
				+ "HH_IIIIII_HH_'-'-'_HH_IIIIII|_|=======H=======|_|IIIIII_HH_'-'-'_HH_IIIIII_HH_\r\n"
				+ "[]--------[]-------[]-------[_]----\\.=I=./----[_]-------[]-------[]--------[]-\r\n"
				+ "||  _/\\_  ||\\\\_I_//||  _/\\_ [_] []_/_L_J_\\_[] [_] _/\\_  ||\\\\_I_//||  _/\\_  ||\\\r\n"
				+ "||  |__|  ||=/_|_\\=||  |__|_|_|   _L_L_J_J_   |_|_|__|  ||=/_|_\\=||  |__|  ||-\r\n"
				+ "||  |__|  |||__|__|||  |__[___]__--__===__--__[___]__|  |||__|__|||  |__|  |||\r\n"
				+ "[_]IIIIIII[_]IIIII[_]IIIIIL___J__II__|_|__II__L___JIIIII[_]IIIII[_]IIIIIIII[_]\r\n"
				+ "[_] \\_I_/ [_]\\_I_/[_] \\_I_[_]\\II/[]\\_\\I/_/[]\\II/[_]_I_/ [_]\\_I_/[_] \\_I_/  [_]\r\n"
				+ "L_J./   \\.L_J/   \\L_J./   L_JI  I[]/     \\[]I  IL_J   \\.L_J/   \\L_J./   \\. L_J\r\n"
				+ "L_J|     |L_J|   |L_J|    L_J|  |[]|     |[]|  |L_J    |L_J|   |L_J|      |L_J\r\n"
				+ "L_JL_____JL_JL___JL_JL____|-||  |[]|     |[]|  ||-|____JL_JL___JL_JL______JL_J\r\n"
				+ "");
		System.out.println("왕국에서 영웅이 될 줄 알았던 용사는 마왕과의 전투중에 왕국을 초토화 시키며 왕국의 죄인이 되었습니다. ");
		sc.nextLine(); 
		System.out.println("⣿⣿⣿⣿⣿⣿⠿⠛⠛⠛⡟⠛⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⠟⠉⠙⣄⢀⣀⠤⠧⢄⣀⢀⠞⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣇⠀⢀⡴⠋⠁⠀⠀⡄⠀⠀⠉⠢⡀⠀⢈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⠃⠀⢙⠏⠀⠀⠀⡤⠤⢧⣄⠀⠀⠀⠙⡎⢁⣠⣿⠿⠿⠿⢿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⠀⠀⡜⠀⠀⠀⠀⢇⡀⠀⠈⠆⠀⠀⢀⡼⠋⠁⠀⠀⠀⠀⠀⠀⠈⠙⢿⣿⣿\r\n"
				+ "⣿⠉⠉⢇⠀⠀⠀⠀⡄⠈⠉⠰⡀⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿\r\n"
				+ "⣿⡀⠀⢘⡄⠀⠀⠀⠙⠢⡤⠤⠇⠀⢸⡇⠀⠀⠀⠀⢀⡴⠋⠉⠙⢦⡀⠀⠀⣿\r\n"
				+ "⣿⣿⡚⠁⠈⠢⣄⠀⠀⠀⠇⠀⠀⢀⡼⣧⠀⠠⡋⠉⠋⠀⠀⠀⠀⠀⠙⢦⠀⣿\r\n"
				+ "⣿⣿⣿⣦⡀⢀⠎⠉⠒⠒⡖⠒⠈⠙⣆⢻⡀⢀⠝⠀⠀⠀⠀⣸⠀⠀⢠⣯⣀⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣤⣄⣀⣀⣇⣀⣀⣤⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠠⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⡏⠀⠀⡇⠀⠀⠀⠀⠉⠉⠙⠓⢶⣆⠀⠀⠀⠉⢧⣀⣀⣀⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣷⣶⣷⣶⣶⣶⠒⠒⠒⠀⠀⢸⣉⣲⣤⣀⣠⣴⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣀⣀⣀⣀⣀⡸⠁⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
				+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⡀⠀⢸⣷⣄⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");

		System.out.println("용사는 죄를 사하기 위해 돈을 벌어야 합니다. 그 돈은 무려 400G !!	 ");
		sc.nextLine();
		System.out.println("용사의 평화로운 노후를 위해 사냥과 도박과 골든벨을 통해 돈을 벌어보세요!");

		
		while (true) {
			sc.nextLine();
			bgm.play(1);
			System.out.println();
			System.out.println("어서오십시오.");
			System.out.println();
			System.out.println("이곳은 로비입니다.");
			System.out
			.println("                                    ___--___\r\n"
					+ "                              ___---___--___-\r\n"
					+ "                        ___---___---        -\r\n"
					+ "                  ___---___---\r\n"
					+ "            ___---___---\r\n"
					+ "      ___---___---\r\n"
					+ " ___---___---_________________________________\r\n"
					+ "=============================================\r\n"
					+ " ||||\r\n"
					+ " |-------------------------------------------\r\n"
					+ " |-___-----___-----___-----___-----___-----__\r\n"
					+ "  / _ \\===/ _ \\   / _ \\===/ _ \\   / _ \\===/ _\r\n"
					+ " ( (.\\ oOo /.) ) ( (.\\ oOo /.) ) ( (.\\ oOo /.\r\n"
					+ "  \\__/=====\\__/   \\__/=====\\__/   \\__/=====\\_\r\n"
					+ "     |||||||         |||||||         |||||||\r\n"
					+ "     ||1번||         ||2번||         ||3번||\r\n"
					+ "     |||||||         |||||||         |||||||\r\n"
					+ "     ||도|||         ||사|||         ||골|||\r\n"
					+ "     |||||||         |||||||         |||||||\r\n"
					+ "     ||박|||         ||냥|||         ||든|||\r\n"
					+ "     |||||||         |||||||         |||||||\r\n"
					+ "     ||장|||         ||터|||         ||벨|||\r\n"
					+ "     |||||||         |||||||         |||||||\r\n"
					+ "     (oOoOo)         (oOoOo)         (oOoOo)\r\n"
					+ "     J%%%%%L         J%%%%%L         J%%%%%L\r\n"
					+ "    ZZZZZZZZZ       ZZZZZZZZZ       ZZZZZZZZZ\r\n"
					+ "   ==========================================\r\n"
					+ " __|_________________________________________");
				
			sc.nextLine();
			System.out.println("남은 기한 " + gameDTO.getDay() + "일");
			System.out.println();
			System.out.println("현재 골드 : " + gameDTO.getGold());
			System.out.println();
			System.out.println("오늘도 행운이 가득하시길.");
			sc.nextLine();
			System.out.println("향할 곳을 정해주세요.");
			System.out.println();
			System.out.println("[1] 도박장 [2] 사냥터 [3] 골든벨");
			System.out.print("갈곳을 선택 하세요 >> ");
			int s = sc.nextInt();
			System.out.println();
			// 야바위 도박장 코드
			if (s == 1) {
				bgm.play(2);
				if (gameDTO.getGold() == 0) {
					System.out.println();
					System.out.println("돈이 없어서 도박장에서 입구 컷 당했습니다.");
					gameDTO.setDay(gameDTO.getDay() + 1);
				} else {
					Controller.YabawiCon yacon = new Controller.YabawiCon();
					System.out.println();
					System.out.println("============ 도박장 =============");
					System.out
					.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⠄⠀⢤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⡗⠂⠀⣀⠀⡀⠀⠐⢷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣯⣾⣿⣼⣿⣾⣿⣆⣿⣷⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⡿⠋⠁⠀⠈⠻⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡿⢯⣓⡠⠀⠠⢖⣺⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⢘⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⢾⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣧⡀⠀⠈⠙⠋⠁⢀⣼⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⡇⠙⡄⠀⠀⢀⣠⣾⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣿⣿⣿⡃⠀⠀⠀⠀⠻⢻⣿⢿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣀⣠⣬⣵⣶⣿⣿⣿⣿⣶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⢀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣄⡂⠀⣶⠄⠀⢉⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
							);
					
					System.out.println("여기는 도박장... 일확천금을 노리시나요? 하이리스크 하이리턴... 거액을 걸어보세요");
					sc.nextLine();
					System.out.println("게임을 시작합니다. ");
					sc.nextLine();
					System.out.println("게임은 야바위게임~ 여러 컵 중에 공이 들어가있는 컵은 단 1개!!");
					sc.nextLine();
					System.out.println("컵이 늘어 날 수록 배당도 늘어납니다.");
					System.out.println();
					System.out.println("컵2개 - 1.5배,  컵3개 - 2배,  컵5개 - 4배");
					sc.nextLine();

					for (int i = 0; i < 2; i++) {
						System.out.println();
						System.out.println("             ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀ ⣴⠦⣄⡀⠀⠀⠀⠀⠀\r\n"
								+ "             ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⣠⠞⠙⠶⣬⡙⠶⣤⡀⠀⠀\r\n"
								+ "             ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⢀⡴⠻⢦⣀⠀⠀⠙⢳⡾⠀⠀⠀\r\n"
								+ "             ⠀⠀⠀⣴⠒⠒⠒⠒⠒⣶⠀⠀⠀⠀⠀⠀⠀ ⢀⡖⠒⠒⠒⠒⢲⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⣰⠟⠀⠀⠀⠉⠻⢦⣄⣼⠁⠀⠀⠀\r\n"
								+ "             ⠀⠀ ⡟⠉⠉⠉⠉⠉⢹⡄⠀⠀⠀⠀⠀⠀ ⢸⠏⠉⠉⠉⠉⠉⣧⠀⠀⠀⠀⠀⠀⠀⠀ ⢠⡾⣧⣀⠀⠀⠀⠀⠀⠀ ⣸⠇⠀⠀⠀⠀\r\n"
								+ "             ⠁ ⢸⣧⣤⣤⣤⣤⣤⣼⡇⠀⠀⠀⠀⠀  ⣾⣤⣤⣤⣤⣤⣤⣿⠀⠀⠀⠀⠀⠀⣴⠶⣏⡙⠲⣭⡳⢦⣀⠀⠀⢰⡏⠀⠀⠀⠀⠀\r\n"
								+ "             ⠀⠀ ⢸⠃⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀⠀ ⢀⡏⠀⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠀⠈⠛⢮⣝⡳⣤ ⣙⠳⢮⣛⢶⡟⠀⠀⠀⠀⠀⠀\r\n"
								+ "             ⠀⠀ ⣿⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⠀⠀⠀ ⢸⡇⠀⠀⠀⠀⠀⠀⠈⣇⠀⠀⠀⠀⠀  ⠀⣀⣤⣎⡙⠶⣭⡳⢦⣉⡿⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "             ⠀⢠⡷⠶⠶⠶⠶⠶⠶⠶⢾⡇⠀⠀⠀⠀⣸⠷⠶⠶⠶⠶⠶⠶⠶⣿⠀⠀⠀⠀ ⢀⣾⣿⣿⣿⣿⣆⠀⠙⠳⢮⡷⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "             ⠀⣸⣋⣉⣉⣉⣉⣉⣉⣉⣉⣧⠀⠀⠀⢀⣟⣉⣉⣉⣉⣉⣉⣉⣉⣹⣀⠀⠀⠀⠐⣷⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
								+ "             ⠸⠯⠭⠭⠭⠭⠭⠭⠭⠭⠭⠽⠇⠀⠀⠿⠭⠭⠭⠭⠭⠭⠭⠭⠭⠭⠽⠀⠀⠀⠀⠘⠻⠿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀");
						System.out.print("컵의 개수를 골라주세요 : ");
						int cupnum = sc.nextInt(); // 컵의 개수
						int gold2;// 사용자가 걸 돈
						while (true) {
							System.out.println();
							System.out.print("골드를 얼마나 거시겠습니까? : ");
						
							gold2 = sc.nextInt();
							if (gameDTO.getGold() >= gold2) {
								gameDTO.setGold(gameDTO.getGold() - gold2);
								break;
							} else {
								System.out.println();
								System.out.println("골드가 부족합니다.");
							}
						}

						if (cupnum == 2 || cupnum == 3 || cupnum == 5) {
							gameDTO.setGold(yacon.goYabawi(cupnum, gold2, gameDTO.getGold()));
						} else {
							System.out.println();
							System.out.println("컵의 개수는 2개, 3개, 5개 중 고르세요");
							i--;
						}
					}
				}
			}
			// 고블린 사냥 코드
			if (s == 2) {
				bgm.play(3);
				if (gameDTO.getHp() == 0) {
					System.out.println("체력이 없는 용사는 사냥을 하기 싫어합니다.");
					gameDTO.setDay(gameDTO.getDay() + 1);
				} else {
					System.out.println("오늘도 뚜벅뚜벅 사냥을 나는 용사...");
					sc.nextLine();
					System.out.println("풀 숲에 흔들리고 있습니다.");
					System.out.println("               |\r\n"
							+ "              /L\\\r\n"
							+ "           ,_/2LS\\_,\r\n"
							+ "             _/L\\_\r\n"
							+ "          ,_//2LS\\\\_,                                 .-~\\__.\r\n"
							+ "              2LS_              |                   ./   /   \\\r\n"
							+ "         ,__//2LS\\\\__,          |                   /     :    ~^-.\r\n"
							+ "     :        /L\\          |   |||             :.-^~ :  _ : '      \r\n"
							+ "    -0-    __/2LS\\__       \\| \\|/  :        :\\|/|  \\|/ ':  `:,  :  \r\n"
							+ "    `|' ,_///22LSS\\\\\\_,    ||  |  `|'     _.\\|X|X|X|X|X:|\\|/ \\|/ `|\r\n"
							+ "     |__////222LSSS\\\\\\\\__,||||/  \\|/.-^~ :\\|X|X|X|X|X|X|| \\,| :\\|/:\r\n"
							+ "    \\|________2LS________  || Y   \\|/    `:\\|X|X|X|X|X|X|  \\X|X|X|X\r\n"
							+ "  '__//////2222LSSS\\\\\\\\\\\\\\_|| |   \\X/    \\|X|X|X|X|X|X|X|   ||X|X|X\r\n"
							+ "   \\ | /      |L|       V Y|| X ..X|/     \\|X|X|X|X|X|X||----\\|X|X|\r\n"
							+ "  \\ \\|/ /     |L|       \\_|||V_/   |      | | | | | | | |_____\\ | |\r\n"
							+ "   \\ | /      |L|         \\||/    -=-=-=-=-=-=-=-=-=  \\-|______/  \r\n"
							+ "    \\|/       |L|          || -=-=-=-=-=-=-=-=         \\______/   \r\n"
							+ "_____|________|LL__________||_____________________________________\r\n"
							+ "");
					sc.nextLine();
					System.out.println("======= 야생의 고블린이 나타났다. =======");
					sc.nextLine();
					System.out.println("             ,      ,\r\n"
							+ "            /(.-\"\"-.)\\\r\n"
							+ "        |\\  \\/      \\/  /|\r\n"
							+ "        | \\ / =.  .= \\ / |\r\n"
							+ "        \\( \\   o\\/o   / )/\r\n"
							+ "         \\_, '-/  \\-' ,_/\r\n"
							+ "           /   \\__/   \\\r\n"
							+ "           \\ \\__/\\__/ /\r\n"
							+ "         ___\\ \\|--|/ /___\r\n"
							+ "       /`    \\      /    `\\\r\n"
							+ "      /       '----'       \\");
					
					GoblinCon goblinCon = new GoblinCon();

					gameDTO.setGold(goblinCon.goGoblin(gameDTO.getHp(), gameDTO.getGold()));
					gameDTO.setHp(gameDTO.getHp() - 5);
				}
			}
			if (s == 3) {
				bgm.play(4);
			
				Controller.GoldenbelCon gc = new Controller.GoldenbelCon();
				System.out.println("===========================골든벨===============================");
				System.out.println("\r\n"
						+ "                 _____  _____  _     ______  _____  _   _ ______  _____  _                     \r\n"
						+ " ______  ______ |  __ \\|  _  || |    |  _  \\|  ___|| \\ | || ___ \\|  ___|| |     ______  ______ \r\n"
						+ "|______||______|| |  \\/| | | || |    | | | || |__  |  \\| || |_/ /| |__  | |    |______||______|\r\n"
						+ " ______  ______ | | __ | | | || |    | | | ||  __| | . ` || ___ \\|  __| | |     ______  ______ \r\n"
						+ "|______||______|| |_\\ \\\\ \\_/ /| |____| |/ / | |___ | |\\  || |_/ /| |___ | |____|______||______|\r\n"
						+ "\r\n");
				System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⣷⣶⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣶⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢼⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣨⣿⣿⣿⣿⣿⣿⣿⣶⣶⣦⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠴⠶⠿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⣿⣿⣿⣿⣿⣿⣿⣟⣁⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣦⡀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "");
				System.out.println("오늘은 골든벨.. 현자가 내는 문제를 풀 수 있는 기회...");
				System.out.println();
				System.out.println("정답자는 상금을 드립니다...");
				System.out.println("");
				sc.nextLine();
				System.out.println("문제는 총 2문제 ");
				System.out.println();
				System.out.println("easy 문제와 hard 문제가 차례로 나옵니다.");
				System.out.println();
				System.out.println("이 문제를 맞춘다면 당신도 언젠간 현자가 될지도?..");
				System.out.println();
				sc.nextLine();

				// 1. easy 문제(덧셈)

				System.out.println("[easy 문제]");
				// 1-1. 문제 출력
				gc.getEasyQuiz();
				int answer = sc.nextInt();
				// 1-2. 답 확인
				gameDTO.setGold(gameDTO.getGold() + gc.getEasyAnswer(answer));

				// 2. hard 문제(곱하기)
				System.out.println();
				System.out.println("[hard 문제]");

				// 1-1. 문제 출력
				gc.getHardQuiz();
				answer = sc.nextInt();
				gameDTO.setGold(gameDTO.getGold() + gc.getHardAnswer(answer));

				System.out.println();
				System.out.println("퀴즈를 풀 수 있는 기회가 소진되었습니다. 내일 다시 도전해주세요.");

			}

			// 날짜 감소
			gameDTO.setDay(gameDTO.getDay() - 1);
			// 마지막날 빚 갚는날
			if (gameDTO.getDay() <= 0) {
				bgm.play(5);
				System.out.println("어서오십시오.");
				System.out.println();
				System.out.println("빚을 갚을 날이 도래했습니다.");
				System.out.println();
				System.out.println("빚 400G를 차감한 현재 골드는 : " + (gameDTO.getGold() - 400));
				int score = gameDTO.getGold() - 400;
				if (score <= 0) {
					gameDAO.insertscore(rId,0);
					System.out.println("용사는 빚을 갚지 못했습니다.");
					sc.nextLine();
					System.out
					.println("\r\n" + "⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣷⣶⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣶⣶⣮⠉⠁⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⡛⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣼⣿⣿⣷⢿⣿⣤⣤⡄\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣾⣽⣿⡅⠀⠉⠉⠉⠁\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⡃⠀⠀⠀⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣽⡷⣿⣿⣆⠀⠀⠀⠀\r\n"
							+ "⠀⣠⣴⣶⣦⡀⠀⠀⠀⠀⠀⠀⢰⣿⣿⠇⠈⣿⣿⠀⠀⠀⠀\r\n"
							+ "⢠⣿⣿⣿⣿⣿⢲⡄⠀⠀⠀⢠⣿⣯⠃⠀⠀⢿⣿⣇⠀⠀\r\n"
							+ "⠀⢻⣿⣿⣿⠛⠉⢦⠀⠀⠀⣟⣾⠁⠀⠀⠀⠸⣿⣿⠀⠀\r\n"
							+ "⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠀⠀⠀⠀\r\n"
							+ "");
					System.out.println("노예가 되어 채석장에 끌려갔습니다.");
					
				} else {
					gameDAO.insertscore(rId,gameDTO.getGold() - 400);
					System.out.println("====== 경축 ======");
					System.out.println();
					System.out.println("빚을 탕감한 용사는");
					sc.nextLine();
					System.out.println("                                       .....'',;;::cccllllllllllllcccc:::;;,,,''...'',,'..\r\n"
							+ "                            ..';cldkO00KXNNNNXXXKK000OOkkkkkxxxxxddoooddddddxxxxkkkkOO0XXKx:.\r\n"
							+ "                      .':ok0KXXXNXK0kxolc:;;,,,,,,,,,,,;;,,,''''''',,''..              .'lOXKd'\r\n"
							+ "                 .,lx00Oxl:,'............''''''...................    ...,;;'.             .oKXd.\r\n"
							+ "              .ckKKkc'...'',:::;,'.........'',;;::::;,'..........'',;;;,'.. .';;'.           'kNKc.\r\n"
							+ "           .:kXXk:.    ..       ..................          .............,:c:'...;:'.         .dNNx.\r\n"
							+ "          :0NKd,          .....''',,,,''..               ',...........',,,'',,::,...,,.        .dNNx.\r\n"
							+ "         .xXd.         .:;'..         ..,'             .;,.               ...,,'';;'. ...       .oNNo\r\n"
							+ "         .0K.         .;.              ;'              ';                      .'...'.           .oXX:\r\n"
							+ "        .oNO.         .                 ,.              .     ..',::ccc:;,..     ..                lXX:\r\n"
							+ "       .dNX:               ......       ;.                'cxOKK0OXWWWWWWWNX0kc.                    :KXd.\r\n"
							+ "     .l0N0;             ;d0KKKKKXK0ko:...              .l0X0xc,...lXWWWWWWWWKO0Kx'                   ,ONKo.\r\n"
							+ "   .lKNKl...'......'. .dXWN0kkk0NWWWWWN0o.            :KN0;.  .,cokXWWNNNNWNKkxONK: .,:c:.      .';;;;:lk0XXx;\r\n"
							+ "  :KN0l';ll:'.         .,:lodxxkO00KXNWWWX000k.       oXNx;:okKX0kdl:::;'',;coxkkd, ...'. ...'''.......',:lxKO:.\r\n"
							+ " oNNk,;c,'',.                      ...;xNNOc,.         ,d0X0xc,.     .dOd,           ..;dOKXK00000Ox:.   ..''dKO,\r\n"
							+ "'KW0,:,.,:..,oxkkkdl;'.                'KK'              ..           .dXX0o:'....,:oOXNN0d;.'. ..,lOKd.   .. ;KXl.\r\n"
							+ ";XNd,;  ;. l00kxoooxKXKx:..ld:         ;KK'                             .:dkO000000Okxl;.   c0;      :KK;   .  ;XXc\r\n"
							+ "'XXdc.  :. ..    '' 'kNNNKKKk,      .,dKNO.                                   ....       .'c0NO'      :X0.  ,.  xN0.\r\n"
							+ ".kNOc'  ,.      .00. ..''...      .l0X0d;.             'dOkxo;...                    .;okKXK0KNXx;.   .0X:  ,.  lNX'\r\n"
							+ " ,KKdl  .c,    .dNK,            .;xXWKc.                .;:coOXO,,'.......       .,lx0XXOo;...oNWNXKk:.'KX;  '   dNX.\r\n"
							+ "  :XXkc'....  .dNWXl        .';l0NXNKl.          ,lxkkkxo' .cK0.          ..;lx0XNX0xc.     ,0Nx'.','.kXo  .,  ,KNx.\r\n"
							+ "   cXXd,,;:, .oXWNNKo'    .'..  .'.'dKk;        .cooollox;.xXXl     ..,cdOKXXX00NXc.      'oKWK'     ;k:  .l. ,0Nk.\r\n"
							+ "    cXNx.  . ,KWX0NNNXOl'.           .o0Ooldk;            .:c;.':lxOKKK0xo:,.. ;XX:   .,lOXWWXd.      . .':,.lKXd.\r\n"
							+ "     lXNo    cXWWWXooNWNXKko;'..       .lk0x;       ...,:ldk0KXNNOo:,..       ,OWNOxO0KXXNWNO,        ....'l0Xk,\r\n"
							+ "     .dNK.   oNWWNo.cXK;;oOXNNXK0kxdolllllooooddxk00KKKK0kdoc:c0No        .'ckXWWWNXkc,;kNKl.          .,kXXk,\r\n"
							+ "      'KXc  .dNWWX;.xNk.  .kNO::lodxkOXWN0OkxdlcxNKl,..        oN0'..,:ox0XNWWNNWXo.  ,ONO'           .o0Xk;\r\n"
							+ "      .ONo    oNWWN0xXWK, .oNKc       .ONx.      ;X0.          .:XNKKNNWWWWNKkl;kNk. .cKXo.           .ON0;\r\n"
							+ "      .xNd   cNWWWWWWWWKOkKNXxl:,'...;0Xo'.....'lXK;...',:lxk0KNWWWWNNKOd:..   lXKclON0:            .xNk.\r\n"
							+ "      .dXd   ;XWWWWWWWWWWWWWWWWWWNNNNNWWNNNNNNNNNWWNNNNNNWWWWWNXKNNk;..        .dNWWXd.             cXO.\r\n"
							+ "      .xXo   .ONWNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNNK0ko:'..OXo          'l0NXx,              :KK,\r\n"
							+ "      .OXc    :XNk0NWXKNWWWWWWWWWWWWWWWWWWWWWNNNX00NNx:'..       lXKc.     'lONN0l.              .oXK:\r\n"
							+ "      .KX;    .dNKoON0;lXNkcld0NXo::cd0NNO:;,,'.. .0Xc            lXXo..'l0NNKd,.              .c0Nk,\r\n"
							+ "      :XK.     .xNX0NKc.cXXl  ;KXl    .dN0.       .0No            .xNXOKNXOo,.               .l0Xk;.\r\n"
							+ "     .dXk.      .lKWN0d::OWK;  lXXc    .OX:       .ONx.     . .,cdk0XNXOd;.   .'''....;c:'..;xKXx,\r\n"
							+ "     .0No         .:dOKNNNWNKOxkXWXo:,,;ONk;,,,,,;c0NXOxxkO0XXNXKOdc,.  ..;::,...;lol;..:xKXOl.\r\n"
							+ "     ,XX:             ..';cldxkOO0KKKXXXXXXXXXXKKKKK00Okxdol:;'..   .';::,..':llc,..'lkKXkc.\r\n"
							+ "     :NX'    .     ''            ..................             .,;:;,',;ccc;'..'lkKX0d;.\r\n"
							+ "     lNK.   .;      ,lc,.         ................        ..,,;;;;;;:::,....,lkKX0d:.\r\n"
							+ "    .oN0.    .'.      .;ccc;,'....              ....'',;;;;;;;;;;'..   .;oOXX0d:.\r\n"
							+ "    .dN0.      .;;,..       ....                ..''''''''....     .:dOKKko;.\r\n"
							+ "     lNK'         ..,;::;;,'.........................           .;d0X0kc'.\r\n"
							+ "     .xXO'                                                 .;oOK0x:.\r\n"
							+ "      .cKKo.                                    .,:oxkkkxk0K0xc'.\r\n"
							+ "        .oKKkc,.                         .';cok0XNNNX0Oxoc,.\r\n"
							+ "          .;d0XX0kdlc:;,,,',,,;;:clodkO0KK0Okdl:,'..\r\n"
							+ "              .,coxO0KXXXXXXXKK0OOxdoc:,..\r\n"
							+ "                        ...");
					System.out.println("행복한 인생을 살았습니다.");
					sc.nextLine();
					
					
					
				}
				System.out.println("랭킹보기");
				sc.nextLine();
				GameDAO dao = new GameDAO();
				ArrayList<GameDTO> LIst = dao.rankingLIst(gameDTO);
				for (int i = 0; i < LIst.size(); i++) {
					System.out.println(i + ". id : " + LIst.get(i).getId() + ", 점수 : " + LIst.get(i).getScore());
				}
				break;
			}

		}
	}
}