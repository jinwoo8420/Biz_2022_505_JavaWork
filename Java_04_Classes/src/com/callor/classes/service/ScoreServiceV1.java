package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV1 {
	/*
	 * 상속을 염두에 두고 클래스를 선언 할 때는
	 * 인스턴스 변수들을 private이 아닌 protected로 선언한다
	 * 
	 * protected : private의 성질을 가지면서 상속받은 클래스에서 상속받아 변수를 선언한 것과 같은 효과를 낸다
	 * 인스턴스 변수도 상속이 된다
	 */
	
	protected String[] students;
	protected int[] intKor;
	protected int lineLength;
	protected Scanner sc;
	
	public ScoreServiceV1() {
		this(10);
	}
	
	public ScoreServiceV1(int length) {
		students = new String[length];
		intKor = new int[length];
		lineLength = 50;
		sc = new Scanner(System.in);
	}
	
	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("Score V1");
		System.out.println(Line.sLine(lineLength));
		
		int index = 0;
		
		for (index = 0; index < students.length; index++) {
			System.out.print((index + 1) + "번 학생 이름(END:중단) : ");
			String strName = sc.nextLine();
			
			if (strName.equals("END")) {
				break;
			}
			
			students[index] = strName; // if() 위에 코드가 위치하면 중단되기 전에 END 문자열이 먼저 저장된다
			
			System.out.print((index + 1) + "번 국어점수 : ");
//			int intScore = sc.nextInt();
//			intKor[index] = intScore;
			String strScore = sc.nextLine();
			
			int intScore = 0;
			
			if (strScore == "") {
				System.out.println("숫자만 입력 가능");				
			} else {
				intScore = Integer.valueOf(strScore);
			}
			
			intKor[index] = intScore;
		}
		
		return 0;
	}
	
	public void print() {
		for (int i = 0; i < students.length; i++) {
//			if(students[i] == null) {
//				break;
//			}
			
			System.out.print(students[i] + "\t");
		}
		System.out.println();
	}

}
