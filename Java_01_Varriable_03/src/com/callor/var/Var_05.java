package com.callor.var;

public class Var_05 {

	public static void main(String[] args) {
		int num1 = 1;
		
		System.out.println(num1++); // 다음 명령문이 실행되면 num1++이 실행됨 / 1 출력
		System.out.println(num1++); // 2 출력
		System.out.println(num1++); // 3 출력
		
		num1 = 0;
		
		System.out.println(num1); // 0 출력
		
		num1 += 1;
		
		System.out.println(num1); // 1 출력
	}

}
