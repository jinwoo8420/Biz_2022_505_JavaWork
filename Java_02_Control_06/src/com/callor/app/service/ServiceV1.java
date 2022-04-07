package com.callor.app.service;

public class ServiceV1 {
	
	public int scoreSum() {
		int intKor = (int)(Math.random() * 100) + 1;
		int intEng = (int)(Math.random() * 100) + 1;
		int intMath = (int)(Math.random() * 100) + 1;
		
		int sum = intKor + intEng + intMath;
		
		return sum;
	}
}
