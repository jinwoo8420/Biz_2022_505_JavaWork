package com.callor.arrays.utils;

public class Line {
	
	/*
	 * 클래스 영역에 dLine, sLine 문자열형 변수를 선언
	 * static : 프로젝트 코드가 실행되는 순간 항상 자동으로 사용 할 준비가 되도록 선언하는 키워드
	 * 
	 * final : 변수에 final 키워드가 부착되면 한번 저장 된 값을 절대 변경 할 수 가 없다
	 * 프로젝트에서 공통으로 공유하여 사용 할 변수는 public static final 키워드를 함께 사용한다
	 */
	
	public static final String dLine = "=".repeat(100);
	public static final String sLine = "-".repeat(100);
	
	/*
	 * return type이 문자열형(String)인
	 * dLine method 선언
	 */
	
	public static String dLine(int count) {
		String dLine = "=";
		
		return dLine.repeat(count);
	}
	
	/*
	 * int type argument가 1개 있고
	 * return type이 String type인 sLine method 선언
	 */
	
	public static String sLine(int count) {
		String sLine = "-";
		
		return sLine.repeat(count);
	}
}
