package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV5 {

	/*
	 * makeScore() printScore() sumScore()
	 * 
	 * 등의 method를 선언하고 임의의 성적을 생성하여 intKor에 저장 후 성적일람표 출력 및 총점계산
	 */

	private int[] intKor;

	public ScoreServiceV5(int length) {
		intKor = new int[length];
	}

	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 100) + 1;
		}
	}

	public void printScore() {
		System.out.println(Line.dLine);
		System.out.println("Kor Score");
		System.out.println(Line.sLine);

		for (int i = 0; i < intKor.length; i++) {
			System.out.print((i + 1) + "번 : " + intKor[i] + " \t");

			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println(Line.dLine);
	}

	public void sumScore() {
		int sum = 0;

		for (int i = 0; i < intKor.length; i++) {
			sum += intKor[i];
		}

		System.out.println(intKor.length + "명 총점 : " + sum);

	}
}
