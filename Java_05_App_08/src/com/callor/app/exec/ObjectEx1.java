package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;

public class ObjectEx1 {

	public static void main(String[] args) {
		ScoreVO scVO = new ScoreVO(); // 한사람의 성적을 저장 할 VO 객체 생성
		scVO.setStNum(1);
		scVO.setIntKor(90);
		scVO.setIntEng(80);
		scVO.setIntMath(85);

		ScoreVO[] scVOs = new ScoreVO[5]; // 5명의 성적을 저장 할 VO 배열 선언
		scVOs[0] = new ScoreVO();
		scVOs[0].setStNum(2);
		scVOs[0].setIntKor(88);
		scVOs[0].setIntEng(89);
		scVOs[0].setIntMath(78);

		scVOs[1] = new ScoreVO();
		scVOs[1].setStNum(3);
		scVOs[1].setIntKor(77);
		scVOs[1].setIntEng(88);
		scVOs[1].setIntMath(99);

		List<ScoreVO> scList = new ArrayList<>(); // 다수의 성적을 저장 할 ScoreVO List 생성
		ScoreVO sVO1 = new ScoreVO();
		sVO1.setStNum(4);
		sVO1.setIntKor(99);
		sVO1.setIntEng(88);
		sVO1.setIntMath(77);

		scList.add(sVO1);

		sVO1 = new ScoreVO();
		sVO1.setStNum(5);
		sVO1.setIntKor(77);
		sVO1.setIntEng(66);
		sVO1.setIntMath(76);

		scList.add(sVO1);
	}

}
