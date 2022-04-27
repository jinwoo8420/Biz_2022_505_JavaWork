package com.callor.app.exec;

public class Exec5 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		int iFlag = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				iFlag++;
				break;
			}
		}

		if (iFlag == 0) {
			System.out.println(num + " = 소수");
		} else {
			System.out.println(num + " = 소수 X");
		}

		if (iFlag > 0) {
			System.out.println(num + " = 소수 X");
		} else {
			System.out.println(num + " = 소수");
		}
	}
}
