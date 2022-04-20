package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;

public class ScoreServiceV2 extends ScoreServiceV1 {

	public ScoreServiceV2() {
		this(10);
	}

	public ScoreServiceV2(int length) {
		scores = new ScoreV2VO[length];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}

	public ScoreServiceV2(String[] stNames) { // 학생 이름 리스트를 배열로 받아서 초기화
		int length = stNames.length;
		scores = new ScoreV2VO[length];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("Score V1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));

		int korSum = 0, engSum = 0, mathSum = 0, sumSum = 0;
		float avgSum = 0;

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%-3s\t", scores[i].getStName());
			System.out.printf("%4d\t", scores[i].getIntKor());
			System.out.printf("%4d\t", scores[i].getIntEng());
			System.out.printf("%4d\t", scores[i].getIntMath());
			System.out.printf("%6d\t", scores[i].getIntSum());
			System.out.printf("%4.2f\n", scores[i].getfAvg());

			korSum += scores[i].getIntKor();
			engSum += scores[i].getIntEng();
			mathSum += scores[i].getIntMath();
			sumSum += scores[i].getIntSum();
			avgSum += scores[i].getfAvg();
		}
		System.out.println(Line.sLine(50));

		System.out.printf("%-3s\t", "총점");
		System.out.printf("%4d\t", korSum);
		System.out.printf("%4d\t", engSum);
		System.out.printf("%4d\t", mathSum);
		System.out.printf("%6d\t", sumSum);
		System.out.printf("%4.2f\n", avgSum);

		System.out.println(Line.dLine(50));

//		System.out.print((korSum / scores.length) + "\t" + (engSum / scores.length) + "\t" + (mathSum / scores.length)
//				+ "\t" + (sumSum / scores.length) + "\t");
//		System.out.printf("%3.2f\n", (avgSum / scores.length));
	}

}
