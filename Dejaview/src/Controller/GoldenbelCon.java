package Controller;

import java.util.Random;

public class GoldenbelCon {

	int num1; 
	int num2;
	int gold;
	Random rd = new Random();
	
	//랜덤 수 부여하기
	public void getRandom() {
		num1 = rd.nextInt(1, 15);
		num2 = rd.nextInt(1, 15);
	}
	
	
	//덧셈퀴즈 문제 출력하기
	public void getEasyQuiz() {
		
		getRandom();
		System.out.print(num1 + "+"+num2+"=");
	}
	
	//곱셈퀴즈 문제 출력하기
	public void getHardQuiz() {
		
		getRandom();
		System.out.print(num1 + "*"+num2+"=");
	}
	
	
	
	// 덧셈문제 답 확인
	public int getEasyAnswer(int answer) {
		if(num1+num2 == answer) {
			System.out.println("정답입니다! 30 골드를 획득하였습니다.");
			gold += 30;
			
		}else {
			System.out.println("오답입니다. 다시 한 번 도전해보세요.");
			gold += 0;
		}
		return gold;
		
	}
	
	//곱셈문제 답 확인
	public int getHardAnswer(int answer) {
		if(num1*num2 == answer) {
			System.out.println("정답입니다! 50 골드를 획득하였습니다.");
			gold+=50;
			
		}else {
			System.out.println("오답입니다. 다시 한 번 도전해보세요.");
			gold += 0;
		}
		return gold;
	}
	
	
	
}
