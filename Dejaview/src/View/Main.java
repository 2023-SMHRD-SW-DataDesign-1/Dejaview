package View;

import java.util.Scanner;

import Controller.JoinCon;
import Controller.LoginCon;


import Controller.GoblinCon;
import Controller.JoinCon;
import Controller.LoginCon;
import Model.GameDAO;

import Model.GameDTO;

public class Main {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      GameDTO gameDTO = new GameDTO(null, null);
	      GameDAO gameDAO = new GameDAO();
	      // 회원가입 구간
	      while (true) {
	         System.out.println("1. 회원가입 2. 로그인 3. 랭킹보기");
	         int n = sc.nextInt();
	         int b = 0;
	         if (n == 1) {

	            System.out.println("== 회원가입 ==");
	            System.out.print("ID 입력 >> ");
	            String id = sc.next();
	            System.out.print("PW 입력 >> ");
	            String pw = sc.next();

	            JoinCon joinCon = new JoinCon();
	            String result = joinCon.join(new GameDTO(id, pw));

	            System.out.println("회원가입에 " + result + "하셨습니다.");

	         }
	         // 로그인 구간
	         if (n == 2) {
	            System.out.println("== 로그인 ==");
	            System.out.print("ID 입력 >> ");
	            String id = sc.next();
	            System.out.print("PW 입력 >> ");
	            String pw = sc.next();

	            LoginCon loginCon = new LoginCon();
	            String name = loginCon.login(new GameDTO(id, pw));

	            if (name != null) {
	               System.out.println(name + "님 로그인에 성공하셨습니다.");
	               b = 1;
	               break;
	            } else {
	               System.out.println("아이디와 비밀번호를 잘못입력하셨습니다.");
	            }
	            if (b == 1)
	               break;
	         }
	         // 랭킹확인
	         if (n == 3) {
	            gameDAO.rankingLIst(gameDTO);
	         }

	         if (b == 1)
	            break;
	      }
	      // 로그인 성공시 브레이크로 빠져나옴.
	      // 변수값 DTO로 넘김

	      gameDTO.setDay(5); // 게임 기한 설정
	      // 스토리 설명
	      sc.nextLine();
	      System.out.println("마왕이 없는 평화로운 도시에 큰 사건이 일어났습니다. ");
	      sc.nextLine();
	      System.out.println("용사는 음주 말로 왕국의 벽을 부시는 사고를 냈습니다.");
	      sc.nextLine();
	      System.out.println("왕국에 5일안에 400G를 갚으세요!");

