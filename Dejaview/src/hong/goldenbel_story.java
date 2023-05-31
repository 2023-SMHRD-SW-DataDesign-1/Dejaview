package hong;

import java.util.Scanner;

import bora.GoldenbelController;

public class goldenbel_story {

	public static void main(String[] args) {

		// 골든벨

		//객체 생성
		Scanner scan = new Scanner(System.in); //스캐너
		GoldenbelController gc =new GoldenbelController(); //골든벨 컨트롤러
		
		//변수 생성
		int gold = 0; // gold DTO 생성해서 해당 값이 dao로 보내지게 만들면 db에 저장이 됩니다!
		

		while (true) {// 사용자가 골든벨을 선택했을 때만 작동
			System.out.println("===========================골든벨===============================");
			System.out.println("오늘은 골든벨.. 현자가 내는 문제를 풀 수 있는 기회...");
			System.out.println("정답자는 상금을 드립니다...");
			System.out.println("");
			System.out.println("문제는 총 2문제 ");
			System.out.println("easy문제는 덧셈문제, hard 문제는 곱셈 문제입니다. ");
			System.out.println();

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