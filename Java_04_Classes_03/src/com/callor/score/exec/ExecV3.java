package com.callor.score.exec;

import com.callor.score.domain.ScoreV2VO;

public class ExecV3 {
	public static void main(String[] args) {
		ScoreV2VO[] scores = new ScoreV2VO[10]; // VO 클래스를 사용하여 배열 선언
		
		/*
		 * 배열로 선언 된 객체는 사용 할 준비가 안됨
		 * 각 요소들을 반드시 생성자로 초기화 시켜줘야 됨
		 */
		
		scores[0] = new ScoreV2VO();
		scores[1] = new ScoreV2VO();
		scores[2] = new ScoreV2VO();
		scores[3] = new ScoreV2VO();
		
		scores[0].setStName("홍길동");
		scores[1].setStName("이몽룡");
		scores[2].setStName("장영자");
		scores[3].setStName("성춘향");
	}
}
