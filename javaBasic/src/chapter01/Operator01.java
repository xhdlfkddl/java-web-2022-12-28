package chapter01;

public class Operator01 {
	public static void main(String[] args) {
		// 산술 연산자
		// 사칙 연산과 관련된 산술 연산자
		// 덧셈 연산자 (+)
		System.out.println(8 + 3);
		// 뺄셈 연산자 (-)
		System.out.println(8 - 3);
		// 곱셈 연산자 (*)
		System.out.println(8 * 3);
		// 나누기 연산자 (/)
		System.out.println(8 / 3); // 나누기 했을때는 정수만 출력
		// int(정수)와 int를 나눴기 때문에 저장되는 값도 int로 저장되기 때문
		// 소수점까지 출력을 원한다면 double 형태로 바꿔서 연산하면 됨
		System.out.println(8.0 / 3); // 2.6666...
		// 나머지 연산자 (%)
		System.out.println("나머지" + 9 % 3);
		// 증가 연산자
		int plus1 = 0;
		System.out.println(plus1++); // 0 해당 연산이 끝난 뒤 출력하면 
		System.out.println(plus1++); // 1 로 바뀌어있음
		int plus2 = 0;
		System.out.println(++plus2); // 1 증가시킨후 연산
		// 감소 연산자
		int minus1 = 0;
		System.out.println(minus1--); // 0
		System.out.println(minus1); // -1
		// 증감 연산자는 변수에만 적용할 수 있늠
		// System.out.println(8++); -> 안됨
		
		// 대입 연산자
		// 대입과 관련된 연산자
		// 좌항에는 무조건 변수가 와야함, 우항에는 상관없음 
		// =
		// 프로그래밍에서의 "="은 수학의 "="과 다름(equal이 아니라는 뜻)
		// x = 5;
		int x = 5;
		// +=
		// x = x + 3;
		x += 3;
		System.out.println(x);
		// -=
		// x = x - 3;
		x -= 3;
		System.out.println(x);
		// *=
		// Same x = x * 3;
		x *= 3;
		System.out.println(x);
		// /=
		// x = x / 3;
		x /= 3;
		System.out.println(x);
		// %=
		// x = x % 3;
		x %= 3;
		System.out.println(x);
		
		// 비교 연산자
		// 좌항을 우항과 비교하여 그 결과를 true/false로 변환
		// 같다 : ==
		System.out.println(8 == 8); // true
		System.out.println(8 == 3); // false
		// 같지않다 : !=
		System.out.println(8 != 3); // true
		// 크다 : >
		System.out.println(8 > 3); // true
		// 작다 : <
		System.out.println(8 < 3); // false
		// 크거나 작다 : >=
		System.out.println(8 >= 3); // true
		// 작거나 같다 : <=
		System.out.println(8 <= 3); // false
		
		System.out.println("=================================");
		
		// 논리 연산자
		// 논리 값에 대한 연산처리하는 연산자
		// false == 0, true != 0(1)
		boolean t = true;
		boolean f = false;

		// Logical and : &&
		// 좌항과 우항이 모두 true일 경우 true를 반환
		// 0(false)과 1(true)을 곱했을 때 값이 0일 때는 false
		// 여러 && 연산이 있을 때 하나의 false만 만나도 연산이 종료되기때문에
		// false 뒤의 코드는 Dead Code가 됨
		System.out.println(0 * 1); // return 0
		System.out.println(f && t); // = 0 * 1 // false
		System.out.println(t && t); // = 1 * 1 // true

		// Logical or : ||
		// 좌항과 우항 중 하나라도 true이면 true를 반환
		// 0(false)과 1(true)을 더했을 때 값이 0 = false / 0 != true
		// 여러 || 연산이 있을 때 하나의 true만 만나도 연산이 종료되기때문에
		// true 뒤의 코드는 Dead Code가 됨
		System.out.println(0 + 0); // return 0
		System.out.println(false || false); // = 0 + 0 // false 
		System.out.println(true || false); // = 1 + 0 // true 
		System.out.println(true || true); // = 1 + 1 // true 

		// Logical not : !
		// 해당 논리를 역전 시킴
		System.out.println(!t); // false
		
	}
}
