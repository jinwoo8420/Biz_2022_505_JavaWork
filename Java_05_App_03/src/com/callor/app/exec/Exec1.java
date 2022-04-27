package com.callor.app.exec;

public class Exec1 {
	/*
	 * 10개의 정수형 배열 생성하고 1 ~ 100까지 임의의 정수를 생성하여 각 배열의 요소에 저장
	 */

	public static void main(String[] args) {
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		
		System.out.println();
	}
}
