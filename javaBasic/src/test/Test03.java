package test;

public class Test03 {
	public static String solution(int num) {
        String answer = "";
        if (num%2 == 0) {
			answer = "Odd";
		} else {
			answer = "Even";
		}	
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(8));
	}
}
