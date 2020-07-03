// 2. 년도를 입력 받고 그 년도가 윤년인지 평년인지를 판별하는 프로그램을 작성하시오.

package report02;

import java.util.Scanner;

public class YunPyeongYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int year = 0;
		
		System.out.print("[윤/평년 판별] 년도: ");
		year = sc.nextInt();
		
		if(years(year)) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		
		
	}
	
	private static boolean years(int year) {
		if(year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
			return true;
		}
		return false;
	}

}
