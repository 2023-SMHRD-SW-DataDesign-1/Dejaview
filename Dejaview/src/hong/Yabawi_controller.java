package hong;

import java.util.Random;
import java.util.Scanner;

public class Yabawi_controller {

	 Scanner sc = new Scanner(System.in);
	 Random rand = new Random();

	   double rate[] = {0,0,1.5,2,0,4};

	    public int goYabawi(int cupnum, int gold2, int gold){

	        System.out.println("컵은 " + cupnum + "개! 공은 하나! 확률은..." + 1 / (double) cupnum);

	        int ball = rand.nextInt(cupnum) + 1;
	        int guess;
	        while (true) {
	            System.out.println("컵을 골라 주세요 >> ");
	            guess = sc.nextInt();
	            if (guess <= 0 || guess > cupnum) {
	                System.out.println("컵 번호를 확인해 주세요");
	            } else {
	                break;
	            }
	        }
	        if (ball == guess) {
	            System.out.println("축하드립니다");
	            gold2 *= rate[cupnum];
	            System.out.println("획득한 골드는 " + gold2 + "G 입니다");
	            gold += gold2;
	        } else {
	            System.out.println("틀렸습니다~~~~");
	        }

	        return gold;
	    }
	
}
