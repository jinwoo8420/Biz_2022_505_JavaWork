package com.callor.app.exec;

public class Exec3 {
	/*
	 * 임의의 정수 10개를 만들어 각각의 수를 even() method에 매개변수로 전달하고
	 * even() method는 매개변수로 전달받은 값이 짝수이면 전달받은 값, 아니면 0을 return
	 * even() method가 return한 값을 합산하여 출력
	 */
	
	public static void main(String[] args) {
		int count = 10;
		int num = 0, sum = 0;
		
		for (int i = 0; i < count; i++) {
			num = (int)(Math.random() * 100) + 1;
			System.out.print(even(num) + "\t"); 
			sum += even(num);
		}
		
		System.out.println("sum = " + sum);
		
	}

	public static int even(int num) {
		if(num % 2 == 0) {
			return num;
		} else {
			return 0;
		}
	}
}
