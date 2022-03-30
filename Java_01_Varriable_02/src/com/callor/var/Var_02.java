package com.callor.var;

public class Var_02 {

	public static void main(String[] args) {
		int intNum1 = 0, intNum2 = 0; // 변수 선언과 clear
		
		/*
		 * main() { } 에서 선언된 변수는 main () { } 끝나는 시점에 모두 소멸  
		 */
		
		intNum1 = 55; intNum2 = 33; // 변수에 값을 할당, 대입, 저장
		
		/*
		 * 1. intNum1에 저장된 값을 읽어온다
		 * 	System.out.println("55 + 33 = " + intNum1 + intNum2);
		 * 2. intNum1에 담긴 숫자형 데이터를 문자열형 데이터로 바꿔버린다
		 * 3. intNum2에 저장된 값을 읽어온다
		 * 	System.out.println("55 + 33 = " + "55" + intNum2);
		 * 4. intNum2에 담긴 숫자형 데이터를 문자열형 데이터로 바꿔버린다
		 * 	System.out.println("55 + 33 = " + "55" + "33");
		 */
		
		intNum1 = 77; intNum2 = 99; // 이전에 변수가 어떤 일이 있던지 상관없이 모든 값이 clear 되고 새로운 값 할당
		
		System.out.println("55 + 33 = " + (intNum1 + intNum2));
		System.out.println("55 x 33 = " + (intNum1 * intNum2));
		System.out.println("55 - 33 = " + (intNum1 - intNum2));
		System.out.println("55 / 33 = " + (intNum1 / intNum2));
		
		/*
		 * { } 내에서 선언하고 값이 할당된 변수가 있을 때
		 * 변수에서 값을 읽어서 연산을 수행하는데
		 * 어떠한 연산을 수행하든 읽기를 수행하는 변수의 값은
		 * 절대 변함이 없다
		 * 다만, 어디선가 변수에 또다른 값을 할당하면
		 * 변수 값이 변하게 된다
		 */
		
		int intNum3 = 1000;
		
		System.out.println(intNum3);
		System.out.println(intNum3);
		System.out.println(intNum3);
		System.out.println(intNum3);
		System.out.println(intNum3);
		System.out.println(intNum3);	
		
	} // main() 끝
	
	/*
	 * main() { } 밖에서는 명령문을 사용할 수 없다
	 * 또한 intNum3 변수도 사용할 수 없다 
	 */
	
	//System.out.println(intNum3); 사용불가

} // class Var_02 끝
