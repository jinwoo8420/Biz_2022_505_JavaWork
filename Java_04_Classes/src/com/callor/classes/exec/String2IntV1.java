package com.callor.classes.exec;

import com.callor.classes.utils.Line;

public class String2IntV1 {
	public static void main(String[] args) {
		String strAge = "";
		int intAge = 33;
		
//		strAge = intAge + ""; // 숫자형 변수 + "문자열" : 숫자값을 문자열형 값으로 형 변환
		
		// Integer 클래스에 선언된 toString Static method에게 정수값 arg로 전달하여 문자열로 return
		strAge = Integer.toString(intAge); // Integer.toString(정수값)
		
		System.out.println(strAge);
		
		strAge = "55";		
		intAge = Integer.valueOf(strAge); // Integer.valueOf() method를 사용하여 문자열형 숫자를 정수형으로 바꾼다
		
		System.out.println(Integer.toBinaryString(33));
		
		int num1 = 33, num2 = 55;
		String strBinNum1 = Integer.toBinaryString(num1);
		String strBinNum2 = Integer.toBinaryString(num2);
		
		int intBinNum1 = Integer.valueOf(strBinNum1);
		int intBinNum2 = Integer.valueOf(strBinNum2);
		
		int intSum = num1 + num2;
		
		String strSum = Integer.toBinaryString(intSum);
		
		System.out.println(Line.dLine(20));
		System.out.println("  " + strBinNum1);
		System.out.println("+ " + strBinNum2);
		System.out.println(Line.sLine(20));
		System.out.println(" " + strSum);
		
	}

}
