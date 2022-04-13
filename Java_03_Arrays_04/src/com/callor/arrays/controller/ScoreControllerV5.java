package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV5;

public class ScoreControllerV5 {

	public static void main(String[] args) {
		ScoreServiceV5 sV5 = new ScoreServiceV5(200);
		
		sV5.makeScore();
		sV5.printScore();
		sV5.sumScore();
		
	}

}
