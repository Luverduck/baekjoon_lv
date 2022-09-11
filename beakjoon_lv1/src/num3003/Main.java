package num3003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int rook = sc.nextInt();
		int bishop = sc.nextInt();
		int knight = sc.nextInt();
		int pawn = sc.nextInt();
		
		System.out.print((1 - king) + " " + (1 - queen) + " " + (2 - rook) + " " + (2 - bishop) + " " + (2 - knight) + " " + (8 - pawn));
		
		sc.close();
	}
}
