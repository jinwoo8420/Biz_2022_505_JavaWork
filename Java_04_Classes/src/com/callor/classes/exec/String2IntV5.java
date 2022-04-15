package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV5 {
	public static void main(String[] args) {
		/*
		 * sc.nextInt() method는 Enter 신호를 다음의 nextLine()에 전달하여 이후의 nextLine()에 문제를 일으킨다
		 */

		Scanner sc = new Scanner(System.in);
		int intNum = 0;

		System.out.print("정수 입력 > ");
		String strNum = sc.nextLine();

		if (strNum.equals("")) {
			System.out.println("숫자만 입력 가능");
		} else {
			intNum = Integer.valueOf(strNum);
		}

		System.out.print("문자열 입력 > ");
		String strValue = sc.nextLine();

		System.out.println("입력된 정수 : " + intNum);
		System.out.println("입력된 문자열 : " + strValue);
	}

}
