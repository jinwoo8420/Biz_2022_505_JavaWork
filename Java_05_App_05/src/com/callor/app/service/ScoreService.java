package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.utils.Line;

public class ScoreService {
	List<ScoreVO> stList = new ArrayList<>();

	public void makeScore() {
		int kor = (int) (Math.random() * 51) + 50;
		int eng = (int) (Math.random() * 51) + 50;
		int math = (int) (Math.random() * 51) + 50;
	}

	public int scorePrint() {
		int kor_sum = 0, eng_sum = 0, math_sum = 0, sum_sum = 0;

		System.out.println(Line.dLine(50));
		System.out.println("학번 국어 영어 수학 총점 평균");
		System.out.println(Line.sLine(50));

		for (int i = 0; i < 20; i++) {
		}

		System.out.println(Line.dLine(50));
		System.out.println("총점 " + kor_sum + " " + eng_sum + " " + math_sum + " " + sum_sum);

		return 0;
	}

}
