package hong;

import java.util.Random;
import java.util.Scanner;

public class Yabawi {

	public static void main(String[] args) {
		Yabawi_controller yacon = new Yabawi_controller();
		Scanner sc = new Scanner(System.in);

		int gold = 1000;// 임시변수 - 사용자가 가지고 있는 돈

		System.out.println("====== 도박장 =======");
		System.out.println("\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀ ⣴⠦⣄⡀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⣠⠞⠙⠶⣬⡙⠶⣤⡀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⢀⡴⠻⢦⣀⠀⠀⠙⢳⡾⠀⠀⠀\r\n"
				+ "⠀⠀⠀⣴⠒⠒⠒⠒⠒⣶⠀⠀⠀⠀⠀⠀⠀ ⢀⡖⠒⠒⠒⠒⢲⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⣰⠟⠀⠀⠀⠉⠻⢦⣄⣼⠁⠀⠀⠀\r\n"
				+ "⠀⠀ ⡟⠉⠉⠉⠉⠉⢹⡄⠀⠀⠀⠀⠀⠀ ⢸⠏⠉⠉⠉⠉⠉⣧⠀⠀⠀⠀⠀⠀⠀⠀ ⢠⡾⣧⣀⠀⠀⠀⠀⠀⠀ ⣸⠇⠀⠀⠀⠀\r\n"
				+ "⠁ ⢸⣧⣤⣤⣤⣤⣤⣼⡇⠀⠀⠀⠀⠀  ⣾⣤⣤⣤⣤⣤⣤⣿⠀⠀⠀⠀⠀⠀⣴⠶⣏⡙⠲⣭⡳⢦⣀⠀⠀⢰⡏⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀ ⢸⠃⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀⠀ ⢀⡏⠀⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠀⠈⠛⢮⣝⡳⣤ ⣙⠳⢮⣛⢶⡟⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀ ⣿⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⠀⠀⠀ ⢸⡇⠀⠀⠀⠀⠀⠀⠈⣇⠀⠀⠀⠀⠀  ⠀⣀⣤⣎⡙⠶⣭⡳⢦⣉⡿⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⢠⡷⠶⠶⠶⠶⠶⠶⠶⢾⡇⠀⠀⠀⠀⣸⠷⠶⠶⠶⠶⠶⠶⠶⣿⠀⠀⠀⠀ ⢀⣾⣿⣿⣿⣿⣆⠀⠙⠳⢮⡷⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⣸⣋⣉⣉⣉⣉⣉⣉⣉⣉⣧⠀⠀⠀⢀⣟⣉⣉⣉⣉⣉⣉⣉⣉⣹⣀⠀⠀⠀⠐⣷⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠸⠯⠭⠭⠭⠭⠭⠭⠭⠭⠭⠽⠇⠀⠀⠿⠭⠭⠭⠭⠭⠭⠭⠭⠭⠭⠽⠀⠀⠀⠀⠘⠻⠿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "");
		System.out.println("여기는 도박장... 일확천금을 노리시나요? 하이리스크 하이리턴... 거액을 걸어보세요  (Enter..)");
		sc.nextLine();
		System.out.println("게임을 시작합니다. ");
		sc.nextLine();
		System.out.println("게임은 야바위게임~ 여러 컵 중에 공이 들어가있는 컵은 단 1개!!");
		sc.nextLine();
		System.out.println("컵이 늘어 날 수록 배당도 늘어납니다.");
		System.out.println("(배당률: 컵2개 - 1.5배,  컵3개 - 2배,  컵5개 - 4배)");
		sc.nextLine();

		for (int i = 0; i < 2; i++) {
			System.out.print("컵의 개수를 골라주세요 : ");
			int cupnum = sc.nextInt(); // 컵의 개수
			int gold2;// 사용자가 걸 돈
			while (true) {
				System.out.print("골드를 얼마나 거시겠습니까? : ");
				gold2 = sc.nextInt();
				if (gold >= gold2) {
					gold -= gold2;
					break;
				} else {
					System.out.println("골드가 부족합니다.");
				}
			}

			if (cupnum == 2 || cupnum == 3 || cupnum == 5) {
				gold = yacon.goYabawi(cupnum, gold2, gold);
			} else {
				System.out.println("컵의 개수는 2개, 3개, 5개 중 고르세요");
				i--;
			}

		}

	}

}
