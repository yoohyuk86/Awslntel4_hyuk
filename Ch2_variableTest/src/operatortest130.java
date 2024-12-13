import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class operatortest130 {

	public static void main(String[] args) {
	
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력값");
		
		int x = scan.nextInt();
		
		// 조건 1 ? 결과 1 : 조건 2 ? 결과 2 : 결과 3
		System.out.println(x > 0 ? "입력값: " : (x == 0) ? "입력값: 0" : "입력값: 음수" );
		
	}

}
