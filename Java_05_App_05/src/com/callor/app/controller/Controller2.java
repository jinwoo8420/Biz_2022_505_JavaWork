package com.callor.app.controller;

import com.callor.app.service.ScoreService2;

public class Controller2 {

	public static void main(String[] args) {
		ScoreService2 score = new ScoreService2();

		score.makeScore(20);
		score.scorePrint(20);
	}

}
