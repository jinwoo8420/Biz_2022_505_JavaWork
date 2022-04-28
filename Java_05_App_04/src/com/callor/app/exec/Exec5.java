package com.callor.app.exec;

import java.util.List;

import com.callor.app.GetValue;

public class Exec5 {

	public static void main(String[] args) {
		List<Integer> nums = GetValue.getList(100); 
		int max = 0, index = 0;

		for (int i = 0; i < nums.size(); i++) {
			if (max < nums.get(i)) {
				max = nums.get(i);
				index = i;
			}
		}

		System.out.println(index + " " + max);

	}
}
