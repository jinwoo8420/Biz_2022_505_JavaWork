package com.callor.score.service.exec;

public class VarEx2 {
	public static void main(String[] args) {
		int num1 = 100;
		
		/*
		 * int형 변수에 담긴 데이터를 Integer형 변수에 복사
		 * 
		 * int형 데이터에 box를 씌워서 Integer형으로 변환 한 후 저장한다
		 */
		
		Integer intNum1 = num1;
		
		/*
		 * Integer형 변수에 담긴 데이터를 int형 변수에 복사하기
		 * 
		 * Integer box에 담긴 데이터를 box를 풀어헤쳐 내용물만 int형 변수에 저장 (unboxing)
		 */
		
		num1 = intNum1;
	}
}
