package com.callor.arrays.service;

public class ServiceV1A {
	
	/*
	 * private으로 선언된 makeScoer()는 ServiceV1A 클래스 블럭에서만 접근(호출) 가능
	 * local method라고 한다
	 */
	
	private int makeScore() {
		return (int)(Math.random() * 100) + 1;
	}
	
	/*
	 * public으로 선언된 scoreKorSum()은 다른 이 프로젝트 어디에서나
	 * 클래스의 인스턴스를 생성하고 인스턴스를 통하여 접근(호출) 가능
	 */
	
	public int scoreKorSum() {
		
		/*
		 * V1에서 Math.random()을 사용하여 점수를 생성하는 코드를
		 * makeScore()로 이전하고 점수 생성이 필요한 경우
		 * makeScore()를 호출하여 결과를 사용한다
		 */
		
		int kor1 = makeScore(); 
		int kor2 = makeScore();
		int kor3 = makeScore();
		int kor4 = makeScore();
		int kor5 = makeScore();
		
		int sum = kor1 + kor2 + kor3 + kor4 + kor5;
		
		return sum;		
	}
}
