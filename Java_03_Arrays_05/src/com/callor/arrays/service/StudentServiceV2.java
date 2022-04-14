package com.callor.arrays.service;

import java.util.Scanner;

import com.callor.arrays.utils.Line;

/*
 * ServiceV2에서 ServiceV1을 상속 받은 상태
 * 상속을 받으면 ServiceV1에 선언된 변수, method를 그대로 물려받는다 (생성자 제외)
 * 
 * 상속 키워드 : extends(확장)
 */

public class StudentServiceV2 extends StudentServiceV1 {

	public StudentServiceV2() { // 기본 생성자 : 클래스를 선언하면 자동으로 선언되는 생성자 method
		this(10);
	}

	public StudentServiceV2(int length) { // 임의 생성자 : 클래스 개발자가 필요에 의해 임의로 선언하는 생성자 method
		strStudent = new String[length];
		sc = new Scanner(System.in);
	}

	/*
	 * Override(재정의) ServiceV1에 선언된 method 중에서 inputStudent method를 다시 정의
	 */

	@Override
	public int inputStudent() {
		System.out.println(Line.dLine(50));
		System.out.println("Student input V2");
		System.out.println(Line.sLine(50));

		int index = 0;

		for (index = 0; index < strStudent.length; index++) {
			System.out.printf("No.%d Student input (QUIT : Exit) >", (index + 1));

			String strName = sc.nextLine();

			if (strName.equals("QUIT")) {
				break;
			}

			strStudent[index] = strName;
		}

		/*
		 * for()가 시작되기전 선언된 index는 for()가 종료되어도 값을 유지하고 있다 
		 * 만약 for() 명령문이 모두 수행되지 않고 중단되면 index < strStudent.length
		 */

		if (index < strStudent.length) {
			System.out.println("QUIT");
		} else {
			System.out.println("END");
		}

//		System.out.println("index : " + index);
//		System.out.println("End");

		return 0;
	}

}
