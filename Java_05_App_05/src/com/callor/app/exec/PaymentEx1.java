package com.callor.app.exec;

public class PaymentEx1 {
	/*
	 * 급여를 대한민국 액면가를 기준으로 최소 화폐매수로 지급
	 * 
	 * 대한민국 화폐단위 50000, 10000, 5000, 1000, 500, 100, 50, 10
	 */

	public static void main(String[] args) {
		int pay = 3928880;

		int paper = (pay / 50000);
		System.out.println("5만원 " + paper);
		pay -= paper * 50000;
	}

}
