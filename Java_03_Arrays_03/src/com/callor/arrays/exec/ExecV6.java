package com.callor.arrays.exec;

public class ExecV6 {

	public static void main(String[] args) {
		int[] num = new int[100];
		int count = 0;
		String dLine = "=";

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.println("짝수 리스트");
		System.out.println(dLine.repeat(50));

		for (int i = 0; i < num.length; i++) {
			if ((num[i] % 2) == 0) {
				count++;
				System.out.print(num[i] + ",\t");
			}

			if ((num[i] % 2) == 1) {

			} else if (count % 5 == 0) {
				System.out.println();
			}
		}

	}
}
