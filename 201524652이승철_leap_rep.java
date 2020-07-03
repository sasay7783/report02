// 3. 년도를 입력 받고 그 년도가 윤년인지 평년인지를 판별하는 프로그램을 작성하되 계속 실행되게 하세요.
// 0보다 작은 수가 입력되면 프로그램을 종료하세요.

package report02;

import java.util.Scanner;

public class YunPyeongYear2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int year = 0;
		
		while(true) {
			System.out.print("[윤/평년 판별] 년도: ");
			year = sc.nextInt();
			
			if(year < 0) break;
			
			if(years(year)) {
				System.out.println("윤년입니다.");
			} else {
				System.out.println("평년입니다.");
			}
		}
	}
	
	private static boolean years(int year) {
		if(year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
			return true;
		}
		return false;
	}

}
