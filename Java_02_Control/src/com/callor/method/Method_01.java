package com.callor.method;

public class Method_01 {

	public static void main(String[] args) {
		/*
		 * num() / add()를 실행하고 그 결과를 console에 출력
		 * num() / add()는 main()와 같은 class 내에 선언되어 있어야 한다
		 */
		
		System.out.println(num());
		System.out.println(add());
		
		System.out.println(Math.random());
		
		double num1 = doNum();
		
		
		
	} // end main()
	
	/*
	 * int num() { } : num method의 return type을 int로 지정
	 * return 정수;
	 * 
	 * int add() { } : return type int
	 * return 정수;
	 * 
	 * double doNum() { } : return type double
	 * return 실수;
	 * 
	 * 이 명령을 실행한 결과를 변수에 저장하려면 변수의 type도 반드시 같아야한다
	 */
	
	public static int num() { return 100; } // num method 선언
	
	public static int add() {
		int num1 = 200, num2 = 300;
		
		return num1 + num2;
	}
	
	public static double doNum() { return 100.0; }
	
}
