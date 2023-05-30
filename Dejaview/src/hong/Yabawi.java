package hong;

import java.util.Random;
import java.util.Scanner;

public class Yabawi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("====== 도박장 =======");
		System.out.println("여기는 도박장... 일확천금을 노리시나요? 하이리스크 하이리턴... 거액을 걸어보세요");
		System.out.println("게임을 시작합니다. 게임은 야바위게임~ 여러 컵 중에 공이 들어가있는 컵은 단 1개!!");
		System.out.println("컵이 늘어 날 수록 배당도 늘어납니다.");
		System.out.println("컵2개 - 1.5배,  컵3개 - 2배,  컵5개 - 4배");

		for (int i = 0; i < 2; i++) {
			System.out.print("컵의 개수를 골라주세요 : ");
			int cupnum = sc.nextInt(); // 컵의 개수
			int ball; // 컵에 들어있는 볼 위치
			int guess;// 사용자가 고를 컵

			System.out.print("골드를 얼마나 거시겠습니까? : ");
			double gold = sc.nextInt();

			// 이어 붙일때 전체 골드에서 차감할 기능 추가 + 걸 돈의 최대값 지정

			if (cupnum == 2) {
				System.out.println("컵은 " + cupnum + "개! 공은 하나! 확률은..." + 1 / (double) cupnum);

				ball = rd.nextInt(cupnum) + 1;
				System.out.println("컵을 골라 주세요 >> ");
				guess = sc.nextInt();
				if (ball == guess) {
					System.out.println("축하드립니다");
					gold *= 1.5;
					System.out.println("획득한 골드는 " + gold + "G 입니다");

				} else {
					System.out.println("틀렸습니다~~~~");
					gold = 0;
				}

			} else if (cupnum == 3) {
				System.out.println("컵은 " + cupnum + "개! 공은 하나! 확률은..." + 1 / (double) cupnum);
				ball = rd.nextInt(cupnum) + 1;
				System.out.println("컵을 골라 주세요 >> ");
				guess = sc.nextInt();
				if (ball == guess) {
					System.out.println("축하드립니다");
					gold *= 2;
					System.out.println("획득한 골드는 " + gold + "G 입니다");

				} else {
					System.out.println("틀렸습니다~~~~");
					gold = 0;
				}

			} else if (cupnum == 5) {
				System.out.println("컵은 " + cupnum + "개! 공은 하나! 확률은..." + 1 / (double) cupnum);
				ball = rd.nextInt(cupnum) + 1;
				System.out.println("컵을 골라 주세요 >> ");
				guess = sc.nextInt();
				if (ball == guess) {
					System.out.println("축하드립니다");
					gold *= 4;
					System.out.println("획득한 골드는 " + gold + "G 입니다");

				} else {
					System.out.println("틀렸습니다~~~~");
					gold = 0;
				}
			} else {
				System.out.println("컵의 개수는 2개, 3개, 5개 중 고르세요");
				i--;
			}

		}

	}

}
