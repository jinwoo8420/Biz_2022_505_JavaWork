package com.callor.var;

public class Var_03 {

	public static void main(String[] args) {
		int result = add();
		
		System.out.println(result);
	}
	
	/*
	 * add() 선언
	 * add()는 num1, num2, sum 변수를 각각 선언하고
	 * num1, num2에 각각 99, 3을 저장하고
	 * num1, num2에 저장 된 값을 읽어서 덧셈을 실행하여
	 * sum에 저장 후 sum에 저장 된 값을 읽어서 return
	 */
	public static int add() { 
		int num1 = 99, num2 = 3;
		
		int sum = num1 + num2;
		
		return sum; // sum 변수에 저장 된 값을 return
	}

}
