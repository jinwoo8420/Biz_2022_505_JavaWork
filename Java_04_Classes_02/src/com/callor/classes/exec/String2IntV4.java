package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * for()를 사용하여 무한 반복 실행을 하면서
		 * 키보드에서 문자열형 숫자를 입력받고
		 * 정수형 숫자로 변경하여 짝수인지 아닌지 판별하여 출력하기
		 */

		for (;;) {
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
				System.out.println("입력 값 : \"" + strNum + "\" 숫자 변환 불가");
			}

		}

	}
}
