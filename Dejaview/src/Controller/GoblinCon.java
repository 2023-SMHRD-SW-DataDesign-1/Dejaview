package Controller;

import java.util.Random;
import java.util.Scanner;
import Model.GameDTO;

public class GoblinCon {

	 Scanner sc = new Scanner(System.in);
	 Random rand = new Random();
	 int Ghp = 10;

	    public int goGoblin(int hp, int gold){
	    	while (true) {
				System.out.print("공격을 하세요 >> ");
				System.out.println("1. 공격");
				int ck = sc.nextInt();
				if (ck == 1) {
					Ghp -= 2;
					System.out.println("고블린 의 HP가 " + Ghp + "남았습니다.");
					hp--;
					System.out.println("용사의 HP은 " + hp + "남았습니다.");
					System.out.println();
					if (hp <= 0) {
						System.out.println("용사의 체력이 다떨어졌습니다.");
						System.out.println("더이상 사냥터에 나가지 못합니다.");
					}
				} else {
					System.out.println("잘못된 입력입니다.");
				}
				if (Ghp <= 0) {
					System.out.println("고블린을 잡았습니다.");
					int hunt = rand.nextInt(10);
					if (hunt == 0) {
						gold += 200;
						System.out.println("   .aMMMMP    .aMMMb     dMP     dMMMMb ");
						System.out.println("  dMP\"       dMP\"dMP    dMP     dMP VMP ");
						System.out.println(" dMP MMP\"   dMP dMP    dMP     dMP dMP  ");
						System.out.println("dMP.dMP    dMP.aMP    dMP     dMP.aMP");
						System.out.println("VMMMP\"     VMMMP\"    dMMMMMP dMMMMP\"   ");
						sc.nextLine();
						System.out.println("운이 좋았습니다. 황금 고블린이 였습니다. 골드 200G를 획득합니다.");
						System.out.println();
						break;
					} else {
						gold += 100;
						System.out.println("골드 100G를 획득합니다.");
						System.out.println();
						break;
					}

				
				}
			}
			return gold;
	    }
	
	
}
