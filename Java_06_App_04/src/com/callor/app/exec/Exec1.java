package com.callor.app.exec;

public class Exec1 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;

		Call call = new Call();
		int sum = call.add(num1, num2);

		System.out.println("sum : " + sum);
	}

}
