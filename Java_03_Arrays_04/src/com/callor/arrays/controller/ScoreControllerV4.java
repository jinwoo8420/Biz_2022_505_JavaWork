package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV4;

public class ScoreControllerV4 {

	public static void main(String[] args) {
		ScoreServiceV4 sV4 = new ScoreServiceV4(150);
		
		sV4.makeScore();
		sV4.printScore();
		
	}

}
