package com.callor.classes.exec;

public class String2IntV2 {
	public static void main(String[] args) {
		String strNum = "";
		int intNum = 0;
		
		if (strNum.equals("")) {
			System.out.println("변환 불가");
		} else {
			intNum = Integer.valueOf(strNum);
		}
		
		/*
		 * 만약 키보드 등을 이용하여 값을 입력할 경우
		 * space 키를 눌러 white space가 담기는 경우가 발생하는데
		 * 모든 경우의 수를 if()를 사용하여 검사한다면 많은 코드가 추가되어야 한다
		 */
		
		
	}
}
