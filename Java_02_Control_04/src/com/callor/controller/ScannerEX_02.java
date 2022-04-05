package com.callor.controller;

import java.util.Scanner;

public class ScannerEX_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Scanner 클래스를 사용하여 scan 인스턴스 생성
		
		System.out.println("====================================");
		System.out.println("calc");
		System.out.println("====================================");
		
		System.out.print("intNum1 = ");
		
		int intNum1 = scan.nextInt();
		
		System.out.print("intNum2 = ");
		
		int intNum2 = scan.nextInt();
		
		System.out.println("sum = " + (intNum1 + intNum2));
		
	}	

}
