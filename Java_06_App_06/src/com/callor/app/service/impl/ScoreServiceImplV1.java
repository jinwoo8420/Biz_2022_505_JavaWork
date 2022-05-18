package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

/*
 * 생성자 패턴
 * 
 * 클래스 영역(필드영역)에서 변수, 객체, 배열 등을 선언만 하고
 * private으로 접근 제한을 하고 객체와 배열은 final로 선언하고
 * (java에서는 기본, spring 임의) 생성자 method에서 선언된 변수를 초기화(생성, 사용 준비)를 한다
 * 
 * 만약 이 클래스를 상속 할 수 있도록 하려면 변수를 protected로 변경해야한다
 */

public class ScoreServiceImplV1 implements ScoreService {
	protected final List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<>();
	}

	@Override
	public void makeScore() {
		for (int i = 0; i < 10; i++) {
			scoreList.add(ScoreVO.builder().stKor((int) (Math.random() * 52) + 50)
					.stEng((int) (Math.random() * 52) + 50).stMath((int) (Math.random() * 52) + 50).build());
		}
	}

	@Override
	public void printScore() {
	}

	@Override
	public void sumScore() {
	}

	@Override
	public void avgScore() {
	}

}
