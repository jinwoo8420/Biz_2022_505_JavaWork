package com.callor.classes.exec;

public class String2IntV1 {
	public static void main(String[] args) {
		String strNum = "33";
		int intNum = Integer.valueOf(strNum); // 문자열 형 숫자를 정수형 숫자로 형 변환
		
		strNum = "33.2";
		float fNum = Float.valueOf(strNum); // 문자열 형 숫자를 실수형 숫자로 형 변환
		
		float fSum = intNum + fNum;
		
		System.out.println(fSum);
		
		
	}
}
