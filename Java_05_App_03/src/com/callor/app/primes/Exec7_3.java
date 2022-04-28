package com.callor.app.primes;

import java.util.ArrayList;
import java.util.List;

public class Exec7_3 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 2;
			nums.add(num);
		}

		for (Integer num : nums) {
			int index = 0;

			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}
			}

			if (index >= num) {
				count++;
			}
		}
		
		System.out.println("소수 : " + count);
	}
}
