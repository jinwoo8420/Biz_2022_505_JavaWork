package com.callor.app.exec;

public class Exec2 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int count = 0, sum = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				count++;
				sum += num[i];
				System.out.print(num[i] + "\t");
			}
		}

		System.out.println("짝수 : " + count);
		System.out.println("짝수 합 : " + sum);
	}

}
