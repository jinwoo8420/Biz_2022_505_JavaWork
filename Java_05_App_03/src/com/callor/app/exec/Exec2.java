package com.callor.app.exec;

public class Exec2 {
	/*
	 * 정수형 배열 10개 생성 후 각 요소에 1~100까지 임의의 정수 생성 후 저장하고 
	 * 배열에 저장된 요소의 값을 모두 합산하여 출력
	 */

	public static void main(String[] args) {
		int[] num = new int[10];
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
			sum += num[i];
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		
		System.out.println("sum = " + sum);

	}
}
