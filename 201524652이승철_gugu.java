// 1. 하나의 수를 입력 받고 그 수에 해당하는 구구단을 출력하는 프로그램을 작성하시오.

package report02;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 n단을 출력합니다: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(n * i);
		}
	}

}
