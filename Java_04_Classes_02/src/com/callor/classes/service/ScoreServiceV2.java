package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV2 {
	protected String[] student;
	protected int[] intKor;
	protected Scanner sc;
	protected int lineLength;

	public ScoreServiceV2() {
		this(10);
	}

	public ScoreServiceV2(int length) {
		student = new String[length];
		intKor = new int[length];
		sc = new Scanner(System.in);
		lineLength = 50;
	}

	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("Score V2");
		System.out.println(Line.sLine(lineLength));

		int index = 0;

		while (index < student.length) {
			System.out.print("이름(END : 중단) >> ");
			String strName = sc.nextLine();

			if (strName.equals("END")) {
				return -1;
			}

			System.out.print("점수(END : 중단) >> ");
			String strKor = sc.nextLine();

			if (strKor.equals("END")) {
				return -1;
			}

			try {
				intKor[index] = Integer.valueOf(strKor);
				student[index] = strName;

				System.out.println("이름 : " + student[index] + " 점수 : " + intKor[index]);
			} catch (Exception e) {
				System.out.println(strKor + " : 정수 X");
			}

			index++;

		}
		
		return 0;

	}
}
