package test;

import java.util.Iterator;

public class Test01 {
	public static int solution(int n) {
		int answer = 0;

		if (0 < n && n <= 3000) {
			for (int i = 1; i <= n; i++) {
				if (n%i == 0) {
					System.out.println("i: " + i);
					answer += i;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(solution(-1));
	}
}
