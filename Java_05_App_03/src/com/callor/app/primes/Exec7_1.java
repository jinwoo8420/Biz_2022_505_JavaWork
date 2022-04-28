package com.callor.app.primes;

public class Exec7_1 {
	/*
	 * 정수형 배열 100개 생성 후 2 ~ 101까지 임의의 수 생성 후 배열에 저장 후 소수 개수 출력
	 */

	public static void main(String[] args) {
		int[] num = new int[100];
		int count = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 2;
		}

		for (int i : num) {
			int index = 0;
			for (index = 2; index < i; index++) {
				if (i % index == 0) {
					break;
				}
			}
			/*
			 * for(index)가 break를 만나면 index 값은 i보다 항상 작다
			 * index 값이 i보다 작다는 것은 i가 소수가 아니라는 것
			 * 반대이면 index == i로 검사 할 수 있지만 index >= i로 검사하여 좀 더 안전한 코드로 작성한다
			 */
			
			if (index >= i) {
				count++;
			}
		}

		System.out.println("소수 : " + count);

	}
}
