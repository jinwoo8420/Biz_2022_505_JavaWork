package com.callor.app.exec;

public class Exec4 {
	/*
	 * 1 ~ 100까지 임의의 수를 생성하고 소수인지 아닌지
	 */

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		int index = 0;

		if (num == 1) {
			System.out.println("num = 1");
		}

//		for (int i = 2; i <= num; i++) {
//
//			if (num % i == 0) {
//
//				if (num == i) {
//					System.out.println(num + " = 소수");
//					break;
//				} else {
//					System.out.println(num + " = 소수X");
//					break;
//				}
//
//			}
//		}

		for (index = 2; index < num; index++) {

			if (num % index == 0) {
				System.out.println(num + " = 소수 X");
				break;
			}
		}

		if (num == index) {
			System.out.println(num + " = 소수");
		}

	}
}
