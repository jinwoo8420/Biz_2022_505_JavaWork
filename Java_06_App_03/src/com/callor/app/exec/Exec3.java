package com.callor.app.exec;

public class Exec3 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}

		float avg = (float) sum / num.length;

		System.out.println();
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}
