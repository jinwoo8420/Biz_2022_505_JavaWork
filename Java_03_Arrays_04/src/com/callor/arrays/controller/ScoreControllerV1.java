package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		ScoreServiceV1 sV1 = new ScoreServiceV1();
		
		sV1.makeScore();
		sV1.printScore();
	}

}
