package com.callor.score.exec;

import com.callor.score.domain.ScoreV2VO;

public class ExecV4 {
	public static void main(String[] args) {
		ScoreV2VO[] scores = new ScoreV2VO[100]; // ScoreV2VO 클래스를 사용하여 100개의 배열 객체 선언

		for (int i = 0; i < scores.length; i++) { // 배열 객체 모든 요소를 for() 반복문 내에서 생성자 호출 후 초기화
			scores[i] = new ScoreV2VO();
		}

	}
}
