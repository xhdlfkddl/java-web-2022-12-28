package chapter01;

public class Array01{
	
	public static void main(String[] args) {
		// 배열
		// 변수가 나열된 형태
		int[] numbers;
		numbers = new int[10];
		
		// 변수가 아니기 때문에 출력이 안됨
		// 메모리 위치 출력
		System.out.println(numbers);
		
		char[] charaters;
		charaters = new char[10];
		System.out.println(charaters);
		
		
		// 배열 초기화
		int[] arrNumber = new int[] {1, 2, 3};
		int i1 = arrNumber[0];
		int i2 = arrNumber[1];
		int i3 = arrNumber[2];
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println("arrNumber.length: " + arrNumber.length);
		
		char[] string = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(string);
		System.out.println(string.length);
		string[0] = 'k';
		System.out.println(string);
		
		// 다차원배열
		// 배열의 요소가 배열인 형태
		int[][] arrNum2 = new int[2][3]; // 3칸이 있는 배열이 총 2개가 생성됨 □□□, □□□
		// 초기화 방법
		int[][] arrNum3 = {{1,2,3},{4,5,6}};
		System.out.println(arrNum3[0][1]); // 2
	}
}
