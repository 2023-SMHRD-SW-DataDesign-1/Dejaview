import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BgmController con = new BgmController();
		
		con.play();
		
		System.out.print("정지 버튼 누름 >> ");
		int num = sc.nextInt();
		if (num == 1) {
			con.stop();
		}

	}

}