	      while (true) {
	         System.out.println();
	         System.out.println("어서오십시오.");
	         System.out.println("이곳은 로비입니다.");
	         sc.nextLine();
	         System.out.println("남은 기한 " + gameDTO.getDay() + "일");
	         System.out.println("현재 골드 : " + gameDTO.getGold());
	         System.out.println("오늘도 행운이 가득하시길.");
	         sc.nextLine();
	         System.out.println("향할 곳을 정해주세요.");
	         System.out.println("[1] 도박장 [2] 사냥터 [3] 골든벨");
	         System.out.print("갈곳을 선택 하세요 >> ");
	         int s = sc.nextInt();
	         System.out.println();
	         // 야바위 도박장 코드
	         if (s == 1) {
	            Controller.YabawiCon yacon = new Controller.YabawiCon();
	            System.out.println("\r\n"
	                  + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀\r\n"
	                  + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀ ⣴⠦⣄⡀⠀⠀⠀⠀⠀\r\n"
	                  + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⣠⠞⠙⠶⣬⡙⠶⣤⡀⠀⠀\r\n"
	                  + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⢀⡴⠻⢦⣀⠀⠀⠙⢳⡾⠀⠀⠀\r\n"
	                  + "⠀⠀⠀⣴⠒⠒⠒⠒⠒⣶⠀⠀⠀⠀⠀⠀⠀ ⢀⡖⠒⠒⠒⠒⢲⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⣰⠟⠀⠀⠀⠉⠻⢦⣄⣼⠁⠀⠀⠀\r\n"
	                  + "⠀⠀ ⡟⠉⠉⠉⠉⠉⢹⡄⠀⠀⠀⠀⠀⠀ ⢸⠏⠉⠉⠉⠉⠉⣧⠀⠀⠀⠀⠀⠀⠀⠀ ⢠⡾⣧⣀⠀⠀⠀⠀⠀⠀ ⣸⠇⠀⠀⠀⠀\r\n"
	                  + "⠁ ⢸⣧⣤⣤⣤⣤⣤⣼⡇⠀⠀⠀⠀⠀  ⣾⣤⣤⣤⣤⣤⣤⣿⠀⠀⠀⠀⠀⠀⣴⠶⣏⡙⠲⣭⡳⢦⣀⠀⠀⢰⡏⠀⠀⠀⠀⠀\r\n"
	                  + "⠀⠀ ⢸⠃⠀⠀⠀⠀⠀⠀⣧⠀⠀⠀⠀⠀ ⢀⡏⠀⠀⠀⠀⠀⠀⢸⡆⠀⠀⠀⠀⠀⠈⠛⢮⣝⡳⣤ ⣙⠳⢮⣛⢶⡟⠀⠀⠀⠀⠀⠀\r\n"
	                  + "⠀⠀ ⣿⠀⠀⠀⠀⠀⠀⠀⢻⠀⠀⠀⠀⠀ ⢸⡇⠀⠀⠀⠀⠀⠀⠈⣇⠀⠀⠀⠀⠀  ⠀⣀⣤⣎⡙⠶⣭⡳⢦⣉⡿⠀⠀⠀⠀⠀⠀⠀\r\n"
	                  + "⠀⢠⡷⠶⠶⠶⠶⠶⠶⠶⢾⡇⠀⠀⠀⠀⣸⠷⠶⠶⠶⠶⠶⠶⠶⣿⠀⠀⠀⠀ ⢀⣾⣿⣿⣿⣿⣆⠀⠙⠳⢮⡷⠀⠀⠀⠀⠀⠀⠀\r\n"
	                  + "⠀⣸⣋⣉⣉⣉⣉⣉⣉⣉⣉⣧⠀⠀⠀⢀⣟⣉⣉⣉⣉⣉⣉⣉⣉⣹⣀⠀⠀⠀⠐⣷⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
	                  + "⠸⠯⠭⠭⠭⠭⠭⠭⠭⠭⠭⠽⠇⠀⠀⠿⠭⠭⠭⠭⠭⠭⠭⠭⠭⠭⠽⠀⠀⠀⠀⠘⠻⠿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
	                  + "");
	            System.out.println("====== 도박장 =======");
	            System.out.println("여기는 도박장... 일확천금을 노리시나요? 하이리스크 하이리턴... 거액을 걸어보세요");
	            sc.nextLine();
	            System.out.println("게임을 시작합니다. ");
	            sc.nextLine();
	            System.out.println("게임은 야바위게임~ 여러 컵 중에 공이 들어가있는 컵은 단 1개!!");
	            sc.nextLine();
	            System.out.println("컵이 늘어 날 수록 배당도 늘어납니다.");
	            System.out.println("컵2개 - 1.5배,  컵3개 - 2배,  컵5개 - 4배");
	            sc.nextLine();

	            for (int i = 0; i < 2; i++) {
	               System.out.print("컵의 개수를 골라주세요 : ");
	               int cupnum = sc.nextInt(); // 컵의 개수
	               int gold2;// 사용자가 걸 돈
	               while (true) {
	                  System.out.print("골드를 얼마나 거시겠습니까? : ");
	                  gold2 = sc.nextInt();
	                  if (gameDTO.getGold() >= gold2) {
	                     gameDTO.setGold(gameDTO.getGold() - gold2);
	                     break;
	                  } else {
	                     System.out.println("골드가 부족합니다.");
	                  }
	               }

	               if (cupnum == 2 || cupnum == 3 || cupnum == 5) {
	                  gameDTO.setGold(yacon.goYabawi(cupnum, gold2, gameDTO.getGold()));
	               } else {
	                  System.out.println("컵의 개수는 2개, 3개, 5개 중 고르세요");
	                  i--;
	               }

	            }
	         }
	         // 고블린 사냥 코드
	         if (s == 2) {
	            if (gameDTO.getHp() == 0) {
	               System.out.println("용사의 체력이 없습니다.");
	               gameDTO.setDay(gameDTO.getDay() + 1);
	            } else {
	               System.out.println("======= 야생의 고블린이 나타났다. =======");
	               sc.nextLine();
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

	               GoblinCon goblinCon = new GoblinCon();

	               gameDTO.setGold(goblinCon.goGoblin(gameDTO.getHp(), gameDTO.getGold()));
	               gameDTO.setHp(gameDTO.getHp() - 5);
	            }
	         }
	         if (s == 3) {
	            Controller.GoldenbelCon gc = new Controller.GoldenbelCon();
	            System.out.println("===========================골든벨===============================");
	            System.out.println("골든벨은 easy 문제와 hard 문제로 구성되어 있으며 연산문제의 정답을 맞추는 미니게임입니다.");
	            System.out.println("easy문제는 덧셈문제, hard 문제는 곱셈 문제입니다. ");
	            System.out.println();

	            // 1. easy 문제(덧셈)

	            System.out.println("[easy 문제]");
	            // 1-1. 문제 출력
	            gc.getEasyQuiz();
	            int answer = sc.nextInt();
	            // 1-2. 답 확인
	            gameDTO.setGold(gameDTO.getGold() + gc.getEasyAnswer(answer));

	            // 2. hard 문제(곱하기)
	            System.out.println();
	            System.out.println("[hard 문제]");

	            // 1-1. 문제 출력
	            gc.getHardQuiz();
	            answer = sc.nextInt();
	            gameDTO.setGold(gameDTO.getGold() + gc.getHardAnswer(answer));

	            System.out.println();
	            System.out.println("퀴즈를 풀 수 있는 기회가 소진되었습니다. 내일 다시 도전해주세요.");

	         }

	         // 날짜 감소
	         gameDTO.setDay(gameDTO.getDay() - 1);
	         // 마지막날 빚 갚는날
	         if (gameDTO.getDay() <= 0) {
	            System.out.println("어서오십시오.");
	            System.out.println("빚을 갚을 날이 도래했습니다.");
	            System.out.println("빚 400G를 차감한 현재 골드는 : " + (gameDTO.getGold() - 400));
	            sc.close();
	            break;
	         }

	      }
	}
}