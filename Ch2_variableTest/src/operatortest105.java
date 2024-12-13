
//	구현하기
public class operatortest105 {

	public static void main(String[] args) {
		
		double num = 3.145592;
		double resultNum = 0.0;
//							314				-> 3.14
//		올림처리 구현하기
//		resultNum = (int)(num * 100 + 1) / 100.0;
//		
//		System.out.println("소수점 3번째 자리에서 내림 즉 2자리까지만 출력");
//		System.out.println(num + " -> " + resultNum);
		
//		복잡도 높다, 한 방
//		resultNum = (int)(num * 100) / 100.0;
		
		resultNum = num + 0.005;
		System.out.println(resultNum);
		
		resultNum = resultNum * 100;
		System.out.println(resultNum);
		
		resultNum = (int)resultNum;
		System.out.println(resultNum);
		
		resultNum = resultNum / 100.0;
		System.out.println(resultNum);
		
		System.out.println("소수점 3번째 자리에서 반올림 즉 2자리까지만 출력");
		System.out.println(num + " -> " + resultNum);
		
	}

}
