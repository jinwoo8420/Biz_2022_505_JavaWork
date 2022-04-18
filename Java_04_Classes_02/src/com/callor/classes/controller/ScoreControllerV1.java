package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV1;

public class ScoreControllerV1 {

	public static void main(String[] args) {
		ScoreServiceV1 sV1 = new ScoreServiceV1(3);

		int result = sV1.input();

		if (result < 0) {
			System.out.println("중단");
		} else {
			System.out.println("완료");
		}
	}

}
