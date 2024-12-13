// 반복문 - 치환의 의미

import java.util.Scanner;

public class Controltest175_2 {

	public static void main(String[] args) {

		int user, com;
		String userHandStr = "";
		String comHandStr = "";
		
//		의미 치환? 
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력");

		Scanner scan = new Scanner(System.in);

		user = scan.nextInt();
//		0.000000 ~ 0.99999999999	0,1,2
//									1,2,3
		com = (int) (Math.random() * 3) + 1;
//									범위  최소 시작값
//		
//		개발코드와 사용자의 상호작용 사이의 치환 로직
		for (int i = 0; i < 3; i++) {
			
			if (user == 1) {
				userHandStr = "가위";
			} else if (user == 2) {
				userHandStr = "바위";
			} else if (user == 3) {
				userHandStr = "보";
			}
			if (com == 1) {
				comHandStr = "가위";
			} else if (com == 2) {
				comHandStr = "바위";
			} else if (com == 3) {
				comHandStr = "보";
			}
			System.out.println("당신은 " + userHandStr + "입니다");
			System.out.println("컴은 " + comHandStr + "입니다");
			System.out.println();

			// 컴퓨터 숫자값 치환
			// 가이위바위보 게임은 3판 하는데 한판이라도 이기면 승리하는 게임
			// 프로그램이 종료되도록 하시오

			switch (user - com) {
			case 2, -1:
				System.out.println("당신이 졌습니다.");
				break;
			case 1, -2: 
				System.out.println("당신이 이겼습니다.");
				break;
			
			case 0: 
				System.out.println("비겼습니다");
				break;
			}

			
		}
		System.out.println("프로그램 종료");

		scan.close();

	}

}
