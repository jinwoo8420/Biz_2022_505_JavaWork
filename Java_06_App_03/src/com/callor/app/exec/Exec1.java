package com.callor.app.exec;

public class Exec1 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100) + 1;
			
			if (num % 2 == 0) {
				System.out.println(num + " 짝수");
			} else {
				System.out.println(num + " 홀수");
			}
		}
	}

}
