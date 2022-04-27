package com.callor.app.exec;

public class Exec6 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		int index = 0;

		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}

		if (num > index) {
			System.out.println(num + " = 소수 X");
		} else {
			System.out.println(num + " = 소수");
		}
	}
}
