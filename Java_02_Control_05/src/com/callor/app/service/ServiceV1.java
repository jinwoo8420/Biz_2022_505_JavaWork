package com.callor.app.service;

public class ServiceV1 {
	
	/*
	 * return type이 int형인 동적(일반) method 선언
	 * 성적의 합계를 계산하여 그 결과를 return
	 */
	
	public int scoreSum() {
		int intKor = 90, intEng = 80, intMath = 70;
		
		int sum = intKor + intEng + intMath;
		
		return sum;
	}
	
	/*
	 * void type의 scorePrint() 선언
	 * 성적정보(리스트 등)를 출력
	 * void type이기 때문에 호출한 곳에 어떤 것도 알리지 않는다
	 */
	
	public void scorePrint() {
		int intKor = 90, intEng = 80, intMath = 70;
		
		System.out.println("====================================");
		System.out.println("Score");
		System.out.println("====================================");
		System.out.println("Kor : " + intKor);
		System.out.println("Eng : " + intEng);
		System.out.println("Math : " + intMath);
		System.out.println("====================================");
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		System.out.println("Score Sum : " + intSum);
		System.out.println("====================================");
	}
}
