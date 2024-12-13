
// 조건문 실전
import java.util.Scanner;

public class controltest145 {

	public static void main(String[] args) {

//		사용자로부터 학점을 입력받는다
//	      
//	      90점 이상이면 A인데 
//	      98점 이상은 A+
//	      94점 미만이면 A-
//	      
//	      80점도 동일하게
//	      B
//	      B+
//	      B-를 구현한다
//	      나머지 점수는 전부 C점수를 부여하시오
//	      
//	      출력형태
//	      93점의 경우
//	      당신의 학점은 93점
//	      A-등급입니다
//	      
//	      80점의 경우
//	      당신의 학점은 80점
//	      B-등급입니다

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();

		if (num % 3 == 0 && num != 0 ) {
			System.out.println("3의 배수입니다");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}	
		if (num % 2 == 0) {
			System.out.println("짝수 입니다");
		} else {
			System.out.println("홀수 입니다");
		}
	}
}
