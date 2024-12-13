import java.util.Scanner;

// 	반복문 - break문 활용
public class controltest175 {

	public static void main(String[] args) {

//		사용자가 입력한 숫자를 모두 누적해서 계산하는 
//	      프로그램 구현
//	      
//	      사용자가 키보드로 입력한다
//	      300
//	      누적금액: 300
//	      
//	      400
//	      누적금액: 700      
//	      
//	      1000
//	      누적금액: 1700
//	      
//	      언젠가는 사용자가 0을 입력하면 최종금액을 출력하고 프로그램 종료
//	      
//	      0을 입력하면
//	      3번 구매한 총 금액은 1700원 입니다.
//	      
//	      구매해 주셔서 감사합니다

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("가격을 입력하세요");
			num1 = sc.nextInt();
			num3 = num1 + num3;
			if (num1 == 0) {
				System.out.println(num2 + "번 구매한 총 금액은" + num3 +"입니다.");
				break;
			}//else {
				System.out.println("누적금액" + num3);
			//}
			num2 = num2 + 1;
		}
		System.out.println("구매해 주셔서 감사합니다");
		
	}
}
