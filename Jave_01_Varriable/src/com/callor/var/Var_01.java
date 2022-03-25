/*
 * 
 */
package com.callor.var;

public class Var_01 { // class 선언(class prototype)
	public static void main(String[] args) { // 실제 명령문 코드 작성 시작
		// 코드에서 사용하는 수의 체계 = 정수(int type), 실수(float type)
		int num1 = 255, num2 = 88; // 정수형 변수를 선언하고 초기화			
		
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num2 - num1);
		System.out.println(num2 / num1);
		System.out.println(40.0 / 30.0);
		
		int num3, num4; // 정수형 변수를 선언 (선언만 된 변수에서는 값 읽기 x)
		
		num3 = 40; num4 = 100; // 선언 된 정수형 변수에 정수 대입
		
		System.out.println(num3 + num4);
		
		int num5 = 0; // 변수 값을 못 정했을 시 0으로 초기화 (숫자일 경우)
		
		System.out.println(num5);
		
		int intNum1 = 0;		
	}
}
