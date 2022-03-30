package com.callor.var;

public class Var_01 {

	public static void main(String[] args) { // main() method  /  java 시작점, 진입점 method 명령 그룹
		int intNum1 = 0, intNum2 = 0; // 숫자형 변수는 선언 시 최소한 0으로 값을 할당 == 변수의 선언과 초기화
		int intSum; // 변수를 선언만 한다 == 선언만 된 변수는 어떤 값이든 먼저 할당해야만 이후에 문제를 일으키지 않음
		
		intSum = 0; // 변수가 초기화되어야만 읽을 수 있다
		
		System.out.println(intSum); // intSum 변수의 값을 읽어서 Console에 출력
		
		System.out.println(); // 빈 줄  /  println() method
		
		/*
		 * 단어() 형태 == method / function
		 * 				  method는 function에 포함되는 개념
		 * method는 단독으로 사용하지 않고 다른 키워드와 조합으로 사용되는 경우가 많다
		 */
		
		/* 
		 * 명령문은 키워드1 키워드2 키워드3 처럼 빈칸으로 키워드를 구분
		 * 			키워드1.키워드2.키워드3 처럼 Dot(.)으로 키워드를 구분
		 * 키워드 구분하여 명령문(statement) 구현(명령문을 문법에 맞게 완성)
		 * 
		 * 빈칸으로 조합된 키워드는 사용 용도에 따라 많은 경우의 수 존재
		 * public static void main()
		 * public void main()
		 * public int main()
		 * 등등 사용법 다양
		 * 
		 * Dot(.)으로 조합된 키워드는 사용하는 경우의 수 제한적
		 * System.out.println()
		 * PrintWriter.println()
		 * PrintWriter.out.println()
		 * 
		 * method는 키워드() 형태로 사용하며 다른 키워드와 조합으로 명령문을 완성한다
		 * () 안에 어떤 값을 첨가하는데 이것을 arguments라고 한다
		 * method에 따라 args가 있거나 없거나 상관없이 작동되기도한다
		 * 없으면 문법 오류가 발생하기도 한다
		 * method에 첨가되는 args는 method 코드가 만들어질때 정해지는 것으로 특별한 규칙이 없다
		 */
		
		System.out.print(0 + 0);
		System.out.print("\n");
		System.out.println(); 
		
	}
}
