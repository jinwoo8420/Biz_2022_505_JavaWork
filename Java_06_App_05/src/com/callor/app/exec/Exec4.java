package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec4 {

	public static void main(String[] args) {
		String str1 = "A";
		String str2 = "B";

		int comp = str1.compareTo(str2);
		System.out.println(comp);

		comp = str2.compareTo(str1);
		System.out.println(comp);

		comp = str1.compareTo(str1);
		System.out.println(comp);

		String[] strs = { "F", "A", "C", "B", "D" };

		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i] + "\t");
		}

		for (int i = 0; i < strs.length; i++) {
			for (int j = i + 1; j < strs.length; j++) {
				if (strs[i].compareTo(strs[j]) > 0) {
					String temp = strs[i];
					strs[i] = strs[j];
					strs[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println(Line.dLine(50));
		
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i] + "\t");
		}
	}

}
