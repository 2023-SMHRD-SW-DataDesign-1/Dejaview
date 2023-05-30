package bora;
import java.util.Random;
import java.util.Scanner;

public class Goldenbel {

	public static void main(String[] args) {

		// 골든벨

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int gold = 0;
		
		
		while (true) {// 사용자가 골든벨을 선택했을 때만 작동
			System.out.println("===========================골든벨===============================");
			System.out.println("골든벨은 easy 문제와 hard 문제로 구성되어 있으며 연산문제의 정답을 맞추는 미니게임입니다.");
			System.out.println("easy문제는 덧셈문제, hard 문제는 곱셈 문제입니다. ");
			System.out.println();
			
			
			// easy 문제(덧셈)-1문제
			
			System.out.println("[easy 문제]");
			int num1 = random.nextInt(1, 15);
			int num2 = random.nextInt(1, 15);

			System.out.print(num1 + "+" + num2 + "=");
			int answer = scan.nextInt();

			if (num1 + num2 == answer) {

				gold += 30;
				System.out.println("정답입니다! 30점을 획득하였습니다.");
				System.out.println("현재 골드: " + gold);

			} else if (num1 + num2 != answer) {

				System.out.println("오답입니다. 다시 한 번 도전해보세요.");
			}

			// hard 문제(곱하기)-1문제
			System.out.println();
			System.out.println("[hard 문제]");
			System.out.print(num1 + "*" + num2 + "=");
			answer = scan.nextInt();

			if (num1 * num2 == answer) {

				gold += 50;
				System.out.println("정답입니다! 50점을 획득하였습니다.");
				System.out.println("현재 골드: " + gold);

			} else if (num1 * num2 != answer) {

				System.out.println("오답입니다. 다시 한 번 도전해보세요.");
			}

			System.out.println();
			System.out.println("퀴즈를 풀 수 있는 기회가 소진되었습니다. 내일 다시 도전해주세요.");
			break;
		}

	}

}
