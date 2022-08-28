package lv5_num2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			// 입력
			int H = sc.nextInt(); 
			int M = sc.nextInt();	
			
			// 판정
			if(M >= 45) {
				M = M - 45;
			}
			
			else {
				H -= 1;
				if(H < 0) {
					H = 23;
				}
				M += 60;
				M = M - 45;
			}
			
			// 출력
			System.out.println(H + " " + M);
		}

		sc.close();
	}
}
