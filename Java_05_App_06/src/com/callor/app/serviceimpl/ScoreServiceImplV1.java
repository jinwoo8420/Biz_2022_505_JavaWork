package com.callor.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.callor.app.utils.Line;

public class ScoreServiceImplV1 implements ScoreService {
	/*
	 * Service 클래스에서 필요한 데이터를 클래스 영역에 선언 할 때는 final 키워드를 사용
	 * 
	 * final 키워드를 사용하면 혹시 모를 데이터 손상을 방지하고 데이터가 저장 된 상태에서 초기화 되는 것을 방지
	 * 
	 * 초기화 하지 않으면 오류가 나서 NullPointerException 예방
	 */

	private final List<ScoreVO> scList; // List 객체 final로 선언

	public ScoreServiceImplV1() {
		scList = new ArrayList<>(); // 생성자에서 List 객체 초기화해서 NullPointerException 예방
	}

	// TODO 성적 데이터 생성
	@Override
	public void makeScore() {

		for (int i = 0; i < 20; i++) {
			int intKor = (int) (Math.random() * 50) + 51; // 51~100까지 범위의 데이터 생성
			int intEng = (int) (Math.random() * 50) + 51;
			int intMath = (int) (Math.random() * 50) + 51;

			// 생성 된 3 과목의 점수를 VO 클래스 생성 후 저장
			ScoreVO scVO = new ScoreVO();

			scVO.setIntStNum(i + 1);
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);

			scList.add(scVO);
		}
	}

	// TODO 성적 데이터 출력
	@Override
	public void printScore() {
		int size = scList.size();
		int lineLength = 50;

		System.out.println(Line.dLine(lineLength));
		System.out.println("한국 고교 성적 일람표");
		System.out.println(Line.sLine(lineLength));

		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(lineLength));

		int[] intTotal = new int[4];
		int I_KOR = 0;
		int I_ENG = 1;
		int I_MATH = 2;
		int I_SUM = 3;

		for (int i = 0; i < size; i++) {
			ScoreVO scVO = scList.get(i);
			
			System.out.printf("%5d\t", scVO.getIntStNum());
			System.out.printf("%5d\t", scVO.getIntKor());
			System.out.printf("%5d\t", scVO.getIntEng());
			System.out.printf("%5d\t", scVO.getIntMath());
			System.out.printf("%5d\t", scVO.getIntSum());
			System.out.printf("%5.2f\n", scVO.getfAvg());

			intTotal[I_KOR] += scVO.getIntKor();
			intTotal[I_ENG] += scVO.getIntEng();
			intTotal[I_MATH] += scVO.getIntMath();
			intTotal[I_SUM] += scVO.getIntSum();
		}

		System.out.println(Line.sLine(lineLength));
		System.out.printf("\t %d\t %d\t %d\t %d\n", intTotal[I_KOR], intTotal[I_ENG], intTotal[I_MATH],
				intTotal[I_SUM]);

	}

}
