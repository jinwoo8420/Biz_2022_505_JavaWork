package com.callor.app.primes;

public class Exec7 {
	/*
	 * 정수형 배열 100개 생성 후 2 ~ 101까지 임의의 수 생성 후 배열에 저장 후 소수 개수 출력
	 */

	public static void main(String[] args) {
		int[] num = new int[100];
		int count = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 2;
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					count++;
					break;
				}
			}
		}

		System.out.println("소수 : " + (num.length - count));
	}
}
