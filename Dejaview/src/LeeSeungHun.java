import java.util.Random;
import java.util.Scanner;

public class LeeSeungHun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// 회원가입 및 로그인 구간.
		// 로그인 성공시 브레이크로 빠져나옴/!
		int day = 5;
		int money = 0;

		// 영웅캐릭정보 나중에 메소드화
		int hp = 16;
		int ad = 2;

		// 고블린 정보 나중에 메소드화
		int Ghp = 10;
		int Gad = 1;

		while (true) {

			if (day == 0)
				break;
			System.out.println("남은 기한 " + day + "일");
			System.out.println("1. 도박장 2. 사냥터 3. 골든벨");
			System.out.print("갈곳을 선택 하세요 >> ");
			System.out.println();
			int n = sc.nextInt();

			if (n == 1) {
				// 도박장 코드
			}

			if (n == 2) {

				System.out.println("야생의 고블린이 나타났다.");

				System.out.println("⠀⠀⠀⠀⠀⠀⣀⢀⠀");
				System.out.println("⠀⠀⠀⠀⠀⠀⠺⠾⡀⣀");
				System.out.println("⠀⠀⠀⠀⠀⢬⢱⡷⠿⠾⣃⠂⠀");
				System.out.println("⠀⠀⠀⠀⠹⣿⣿⣾⣲⠉⠪⠁⠀");
				System.out.println("⠀⠀⣰⢼⣴⣶⢽⡻⣷⣠⠿⠤⣆⣀⠀");
				System.out.println("⠀⠀⣾⣽⠿⣿⣟⣝⡟⠱⣽⣢⠿⡏⢆⠠⡀⠀");
				System.out.println("⠀⠐⡻⡧⡀⠈⣿⣿⣿⣿⣿⡈⠀⣼⣈⣠⡜⣄⠀⠀");
				System.out.println("⠀⠺⣷⣖⣄⠐⢻⡏⠍⠹⠻⣇⠀⣽⣧⠹⠷⠛⠚⠀");
				System.out.println("⠀⠀⠈⢿⣿⡿⠛⢻⣷⢴⣾⣿⠁⢿⣿⣯⣷⣿⣮⠀");
				System.out.println("⠀⠈⠞⢲⡇⠀⠀⠀⡙⠘⠟⣿⠁⠀⠻⢻⣟⠿⡍⠀");
				System.out.println("⠀⠀⠀⠀⢷⡦⠀⠀⠁⠀⢀⣿⠦⠀⠀⠁⠉⠈⠁⠀");
				System.out.println("⠀⠀⠀⢰⣿⡏⡀⠀⠀⠀⣹⣫⢅⠀⠀⠀⠐⠀⠀⠀");
				System.out.println("⠀⠀⠈⠜⠊⠒⠈⠒⠒⠊⠀⠉⠉⠀⠁⠀⠀⠀");

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
							System.out.println("총 획득한 골드 : " + money);
							break;
						}
					} else {
						System.out.println("잘못된 입력입니다.");
					}
					if (Ghp <= 0) {
						System.out.println("고블린을 잡았습니다.");
						int hunt = rand.nextInt(10);
						if (hunt == 0) {
							money += 200;
							System.out.println("운이 좋았습니다. 황금 고블린이 였습니다. 골드 200G를 획득합니다.");
							System.out.println("현재 골드는 : " + money);
							System.out.println();

						} else {
							money += 100;
							System.out.println("골드 100G를 획득합니다. 현재 골드는 : " + money);
							System.out.println();
						}

						Ghp = 10;
						break;
					}
				}

			}

			if (n == 3) {
				// 골든벨 코드
			}

			day--;
		}
	}

}
