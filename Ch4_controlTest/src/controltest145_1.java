
// 조건문 실전
import java.util.Scanner;

public class controltest145_1 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" 학점을 입력하세요 ");
			
			int unit = sc.nextInt();
			
			System.out.println("당신의 학점은  " + unit + "점");
			
			if (unit >= 98) {
				System.out.println("A+ 학점입니다");
			}else if(unit >= 94){
				System.out.println("A 학점입니다");
			}else if(unit >= 90){
				System.out.println("A- 학점입니다");
			}else if(unit >= 88){
				System.out.println("B+ 학점입니다");
			}else if(unit >= 84){
				System.out.println("B 학점입니다");
			}else if(unit >= 80){
				System.out.println("B- 학점입니다");
			}else {
				System.out.println("C 학점입니다");
			}
	}
}

