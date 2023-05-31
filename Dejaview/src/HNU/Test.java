package HNU;
import java.util.Scanner;

import Controller.BgmController;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BgmController bgm = new BgmController();
		
		bgm.play(0);
		
		System.out.print("정지 버튼 누름 >> ");
		int num = sc.nextInt();
		if (num == 0) {
			bgm.stop();
		}

	}

}
