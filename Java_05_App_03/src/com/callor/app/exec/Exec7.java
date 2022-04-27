package com.callor.app.exec;

public class Exec7 {

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
