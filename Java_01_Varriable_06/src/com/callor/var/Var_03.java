package com.callor.var;

public class Var_03 {

	public static void main(String[] args) {
		int intNum1 = (int)(Math.random() * 100) + 1;
		boolean bEven = true; // boolean type의 변수 초기화는 true 값 주로 사용
		
		bEven = (intNum1 % 2) == 0;
		
		/*
		 * 비교(조건) 명령문
		 * 		if(boolean) { boolean이 true 일 때 실행 }
		 * 		else { boolean이 true가 아닐 때 실행 }
		 * boolean의 값이 true인지 false인지에 따라서 명령문을 선택적으로 실행
		 */
		
		if (bEven) { System.out.println(intNum1 + " = 짝수"); }
		else { System.out.println(intNum1 + " = 짝수 x"); }
		
		if ((intNum1 % 3) == 0) { System.out.println(intNum1 + " = 3의 배수"); } // 연산식으로 if 명령문 실행
		else { System.out.println(intNum1 + " = 3의 배수 x"); }
		
		if ((intNum1 % 4) == 0) { System.out.println(intNum1 + " = 4의 배수"); }
		else if ((intNum1 % 3) == 0) { System.out.println(intNum1 + " = 4의 배수 x 이지만 3의 배수"); }
		else if ((intNum1 % 2) == 0) { System.out.println(intNum1 + " = 4의 배수 and 3의 배수 x 이지만 2의 배수인 것 같음"); }
	}

}
