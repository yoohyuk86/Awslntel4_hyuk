
// 조건문 실전
import java.util.Scanner;

public class controltest145_2 {

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

		System.out.println("학점을 입력하세요");

		int unit = sc.nextInt();
		String str = "";

		if (unit >= 90) {
			str = "A";
			if (unit <= 94) {
				str = str + "-";
			} else if (unit >= 98) {
				str = str + "+";
			}
		} else if (unit >= 80) {
			str = "B";
			if (unit <= 84) {
				str = str + "-";
			} else if (unit >= 88) {
				str = str + "+";
			}
		} else {
			str = "F등급 입니다";
		}
		System.out.println("당신의 학점은 " + unit +"점 " + str + "등급입니다");
	}
}
