package com.callor.app.service;

import java.util.Scanner;

import javax.sound.sampled.Line;

import com.callor.app.util.LinePrint;

public class ServiceV5 {
	
	int intKor = 0, intEng = 0, intMath = 0;
	
	public int scoreSum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(LinePrint.dLine);
		System.out.println("Score V1");
		System.out.println(LinePrint.sLine);
		System.out.println("50 ~ 100점 범위에서 입력");
		
		System.out.print("Kor > ");
		intKor = sc.nextInt();

		System.out.print("Eng > ");
		intEng = sc.nextInt();
		
		System.out.print("Math > ");
		intMath = sc.nextInt();
		
		int intSum = intKor + intEng + intMath;
		
		return intSum;
	} // end scoreSum()
	
	public void scorePrint() {
		int intSum = scoreSum();
		
		System.out.println(LinePrint.dLine);
		System.out.println("Score");
		System.out.println(LinePrint.sLine);
		System.out.println("Kor  : \t" + intKor);
		System.out.println("Eng  : \t" + intEng);
		System.out.println("Math : \t" + intMath);
		System.out.println(LinePrint.sLine);
		
		System.out.println("Sum  : \t" + intSum);
		System.out.println(LinePrint.dLine);
	}
}
