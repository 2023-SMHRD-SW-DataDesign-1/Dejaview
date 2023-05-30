import java.util.Scanner;

public class Lobby {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int day = 5;
		
		while (true) {
			if (day == 5) {
				System.out.println("처음 뵙겠습니다.");
				System.out.println("이곳은 로비입니다.");
				System.out.println("향할 곳을 정해주세요.");
				System.out.println("[1] 도박장 [2] 사냥터 [3] 골든벨");
				System.out.print("결정 >> ");
				int sel = sc.nextInt();
				System.out.println("===============================");
				day--;
			} else if (day > 0) {
				System.out.println("어서오십시오.");
				System.out.println("이곳은 로비입니다.");
				System.out.println("오늘도 행운이 가득하시길.");
				System.out.println("향할 곳을 정해주세요.");
				System.out.println("[1] 도박장 [2] 사냥터 [3] 골든벨");
				System.out.print("결정 >> ");
				int sel2 = sc.nextInt();
				System.out.println("===============================");
				day--;
			} else {
				System.out.println("어서오십시오.");
				System.out.println("빚을 갚을 날이 도래했습니다.");
				break;	
			}
		}

	}

}
