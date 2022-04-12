package com.callor.arrays.exec;

public class ExecV2 {

	public static void main(String[] args) {
		int[] num = new int[100];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < num.length; i++) {
			if ((num[i] % 2) == 0) {
				System.out.println(i + "번 : " + num[i] + " = 짝수");
			} else if ((num[i] % 2) == 1) {
				System.out.println(i + "번 : " + num[i] + " = 짝수 X");
			}
		}

	}
}
