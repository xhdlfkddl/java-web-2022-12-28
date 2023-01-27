package test;

import java.util.Iterator;

public class Test04 {
	public static int[] solution(long n) {
		int[] answer = {};
		long num = n;
		int cnt = 0;
		
		while (num != 0) {
			num /= 10;
			cnt++;
//			System.out.println(num);
//			System.out.println(cnt);
		}
		num = n;
		answer = new int[cnt];
		
		for (int i = 0; num != 0; i++) {
			answer[i] = (int)(num%10);
			System.out.println(i +"번째 index 값: " + answer[i]);
			num/=10;
			System.out.println(answer[i]+"을 제외한 num/10 = " +num);
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		solution(1234);
	}
}
