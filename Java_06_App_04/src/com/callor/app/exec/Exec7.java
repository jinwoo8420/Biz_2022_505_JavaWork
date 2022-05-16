package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec7 {

	public static void main(String[] args) {
		int num = 7;

		System.out.println(Line.dLine(50));
		System.out.println(num + "단 구구단");
		System.out.println(Line.sLine(50));

		for (int i = 2; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		
		System.out.println(Line.dLine(50));

	}

}
