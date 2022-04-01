package com.callor.controller.op;

public class Operator_01 {

	public static void main(String[] args) {
		/*
		 * 명령문(statement)
		 * java 코드에서 명령문은 반드시 끝에 ; 로 끝난다
		 * 명령문의 시작은 key word와 변수만 올 수 있다
		 * key word로 시작하는 명령문은 어떤 기능을 수행하는 경우
		 * 변수로 시작하는 경우는 연산자가 따라온다
		 * 변수의 바로 다음에 오는 연산자는
		 * 대입연산자(=), 단항연산자(++, --), 복합연산자(+=, *=, -=, /=, %=), 삼항연산자 등이 있다 
		 */
		
		int intNum1 = 10, intNum2 = 0;
		
		intNum2 = 100; // 대입연산자
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		intNum2++; // 단항연산자
		
		System.out.println(intNum2);
		
		intNum2 = ++intNum1;
		
		System.out.println(intNum2);
		
		intNum1 = intNum1 + 10;
		intNum2 = intNum1;
		
		System.out.println(intNum2);
		
		intNum1 += 10; // 복합연산자
		intNum2 = intNum1;
		
		System.out.println(intNum2);		
		
		intNum2 = intNum1 = intNum1 + 10;
		
		System.out.println(intNum2);
		
		/*
		 * 대입연산식이 다른 명령문 내에 포함되는 경우
		 * 
		 * 1. intNum2 + 10을 연산하고
		 * 2. 결과를 intNum1에 대입
		 * 3. intNum1에 저장 된 값을 console에 출력하고
		 * 4. intNum1의 값은 그대로 유지
		 * 5. 이후의 코드에서 intNum1 값을 사용 할 수 있다
		 */
		
		System.out.println(intNum1 = intNum2 + 10);
	}

}
