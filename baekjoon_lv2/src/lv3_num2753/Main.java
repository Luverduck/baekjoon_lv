package lv3_num2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Scanner에서 입력을 1에서 4000 사이로 제한하는 방법??
		
		while(sc.hasNextInt()) {
			// 입력
			int year = sc.nextInt();
			
			// 판정 및 출력
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		
		sc.close();
	}
}
