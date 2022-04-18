package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV2;

public class ScoreControllerV2 {

	public static void main(String[] args) {
		ScoreServiceV2 sV2 = new ScoreServiceV2(3);

		int result = sV2.input();

		if (result < 0) {
			System.out.println("중단");
		} else {
			System.out.println("완료");
		}
	}

}
