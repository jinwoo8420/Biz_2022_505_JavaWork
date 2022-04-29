package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.utils.Line;

public class ScoreService {
	ScoreVO sV = new ScoreVO();
	List<ScoreVO> stList = new ArrayList<>();

	public void makeScore(int length) {
		int kor = 0, eng = 0, math = 0, sum = 0;
		float avr = 0;

		for (int i = 0; i < length; i++) {
			sV = new ScoreVO();
			kor = (int) (Math.random() * 51) + 50;
			eng = (int) (Math.random() * 51) + 50;
			math = (int) (Math.random() * 51) + 50;
			sum = kor + eng + math;
			avr = sum / 3.0f;

			sV.setStNum(i);
			sV.setKor(kor);
			sV.setEng(eng);
			sV.setMath(math);
			sV.setSum(sum);
			sV.setAvr(avr);

			stList.add(sV);
		}
	}

	public int scorePrint(int length) {
		int kor_sum = 0, eng_sum = 0, math_sum = 0, sum_sum = 0;

		System.out.println(Line.dLine(50));
		System.out.println("학번" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
		System.out.println(Line.sLine(50));

		for (int i = 0; i < length; i++) {
			System.out.println(stList.get(i));
			kor_sum += stList.get(i).getKor();
			eng_sum += stList.get(i).getEng();
			math_sum += stList.get(i).getMath();
			sum_sum += stList.get(i).getSum();
		}

		System.out.println(Line.dLine(50));
		System.out.println("총점" + "\t" + kor_sum + "\t" + eng_sum + "\t" + math_sum + "\t" + sum_sum);

		return 0;
	}

}
