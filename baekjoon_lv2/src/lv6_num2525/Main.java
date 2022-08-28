package lv6_num2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 입력
		// - 현재 시간
		int A = sc.nextInt();
		
		int B = sc.nextInt();

		// - 요리하는데 필요한 시간
		int C = sc.nextInt();

		// - 현재 시간 : [분]으로 환산
		//int total = A * 60 + B;

		// - 끝나는 시간 : [분]으로 환산
		int finish = A * 60 + B + C;

		// 2. 판정 및 출력
		// 판정
		if (finish / 60 >= 24) {
			A = finish / 60 - 24;
			B = finish % 60;
		} 
		
		else {
			A = finish / 60;
			B = finish % 60;
		}

		// 출력
		System.out.println(A + " " + B);

		sc.close();
	}
}
