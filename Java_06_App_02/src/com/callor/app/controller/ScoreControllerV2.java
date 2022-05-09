package com.callor.app.controller;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV2;

public class ScoreControllerV2 {

	public static void main(String[] args) {
		ScoreService sc = new ScoreServiceImplV2();
		
		sc.inputScore();
	}

}
