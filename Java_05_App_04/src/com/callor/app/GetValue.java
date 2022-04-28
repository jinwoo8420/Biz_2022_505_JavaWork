package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class GetValue {

	public static List<Integer> getList(int length) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < length; i++) {
			list.add((int) (Math.random() * 100) + 1);
		}

		return list;
	}

	public static int[] getArray(int length) {
		int[] num = new int[length];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
		}

		return num;
	}

}
