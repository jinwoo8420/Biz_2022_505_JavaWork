package com.callor.app.primes;

import java.util.ArrayList;
import java.util.List;

public class Exec7_5 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 2;
			nums.add(num);
		}
		
		int size = nums.size();
		
		for (Integer i = 0; i < size; i++) {
			count += prime(nums.get(i));
		}
		
		System.out.println("소수 : " + count);
	}

	/*
	 * 매개변수로 전달받은 num 변수 값이
	 * 소수이면 1 아니면 0을 return
	 */

	public static Integer prime(Integer num) {
		for (Integer i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}

		return 1;
	}
}
