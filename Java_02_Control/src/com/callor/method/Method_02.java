package com.callor.method;

public class Method_02 {

	public static void main(String[] args) {
		int intNum1 = num();
		double doNum1 = doNum();
		long longNum1 = longNum();
		float fNum1 = floatNum();
		boolean bYes = bYes();		
		String str = nation();
		
		System.out.println(intNum1);
		System.out.println(doNum1);
		System.out.println(longNum1);
		System.out.println(fNum1);
		System.out.println(bYes);
		System.out.println(str);		
	}
	
	public static int num() {
		int num1 = 100, num2 = 200;
		
		return num1 + num2;
	}
	
	public static double doNum() {
		double num1 = (Math.random() * 100) + 1;
		double num2 = (Math.random() * 100) + 1;
		
		return num1 + num2;
	}
	
	public static long longNum() {
		long num1 = 100000000000000000L, num2 = 100000000000000000L;
		return num1 + num2;
	}
	
	public static float floatNum() {
		float num1 = 100.5f, num2 = 99.6f;
		
		return num1 + num2;
	}
	
	public static boolean bYes() {
		int num1 = (int)(Math.random() * 100) + 1;
		int num2 = (int)(Math.random() * 100) + 1;
		
		boolean bGT = (num1 > num2);
		
		if (bGT) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String nation() {
		return "hello world";
	}	

}
