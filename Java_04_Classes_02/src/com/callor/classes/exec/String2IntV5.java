package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * 반복되는 횟수가 정해지지 않고 어떤 조건에 따라 무한히 반복되는 코드를 작성 할 때는 
		 * for()를 사용하지 않고 while() 명령문을 사용한다 
		 * () 안의 조건이 true 일 동안 { } 안의 코드를 무한히 반복한다
		 */

		while (true) {
			System.out.print("정수 입력(END : 종료) >> ");
			String strNum = sc.nextLine();

			if (strNum.equals("END")) {
				break;
			}

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

		} // end while
		
		System.out.println("END");

	}
}
