package com.callor.var;

public class Var_04 {

	public static void main(String[] args) {
		double douRnd = Math.random() * 1000; // 0 ~ 1000 미만의 임의의 실수 생성
		
		System.out.println(douRnd);
		
		/* 강제 형 변환 / 명시적 형 변환
		 * 
		 * 실수 값을 정수 변수에 저장하면 기억장치의 크기 때문에 오류 발생
		 * 하지만 개발자가 실수 값 중에서 소수점 이하는 필요없고
		 * 정수 부분만 필요하니 소수점 이하 값을 제거하고
		 * 정수 부분만 intRnd 변수에 담아달라고 강제로 명령
		 * 
		 * type 키워드를 ( ) 묶어 변수 앞에 표식
		 */  
		 
		 /*  자연 형 변환 / 묵시적(암시적) 형 변환
		 *  
		 *  실수 = 정수 와 같은 명령을 수행하면 실수형 변수는 정수 값을 저장하기에
		 *  충분히 큰 기억장치 이므로 문제 발생 x
		 *  
		 *  ex) double num = 30; 코드가 실행되면
		 *  num 변수에는 30.0000000 저장
		 */	
		
		int intRnd = (int) douRnd; // 0 ~ 999까지의 정수만 필요
		
		System.out.println(intRnd);
		
		
	}

}
