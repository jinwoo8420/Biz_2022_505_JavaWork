package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		ScoreServiceV1 sV1 = new ScoreServiceV1(3);
		
		sV1.input();
		sV1.print();
	}

}
