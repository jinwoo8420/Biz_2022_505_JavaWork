package com.callor.score.controller;

import com.callor.score.service.ScoreServiceV3;

public class ScoreControllerV3 {

	public static void main(String[] args) {
		String[] stNames = { "홍길동", "이몽룡", "성춘향", "장보고", "임꺽정" };

		ScoreServiceV3 sV3 = new ScoreServiceV3(stNames);

		sV3.makeScore();
		sV3.printScore();

	}

}
