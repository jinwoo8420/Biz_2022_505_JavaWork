package com.callor.controller;

public class Method_02 {

	public static void main(String[] args) {
		int num1 = add();
		int num2 = multi();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);
	}
	
	public static int add() {
		int num1 = (int)(Math.random() * 100) + 1;
		int num2 = (int)(Math.random() * 100) + 1;
		
		return num1 + num2;
	}
	
	public static int multi() {
		int num1 = (int)(Math.random() * 100) + 1;
		int num2 = (int)(Math.random() * 100) + 1;
		
		return num1 * num2;
	}

}
