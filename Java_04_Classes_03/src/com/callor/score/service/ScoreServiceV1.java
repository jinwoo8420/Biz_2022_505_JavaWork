package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;

public class ScoreServiceV1 {
	protected ScoreV2VO[] scores;

	public ScoreServiceV1() {
		this(10);
	}

	public ScoreServiceV1(int length) {
		scores = new ScoreV2VO[length];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}

	public ScoreServiceV1(String[] stNames) { // 학생 이름 리스트를 배열로 받아서 초기화
		int length = stNames.length;
		scores = new ScoreV2VO[length];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}
	}

	public void makeScore() {
		for (int i = 0; i < scores.length; i++) {
			int intKor = (int) (Math.random() * 50) + 51;
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;

			scores[i].setIntKor(intKor);
			scores[i].setIntEng(intEng);
			scores[i].setIntMath(intMath);
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
			System.out.print(scores[i].getStName() + "\t");
			System.out.print(scores[i].getIntKor() + "\t");
			System.out.print(scores[i].getIntEng() + "\t");
			System.out.print(scores[i].getIntMath() + "\t");
			System.out.print(scores[i].getIntSum() + "\t");
			System.out.printf("%3.2f\n", scores[i].getfAvg());

			korSum += scores[i].getIntKor();
			engSum += scores[i].getIntEng();
			mathSum += scores[i].getIntMath();
			sumSum += scores[i].getIntSum();
			avgSum += scores[i].getfAvg();
		}
		System.out.println(Line.sLine(50));

		System.out.print("평  균\t" + (korSum / scores.length) + "\t" + (engSum / scores.length) + "\t"
				+ (mathSum / scores.length) + "\t" + (sumSum / scores.length) + "\t");
		System.out.printf("%3.2f\n", (avgSum / scores.length));
	}

}
