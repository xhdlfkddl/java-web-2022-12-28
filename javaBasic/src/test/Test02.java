package test;

public class Test02 {
	public static double solution(int[] arr) {
        double answer = 0;
        int arrlength = arr.length;
        
        if (1 <= arrlength && arrlength <= 100) {
        	for (int i = 0; i < arrlength; i++) {
        		int j = arr[i];
        		if (-10000 <= j && j <=10000) {
        			answer += j;
//        			System.out.println(answer);
//        			System.out.println(answer);
				}
        	}
        	answer /= arrlength;
		}
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = new int[] {12,12};
		System.out.println(solution(arr));
	}
}
