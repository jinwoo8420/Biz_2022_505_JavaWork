package com.callor.app.service;

public class ServiceV4 {
	
	/*
	 * 클래스 영역(scope)에서 변수 선언
	 * class scope에서 선언 된 변수는 현재 class의 모든 method에서 공통으로 공유 가능
	 */
	
	int intKor = 0, intEng = 0, intMath = 0;
	
	/*
	 * class scope에 선언 된 3개의 변수에 값을 저장하고 3개의 변수 값을 합산하여 return
	 */
	
	public int scoreSum() {
		
		/*
		 * class scope에 선언 된 변수에 1~100까지의 정수를 생성하여 저장
		 * 여기에서 저장 된 변수 값은 다른 method에서 값을 변경(저장)하기 전에는 계속 유지
		 * (현재 프로젝트가 종료 될 때까지 유지)
		 * 여기에서 저장 된 변수 값은 scorePrint()에서 읽어서 출력하면 같은 값이 출력
		 */
		
		intKor = (int)(Math.random() * 100) + 1;
		intEng = (int)(Math.random() * 100) + 1;
		intMath = (int)(Math.random() * 100) + 1;
		
		int intSum = intKor + intEng + intMath;
		
		return intSum;
	}
	
	public void scorePrint() {
		String dLine = "=";
		String sLine = new String("-");
		int intSum = scoreSum();
		
		System.out.println(dLine.repeat(50));
		System.out.println("Score");
		System.out.println(sLine.repeat(50));
		System.out.println("Kor  : \t" + intKor);
		System.out.println("Eng  : \t" + intEng);
		System.out.println("Math : \t" + intMath);
		System.out.println(sLine.repeat(50));
		
		System.out.println("Sum  : \t" + intSum);
		System.out.println(dLine.repeat(50));
	}
}
