package com.callor.service;

import java.util.Scanner;

public class ServiceV1 {
	
	/*
	 * void type method를 guguDan으로 선언
	 * void type method는 return 명령이 없어도 된다
	 */
	
	public void guguDan() {
		int num1 = 3, num2 = 1;
		
//		System.out.println("3 x 1 = " + (num1 * num2++));
//		System.out.println("3 x 2 = " + (num1 * num2++));
//		System.out.println("3 x 3 = " + (num1 * num2++));
//		System.out.println("3 x 4 = " + (num1 * num2++));
//		System.out.println("3 x 5 = " + (num1 * num2++));
//		System.out.println("3 x 6 = " + (num1 * num2++));
//		System.out.println("3 x 7 = " + (num1 * num2++));
//		System.out.println("3 x 8 = " + (num1 * num2++));
//		System.out.println("3 x 9 = " + (num1 * num2++));
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num1 + " x " + i + " = " + (num1 * i));
		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("a = ");
//		int a = sc.nextInt();
//		
//		for (int i = 1; i < 10; i++) {
//			System.out.println(a + " x " + i + " = " + (a * i));
//		}
		
	}
}
