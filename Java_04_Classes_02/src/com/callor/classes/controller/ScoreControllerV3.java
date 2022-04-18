package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {
		ScoreServiceV3 sV3 = new ScoreServiceV3();
		sV3 = new ScoreServiceV3(20);

//		String[] strName = new String[5];
		String[] strName = { "홍길동", "이몽룡", "성춘향", "임꺽정", "장보고" };
		
		sV3 = new ScoreServiceV3(strName);
	}

}
