import java.util.Scanner;

public class controltest141 {

	public static void main(String[] args) {
		
//		학점을 구해주는 프로그램을 구현하시오
      
//      키보드 입력으로 학점을 받는다
//      
//      점수가 
//      100점 이하 90점 이상은 A
//      89점 이하 80점 이상은 B
//      79점 이하 70점 이상은 C
//      그 외 나머지 점수는 F
//      
//      출력형태
//      89점은 B학점입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학점을 입력하세요");
		
		int a = sc.nextInt();
		
		if(a <= 100 && a >= 90) {
			System.out.println(a + "점 : A 학점 입니다");		
		}else if (a <= 90 && a>= 80) {
			System.out.println(a + "점 : B 학점 입니다");
		}else if (a <=80 && a>= 70) {
			System.out.println(a + "점 : c 학점 입니다");
		}else {
			System.out.println(a + "점 : F 학점 입니다");
		}
	
    
	 }
}