import java.util.Scanner;
// 조건문 switch
public class controltest146_1 {

	public static void main(String[] args) {

//		한국의 4계절을 출력하는 프로그램 구현
//      
//      사용자로부터 값을 달을 입력받는다
//      
//      4를 입력받으면
//      
//      4월은 봄입니다 라고 출력된다
//      
//      만약 12를 입력받으면
//      12월은 겨울입니다 라고 출력한다



		Scanner sc = new Scanner(System.in);
		
		System.out.println("달을 입력하세요");
		
		int month = sc.nextInt();
		
		switch (month) {
			case 1:
			case 2:
			case 12:
				System.out.println(month + "월은 겨울 입니다");
				break;
			case 4:			
			case 5:
				System.out.println(month + "월은 봄 입니다");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month + "월은 여름 입니다");
				break;
			case 9:	
			case 10:
			case 11:
				System.out.println(month + "월은 가을 입니다");
				break;
			
			default:
				break;
		}
	}
}
