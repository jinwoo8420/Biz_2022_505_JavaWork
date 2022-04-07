package com.callor.app.service;

/*
 * scoreSum()에서 계산한 총점과 scorePrint()에서 출력한 과목 점수는 서로 다름
 * 두 method에 선언 된 intKor, intEng, intMath는 이름은 같지만 완전히 다른 변수(저장공간, 값)
 */

public class ServiceV3 {
	
	public int scoreSum() {
		int intKor = (int)(Math.random() * 100) + 1;
		int intEng = (int)(Math.random() * 100) + 1;
		int intMath = (int)(Math.random() * 100) + 1;
		
		int sum = intKor;
		
		sum += intEng;
		sum += intMath;
		
		return sum;
	}
	
	public void scorePrint() {
		
		/*
		 * String(문자열) type의 변수는 String 클래스 type의 인스턴스
		 * String 클래스에는 문자열을 다루는 다양한 method들이 이미 준비되어있다
		 * 다양한 method를 사용하여 여러가지 기능을 손쉽게 사용 가능
		 */
		
		String dLine = "=";
		String sLine = new String("-");
		
		int intKor = (int)(Math.random() * 100) + 1;
		int intEng = (int)(Math.random() * 100) + 1;
		int intMath = (int)(Math.random() * 100) + 1;
		
		System.out.println(dLine.repeat(50));
		System.out.println("Score");
		System.out.println(sLine.repeat(50));
		System.out.println("Kor  : \t" + intKor);
		System.out.println("Eng  : \t" + intEng);
		System.out.println("Math : \t" + intMath);
		System.out.println(sLine.repeat(50));
		
		int intSum = scoreSum(); // 현재 클래스의 총점 계산 method를 호출
		
		System.out.println("Sum  : \t" + intSum);
		System.out.println(dLine.repeat(50));
	}
}
