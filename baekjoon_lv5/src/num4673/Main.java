package num4673;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// 양의 정수 n에 대하여 d(n)은 n과 n의 각 자리수를 더하는 함수
		// ex) d(75) = 75 + 7 + 5;

		// ex) d(75) = 75 + 7 + 5 = 87; -> 87의 생성자는 d(75)
		// ex) d(d(75)) = 87 + 8 + 7;
		// ...
		// ex) d(39)의 생성자 = 33

		// 생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42,
		// 53, 64, 75, 86, 97
		// 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

		/*
		 * 예시) int dn = 75; int n = dn + dn/10 + dn%10; // n = 87;
		 */

		// 입력
		int input = 10000;

		// Set에 100 미만의 양의 정수 대입
		Set<Integer> set = new TreeSet<>();
		for (int i = 1; i < input; i++) {
			set.add(i);
		}

		int n;
		for (int j = 1; j <= input; j++) {
			// 초기값
			n = j;

			// 구문 탈출
			if (n == input) {
				break;
			}

			// 자릿수를 구하기 위해 숫자를 문자열로 변환
			String nString = String.valueOf(n);

			// 생성자가 있는 숫자 찾기
			for (int i = 0; i < nString.length(); i++) {
				n += Integer.valueOf(nString.substring(i, i + 1));
			}

			// 생성자가 있는 숫자 제거
			set.remove(n);
		}

		// Set의 요소 출력
		for (int number : set) {
			System.out.println(number);
		}
	}
}
