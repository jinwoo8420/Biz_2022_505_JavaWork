package com.callor.arrays.exec;

public class ExecV4 {

	public static void main(String[] args) {
		int[] num = new int[100];
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < num.length; i++) {
			if ((num[i] % 2) == 0) {
				sum += num[i];
				System.out.println(i + "번 : " + num[i] + " = 짝수");
			}
		}

		System.out.println("짝수 합 : " + sum);

	}
}
