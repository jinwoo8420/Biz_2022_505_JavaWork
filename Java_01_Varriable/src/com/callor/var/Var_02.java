package com.callor.var;

public class Var_02 {
	public static void main(String[] args) {
		int num1 = 100, num2 = 200, num3 = 0, num4 = 0;		
		num3 = 200; num4 =300; // 변수에 값을 저장하거나 읽을려면 반드시 이전에 변수가 선언되어 있어야 한다
		
		System.out.println(num3 + num4);
		
		int num5 = 100;
		num5 = 0;
		num5 = 1000;
		
		System.out.println(num5);
		
		num5 = 99;
		num5 = -1;
		
		System.out.println(num5);		
	}
}
