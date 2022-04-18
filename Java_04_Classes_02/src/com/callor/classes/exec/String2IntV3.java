package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 >> ");
		String strNum = sc.nextLine();

		int intNum = 0;

		try {
			intNum = Integer.valueOf(strNum);
			
			boolean bEven = intNum % 2 == 0;

			if (bEven) {
				System.out.println(intNum + " : 짝수");
			} else {
				System.out.println(intNum + " : 짝수 X");
			}
		} catch (Exception e) {
			System.out.println("입력한 문자열은 변환 불가");
		}

		System.out.println("입력 값 : " + intNum);

	}
}
