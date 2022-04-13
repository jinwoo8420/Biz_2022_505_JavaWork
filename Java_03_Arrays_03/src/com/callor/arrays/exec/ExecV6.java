package com.callor.arrays.exec;

/*
 * 정수형 배열 100개를 선언 후 Math.random()을 사용하여 1 ~ 100까지 임의의 수를 생성하고
 * 각 요소에 저장 후 배열의 각 요소에 저장 된 수 중에서
 * 짝수 리스트를 한 라인에 5개씩 끊어서 출력
 */

public class ExecV6 {

	public static void main(String[] args) {
		int[] num = new int[100];
		int count = 0;
		String dLine = "=";

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.println("짝수 리스트");
		System.out.println(dLine.repeat(50));

		for (int i = 0; i < num.length; i++) {
			if ((num[i] % 2) == 0) {
				count++;
				System.out.print(num[i] + ",\t");

				if (count % 5 == 0) {
					System.out.println();
				}
			}

//			if ((num[i] % 2) == 1) {
//			} else if (count % 5 == 0) {
//				System.out.println();
//			}
		}

	}
}

