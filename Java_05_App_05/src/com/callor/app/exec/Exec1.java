package com.callor.app.exec;

public class Exec1 {

	public static void main(String[] args) {
		int student = (int) (Math.random() * 26) + 25;
		int pizza = 6;

		System.out.println("학생 수 : " + student);

		for (int i = 5; i < 10; i++) {
			if ((pizza * i) >= student) {
				System.out.println("최소 피자 주문 : " + i);
				break;
			}
		}

//		if ((student % pizza) == 0) {
//			System.out.println("최소 피자 주문 : " + (student / pizza));
//		} else {
//			System.out.println("최소 피자 주문 : " + ((student / pizza) + 1));
//		}
	}

}
