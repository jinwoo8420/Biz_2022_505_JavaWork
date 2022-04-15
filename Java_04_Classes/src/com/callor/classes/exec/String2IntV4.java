package com.callor.classes.exec;

public class String2IntV4 {
	public static void main(String[] args) {
		/*
		 * 숫자 앞에 + 또는 -가 있는 경우는 정상 변환 된다
		 * 이외의 기호는 변환 불가
		 */
		
		String strNum = "-3";
		strNum = "+3";
		strNum = "*3";
		int intNum = Integer.valueOf(strNum);
		
		
	}

}
