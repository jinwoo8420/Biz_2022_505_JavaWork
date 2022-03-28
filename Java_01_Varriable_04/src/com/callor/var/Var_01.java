package com.callor.var;

public class Var_01 {

	public static void main(String[] args) {
		int num1 = 33, num2 = 55; 
		
		// 4칙연산 결과를 저장하기 위한 변수 선언
		int sum = num1 + num2;
		int def = num1 - num2;
		int pro = num1 * num2;
		int div = num1 / num2;
		
		// 화면에 form 만든 후 출력
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		System.out.printf("%d - %d = %d\n", num1, num2, def);
		System.out.printf("%d x %d = %d\n", num1, num2, pro);
		System.out.printf("%d / %d = %d\n", num1, num2, div);
		
	}

}
