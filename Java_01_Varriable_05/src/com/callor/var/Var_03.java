package com.callor.var;

public class Var_03 {

	public static void main(String[] args) {
		double num1 = 1 + ( Math.random() * 1000 );
		double num2 = 1 + ( Math.random() * 1000 );
		
		int intNum1 = (int)num1;
		int intNum2 = (int)num2;		
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		System.out.println();
		
		System.out.println(intNum1 + intNum2);
		System.out.println(intNum1 - intNum2);
		System.out.println(intNum1 * intNum2);
		System.out.println(intNum1 / intNum2);
	}

}
