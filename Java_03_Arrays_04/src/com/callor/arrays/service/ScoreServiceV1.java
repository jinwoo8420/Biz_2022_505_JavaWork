package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV1 {

	/*
	 * 클래스 영역에 선언 된 변수 ScoreServiceV1 클래스에 선언 된 모든 method에서 변수에 접근(읽기, 저장) 할 수 있다
	 * 
	 * 인스턴스 변수 : ScoreServiceV1 클래스를 사용하여 인스턴스를 생성 할 때 (자동으로) 초기화 되는 변수
	 */

	int[] intKor; // 선언만 된 정수형 배열

	/*
	 * ScoreServiceV1 클래스를 초기화 할 생성자 method 선언
	 * 생성자 method는 클래스를 선언하면 클래스 블럭 내부에 자동으로 선언된다
	 * 자동으로 선언 된 생성자 method는 코드상에는 보이지 않는다
	 * 
	 * 임의로 생성자 method를 선언하는 이유
	 * 1.클래스 영역에 선언 된 변수를 초기화하여 사용 할 수 있도록
	 * 준비하는 코드를 포함한다
	 */
	
	public ScoreServiceV1() {
		intKor = new int[100]; // intKor 배열이 사용 할 준비가 됨
	}
	
	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int)(Math.random() * 50) + 51; // 51 ~ 100까지의 임의의 수 생성 
		}
	}
	
	public void printScore() {
		
		/*
		 * Line 클래스에 선언 된 dLine 속성(변수)은 static이기 때문에
		 * Line 클래스를 line 인스턴스로 만들고 line.dLine처럼 접근 할 필요가 없다
		 * 
		 * Line line = new Line();
		 * System.out.println(line.dLine);
		 */
		
		/*
		 * dLine 속성(변수)은 static으로 선언되어 있기 때문에
		 * Line 클래스를 인스턴스로 생성하지 않고도 접근 가능
		 */
		
		System.out.println(Line.dLine);
		System.out.println("Kor Score");
		System.out.println(Line.sLine);
		
		for (int i = 0; i < intKor.length; i++) {
			System.out.print(intKor[i] + "\t");
			
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println(Line.dLine);
	}
}
