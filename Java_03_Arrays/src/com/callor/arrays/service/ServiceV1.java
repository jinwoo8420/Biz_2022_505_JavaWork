package com.callor.arrays.service;

public class ServiceV1 {
	
	public int scoreKorSum() {
		int kor1 = (int)(Math.random() * 100) + 1;
		int kor2 = (int)(Math.random() * 100) + 1;
		int kor3 = (int)(Math.random() * 100) + 1;
		int kor4 = (int)(Math.random() * 100) + 1;
		int kor5 = (int)(Math.random() * 100) + 1;
		
		int sum = kor1 + kor2 + kor3 + kor4 + kor5;
		
		return sum;		
	}
}
