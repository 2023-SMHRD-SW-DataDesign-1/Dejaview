package bora;

import java.util.Scanner;

public class Goldenbel {

	public static void main(String[] args) {

		// 골든벨

		//객체 생성
		Scanner scan = new Scanner(System.in); //스캐너
		GoldenbelController gc =new GoldenbelController(); //골든벨 컨트롤러
		
		//변수 생성
		int gold = 0; // gold DTO 생성해서 해당 값이 dao로 보내지게 만들면 db에 저장이 됩니다!
		

		System.out.println("\r\n"
				+ "                 _____  _____  _     ______  _____  _   _ ______  _____  _                     \r\n"
				+ " ______  ______ |  __ \\|  _  || |    |  _  \\|  ___|| \\ | || ___ \\|  ___|| |     ______  ______ \r\n"
				+ "|______||______|| |  \\/| | | || |    | | | || |__  |  \\| || |_/ /| |__  | |    |______||______|\r\n"
				+ " ______  ______ | | __ | | | || |    | | | ||  __| | . ` || ___ \\|  __| | |     ______  ______ \r\n"
				+ "|______||______|| |_\\ \\\\ \\_/ /| |____| |/ / | |___ | |\\  || |_/ /| |___ | |____|______||______|\r\n"
				+ "                 \\____/ \\___/ \\_____/|___/  \\____/ \\_| \\_/\\____/ \\____/ \\_____/                \r\n"
				+ "                                                                                               \r\n"
				+ "                                                                                               \r\n"
				+ "");
		
		while (true) {// 사용자가 골든벨을 선택했을 때만 작동
			System.out.println("골든벨은 easy 문제와 hard 문제로 구성되어 있으며 연산문제의 정답을 맞추는 미니게임입니다.");
			System.out.println("easy문제는 덧셈문제, hard 문제는 곱셈 문제입니다. ");

			//1. easy 문제(덧셈)

			System.out.println("[easy 문제]");
			//1-1. 문제 출력
			gc.getEasyQuiz();
			int answer = scan.nextInt();
			//1-2. 답 확인
			gc.getEasyAnswer(answer);

			//2. hard 문제(곱하기)
			System.out.println();
			System.out.println("[hard 문제]");
			
			//1-1. 문제 출력
			gc.getHardQuiz();
			answer = scan.nextInt();
			gc.getHardAnswer(answer);
			
			System.out.println();
			System.out.println("퀴즈를 풀 수 있는 기회가 소진되었습니다. 내일 다시 도전해주세요.");
			break;

		}

		
		
		
		
	}
}
