package com.callor.arrays.exec;

public class ExecV1 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;

		if ((num % 2) == 0) {
			System.out.println(num + " : 짝수");
		} else if ((num % 2) == 1) {
			System.out.println(num + " : 홀수");
		}

	}
}
