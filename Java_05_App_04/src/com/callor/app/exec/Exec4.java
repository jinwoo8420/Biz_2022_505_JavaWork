package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec4 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		int max = 0;

		for (int i = 0; i < 100; i++) {
			nums.add((int) (Math.random() * 100) + 1);
		}

		for (int i = 0; i < 100; i++) {
			if (nums.get(i) >= 55) {
				if (max < i) {
					max = i;
				}
			}
		}

		for (int i = nums.size() - 1; i > -1; i--) { // for() 역순 진행
			if (nums.get(i) >= 55) {
				System.out.println(max + "번째 : " + nums.get(max));
				break;
			}
		}

		System.out.println(max + "번째 : " + nums.get(max));
	}

}
