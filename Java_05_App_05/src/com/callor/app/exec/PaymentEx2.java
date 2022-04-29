package com.callor.app.exec;

public class PaymentEx2 {
	/*
	 * 급여를 대한민국 액면가를 기준으로 최소 화폐매수로 지급
	 * 
	 * 대한민국 화폐단위 50000, 10000, 5000, 1000, 500, 100, 50, 10
	 */

	public static void main(String[] args) {
		int pay = 3829980;
		int money = 50000;
		int sw = 1;

		while (pay > 0) {
			int paper = pay / money;

			System.out.println(money + "원 : " + paper);

			pay -= paper * money;

			if (sw > 0) {
				money = money / 5;
			} else {
				money = money / 2;
			}

			sw = sw * (-1);

		}
	}

}
