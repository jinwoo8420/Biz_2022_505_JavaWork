package com.callor.controller;

import java.util.Scanner; // java.util package에 담긴 Scanner 클래스 연결

public class ScannerEx_01 {

	public static void main(String[] args) {
		int intRnd = (int)(Math.random() * 100) + 1;
	
		/*
		 * 클래스를 사용하여 객체(object)를 선언
		 * Scanner 클래스에 포함된 method를 호출
		 * 객체가 선언만 된 상태에서는 아직 method 호출하여 명령 수행 불가
		 */
		
		Scanner scan; // 객체(object) 선언
		
		System.out.println("console에 출력");
		
		/*
		 * 선언된 scan object를 인스턴스로 만들어 메모리에 loading하고 사용 할 준비가 된 상태
		 * 이때 scan 인스턴스라고 부른다
		 * 
		 * new Scanner(System.in)
		 * pc에 연결된 키보드를 Scanner 클래스에게 연결하여
		 * 키보드로부터 데이터(값)을 입력받을 수 있도록 한다
		 */
		
		scan = new Scanner(System.in);
		
		String inputStr = new String();
		
		inputStr = scan.nextLine();
		
		System.out.println("inputStr : " + inputStr);
		
	}

}
