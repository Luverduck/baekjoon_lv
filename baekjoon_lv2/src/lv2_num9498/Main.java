package lv2_num9498;

import java.util.Scanner;

public class Main {

	public static class Grade {
		// 필드
		private int score;
		
		// getter & setter
		public int getScore(int score) {
			return this.score;
		}
		
		public void setScore(int score) {
			if(score < 0 && score > 100) {
				return;
			}
			this.score = score;
		}
		
		// 등급 반환 getter
		public String getGrade(int score) {
			if(score >= 90) {
				return "A";
			}
			else if(score >= 80) {
				return "B";
			}
			else if(score >= 70) {
				return "C";
			}
			else if(score >= 60) {
				return "D";
			}
			else {
				return "F";
			}
		}	
		
		// 생성자
		Grade(int score){
			this.score = score;
		}
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int input = sc.nextInt();
			sc.nextLine();
			
			Grade a = new Grade(input);
			
			System.out.println(a.getGrade(input));
		}
		
		sc.close();
	}
}
