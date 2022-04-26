package com.callor.app.controller;

import java.util.Scanner;

import com.callor.app.utils.Line;

public class MenuController {
	private final int lineLength;
	private final Scanner sc;

	public MenuController() {
		lineLength = 50;
		sc = new Scanner(System.in);
	}

	public void viewMainMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("고려고교 학사관리 2022");
		System.out.println(Line.sLine(lineLength));

		System.out.println("1. 학생정보 관리");
		System.out.println("2. 성적정보 관리");
		System.out.println("QUIT : 종료");
		System.out.println(Line.sLine(lineLength));

		System.out.print("업무 선택 >> ");
	}

	public void viewStMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("학생정보 관리");
		System.out.println(Line.sLine(lineLength));

		System.out.println("1. 학생정보 Loading");
		System.out.println("2. 학생정보 전체보기");
		System.out.println("3. 학번으로 검색");
		System.out.println("4. 이름으로 검색");
		System.out.println("QUIT : Main");
		System.out.println(Line.sLine(lineLength));

		System.out.print("업무 선택 >> ");
	}

	public void viewScMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("성적정보 관리");
		System.out.println(Line.sLine(lineLength));

		System.out.println("1. 성적파일 Loading");
		System.out.println("2. 전체 성적리스트");
		System.out.println("3. 학번으로 검색");
		System.out.println("4. 이름으로 검색");
		System.out.println("QUIT : Main");
		System.out.println(Line.sLine(lineLength));

		System.out.print("업무 선택 >> ");
	}

	public Integer selectMenu() {
		String strKey = sc.nextLine();

		if (strKey.equals("QUIT")) {
			return -1;
		}

		Integer intKey = 0;

		try {
			intKey = Integer.valueOf(strKey);
		} catch (Exception e) {
			return null;
		}

		return intKey;
	}

}
