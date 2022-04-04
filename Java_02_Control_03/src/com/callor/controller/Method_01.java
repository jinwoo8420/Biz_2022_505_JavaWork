package com.callor.controller;

public class Method_01 {

	public static void main(String[] args) {
		int result = num();
		
		System.out.println(result);		
	}
	
	public static int num() {
		int num1 = (int)(Math.random() * 100) + 1; 
		int num2 = (int)(Math.random() * 100) + 1;
		
		return num1 + num2;
	}

}
