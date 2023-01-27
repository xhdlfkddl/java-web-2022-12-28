package chapter01;

import java.util.Scanner;

public class DataType01 {

	public static void main(String[] args) {
		// 데이터 타입
		//
		// 정수형 타입
		// byte (1byte), short(2byte), int(4byte), long(8byte)
		byte b1 = 0;
		byte b2 = 127;
		byte b3 = -128;
		// type mismatch error
		// byte b3 = 128;
		
		short s1 = 128;
		short s2 = 32767;
		short s3 = -32768;
		
		int i1 = 32768;
		int i2 = 2_147_483_647;
		int i3 = - 2147483648;
		
		// 2_147_483_648가 int 타입으로 저장되어있기때문에 ㅣ을 붙여줘야함
		long l1 = 2_147_483_648L;
		
		// 실수 타입
		// float (4byte), double (8byte)
		float f1 = 3.1415f;
		double d1 = 3.1415;
		
		// 논리 타입
		boolean bool1 = true;
		boolean bool2 = false;
		
		// 문자 타입
		// char (2byte)
		char c1 = 'a';
		char c2 = 97;
		// System.out.println(c1); // a
		// 아스키 코드 표에서 97은 a를 뜻하기 때문에 a가 출력됨
		// System.out.println(c2);   
		
		// 입력 (System.in)
		// java.utill.Scanner Scanner 객체
		/*
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		System.out.println("inputNumber: " + inputNumber);
		
		long inputLong = sc.nextLong();
		System.out.println("inputLong: " + inputLong);
		*/
		
		
		// 형변환
		// 묵시적 (자동) 형변환
		byte by1 = 100;
		// 컴파일러가 자동으로 남은 데이터 공간을 0으로 채운 후 타입 변환
		int number = by1;
		System.out.println(number);
		
		float float1 = number;
		System.out.println(float1);

		// 명시적 (강제) 형변환
		// 사이즈(byte)가 큰 변수에서 작은 변수로 데이터를 저장할 때
		int number2 = 1000;
		// Type mismatch: cannot convert from int to byte
		// byte by2 = number2;
		byte by2 = (byte) number2;
	}
	
}
