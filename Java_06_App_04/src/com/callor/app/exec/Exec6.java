package com.callor.app.exec;

public class Exec6 {

	public static void main(String[] args) {
		int[] nums = new int[100];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 91) + 10;
		}

		for (int i = 0; i < nums.length; i++) {
			int index = 0;

			for (index = 2; index < nums[i]; index++) {
				if ((nums[i] % index) == 0) {
					break;
				}
			}

			if (nums[i] <= index) {
				System.out.print(nums[i] + " ");
			}
		}
	}

}
