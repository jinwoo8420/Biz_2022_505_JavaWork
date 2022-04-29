package com.callor.app.exec;

public class Exec2 {

	public static void main(String[] args) {
		int num = 3905320;
		int money[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		for (int i = 0; i < money.length; i++) {
			if (num / money[i] >= 0) {
				System.out.println(money[i] + " " + num / money[i]);
				num %= money[i];
			}
		}

	}

}
