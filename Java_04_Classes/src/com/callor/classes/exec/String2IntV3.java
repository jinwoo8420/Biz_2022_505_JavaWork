package com.callor.classes.exec;

public class String2IntV3 {
	public static void main(String[] args) {
		/*
		 * NumberFormatException
		 * 
		 * 1. 숫자와 함께 숫자가 아닌 문자열(space)이 포함된 경우
		 * 2. ""(없는 문자열)
		 * 3. 숫자 앞뒤에 문자열이 포함된 경우
		 * 4. 숫자 중간에 문자열이 포함된 경우
		 * 5. 숫자 중간에 연산기호가 포함된 경우
		 */
		
		String strNum = "33";
		int intNum = Integer.valueOf(strNum);
		
		strNum = "";
		intNum = Integer.valueOf(strNum);
		
		strNum = "A3A";
		
		strNum = "3 3";
		
		strNum = "3+3";
	}

}
