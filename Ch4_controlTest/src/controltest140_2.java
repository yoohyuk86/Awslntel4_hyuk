
import java.util.Scanner;

public class controltest140_2 {

	public static void main(String[] args) {

//		숫자를 하나 키보드로 입력 받는데 
		Scanner sc = new Scanner(System.in);

//	      -999을 입력받으면 프로그램을 종료한다
//	      -999가 아닌 수를 입력받은 후
//	      
//	      다시 숫자를 입력받는데
//	      1이면 남성
//	      2이면 여성이라고 출력한다
//	      
//	      출력형태
//	      프로그램을 켜실려면 -999가 아닌 숫자를 입력해주세요
		System.out.println("프로그램을 켜실려면 -999가 아닌 숫자를 입력해주세요");
		System.out.println("종료하실려면 -999를 입력해주세요");
//	      종료하실려면 -999를 입력해주세요
		
		int a = sc.nextInt();
		
		if(a == -999) {
			System.out.println("종료");
		}else if(a != -999) {
			System.out.println("숫자를 입력해주세요");
			System.out.println("1.남성, 2.여성");
			
			a = sc.nextInt();
			
			if(a == 1) {
				System.out.println("남성을 선택했습니다");
			}else if(a == 2) {
				System.out.println("여성을 선택했습니다");
			}
		}
//	      
//	      숫자를 입력해주세요
//	      1.남성, 2.여성
//	      
//	      1인 경우
//	      남성을 선택했습니다
//	      
//	      2인 경우
//	      을 선택했습니다

	}
}
