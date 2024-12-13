//중첩 for문으로 구현해보자
public class ControlTest163_1 {

	public static void main(String[] args) {
//		출력형태
//		2 * 1 = 2
//		2 * 2 = 4
//		2 * 3 = 6
//		,,,
//		2 * 9 = 18
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		,,,
//		3 * 9 = 27
//		,,,
//		9 * 1 = 9
//		9 * 2 = 18
//		9 * 3 = 27
//		,,,
//		9 * 8 = 72
//		9 * 9 = 81

		for (int i = 1; i <= 9; i++) {
//			System.out.println(i + 1);
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");		
			}
			System.out.println();
		}
	}

}
