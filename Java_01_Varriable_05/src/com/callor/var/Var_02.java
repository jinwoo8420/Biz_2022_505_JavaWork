package com.callor.var;

public class Var_02 {

	public static void main(String[] args) {
		double num1 = 0, num2 = 0;
		
		num1 = Math.random() * 1000;
		num2 = Math.random() * 1000;
		
		double sum = num1 + num2;
		double des = num1 - num2;
		double mul = num1 * num2;
		double div = num1 / num2;
		
		/*
		 * printf()를 사용하여 3개 변수에 담긴 데이터를 console에 출력
		 * 
		 * System.out.printf("%d + %d = %d\n", num1, num2, sum);
		 * 
		 * "%d + %d = %d" form String을 사용하여 출력 할 모양을 지정하고
		 * 각각 %d 위치에 표현 할 데이터를 3개 나열했다
		 * 여기에 %d는 Decimal(10진수)를 표현하는 키 단어이다
		 * 그런데 num1, num2, sum 변수는 double type이다
		 * double type 변수에 담긴 값을 %d로 표현하려면
		 * 내부에서 데이터 type 문제로 인한 중대한 문제가 발생한다.
		 * %d는 정수만 표현 할 수 있는데 실수 값을 표현하라고 했기 때문에 발생하는 문제
		 */
		
		/*
		 * printf()를 사용하여 실수 데이터를 Console에 출력하려면 %f 기호를
		 * 사용하여 표현해야 한다
		 */
		
		System.out.printf("%f + %f = %f\n", num1, num2, sum);
		
		// %.2f : 정수 부분은 모두 표현하고 소수점 이하 2번째 자리까지 출력
		System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, sum);
		
		System.out.println("==========================================");
		
		System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, sum);
		System.out.printf("%.2f x %.2f = %.2f\n", num1, num2, mul);
		
		System.out.println("==========================================");
		
		/*
		 * %8.2f : 전체 자릿수를 8개로 하고 소수점 이하 2번째 자리까지 출력
		 * 만약 데이터가 전체 자릿수 보다 작으면 남은 부분을 공백으로 표현
		 * 숫자를 오른쪽으로 정렬 할 때 사용
		 * 8.2 : 정수 자릿수 + 소수점(1) + 소수점 이하 2자리를 모두 합한 개수가 8개
		 * 그래서 전체 자릿수가 8개를 넘어가면 form이 흐트러지는 경우도 있다 
		 */
		
		System.out.printf("%.2f + %.2f = %8.2f\n", num1, num2, sum);
		System.out.printf("%.2f x %.2f = %8.2f\n", num1, num2, mul);		
	}

}
