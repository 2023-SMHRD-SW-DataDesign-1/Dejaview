package Controller;

import java.util.Random;
import java.util.Scanner;

public class GoblinCon {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int Ghp = 10;

	public int goGoblin(int hp, int gold) {
		while (true) {
			System.out.print("공격을 하세요 >> ");
			System.out.println("1. 공격 2. 방어 3. 도망");
			int ck = sc.nextInt();
			if (ck == 1) {
				System.out.println("\r\n"
						+ "              (O) \r\n"
						+ "              &lt;M \r\n"
						+ "   o          &lt;M \r\n"
						+ "  /| ......  /:M\\------------------------------------------------,,,,,, \r\n"
						+ "(O)[]XXXXXX[]I:K+}=====&lt;{H}&gt;================================------------&gt; \r\n"
						+ "  \\| ^^^^^^  \\:W/------------------------------------------------'''''' \r\n"
						+ "   o          &lt;W \r\n"
						+ "              &lt;W \r\n"
						+ "              (O) \r\n"
						+ "");
				Ghp -= 2;
				System.out.println("고블린 의 HP가 " + Ghp + "남았습니다.");
				hp--;
				System.out.println("용사의 HP은 " + hp + "남았습니다.");
				System.out.println();
				System.out.println("=============================================================");
				if (hp <= 0) {
					System.out.println("용사의 체력이 다떨어졌습니다.");
					System.out.println("더이상 사냥터에 나가지 못합니다.");
				}

			} else if (ck == 2) {
				System.out.println("방어에 성공 했습니다.");
				System.out.println("\r\n"
						+ "|`--,___,--'|\r\n"
						+ "|E          |\r\n"
						+ "|T  )   (   |\r\n"
						+ "|E ((,-,))  |\r\n"
						+ "|R `|v v|'  |\r\n"
						+ "|N   Y.Y    |\r\n"
						+ "|A   {.}    |\r\n"
						+ "|L   {.}    |\r\n"
						+ " \\    ~    /\r\n"
						+ "   \\,___,/\r\n"
						+ "");	
				System.out.println("서로 데미지를 입지 않았습니다.");
				System.out.println("=============================================================");
			} else if (ck == 3) {
				System.out.println("용사는 도망을 갔습니다.");
				System.out.println(" ─=≡Σ ﾍ( ´Д`)ﾉ");
				System.out.println("그러나 우사인볼트보다빠른 고블린이 따라잡았습니다.");
				System.out.println("=============================================================");
			}

			else {
				System.out.println("잘못된 입력입니다.");
				System.out.println("=============================================================");
			}
			if (Ghp <= 0) {
				System.out.println("고블린을 잡았습니다.");
				int hunt = rand.nextInt(10);
				if (hunt == 0) {
					gold += 200;
					System.out.println("                                         \r\n"
							+ "                                  ████            \r\n"
							+ "                            ██████    ██          \r\n"
							+ "                      ██████            ██        \r\n"
							+ "                ██████                    ██      \r\n"
							+ "              ██░░                  ▒▒▒▒▒▒▒▒██    \r\n"
							+ "              ██  ░░          ▒▒▒▒▒▒        ██    \r\n"
							+ "              ██    ░░  ▒▒▒▒▒▒          ▒▒▒▒██    \r\n"
							+ "              ██      ░░          ▒▒▒▒▒▒▒▒▒▒██    \r\n"
							+ "              ██▒▒▒▒  ░░    ▒▒▒▒▒▒▒▒▒▒██████      \r\n"
							+ "                ██▒▒░░░░▒▒▒▒▒▒▒▒██████            \r\n"
							+ "                  ██▒▒░░▒▒██████                  \r\n"
							+ "                    ██████                        \r\n"
							+ "                                                ");
					sc.nextLine();
					System.out.println("운이 좋았습니다. 황금 고블린이 였습니다. 골드 200G를 획득합니다.");
					System.out.println();
					System.out.println("=============================================================");
					break;
				} else {
					gold += 100;
					System.out.println("골드 100G를 획득합니다.");
					System.out.println();
					System.out.println("=============================================================");
					break;
				}

			}
		}
		return gold;
	}

}
