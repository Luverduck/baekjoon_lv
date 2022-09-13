package num2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int one = sc.nextInt();
		int two = sc.nextInt();
		
		int three = one * (two % 10);
		int four = one * ((two / 10) % 10);
		int five = one * (((two / 10) / 10) % 10);
		int six = three + (four * 10) + (five * 100);
		
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		
		sc.close();
	}
}
