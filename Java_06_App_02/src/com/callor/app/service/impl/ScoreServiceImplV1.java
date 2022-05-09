package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {
	protected final List<ScoreVO> scList;
	protected final Scanner sc;

	public ScoreServiceImplV1() {
		scList = new ArrayList<ScoreVO>(); // 제네릭 생략 가능
		sc = new Scanner(System.in);
	}

	@Override
	public void inputScore() {
		while (true) {
			ScoreVO sV = new ScoreVO();

			System.out.print("이름 : ");
			String stName = sc.nextLine();

			if (stName.equals("QUIT")) {
				System.out.println("종료");
				break;
			}

			System.out.print("국어 : ");
			String kor = sc.nextLine();
			Integer intKor = Integer.valueOf(kor);

			System.out.print("영어 : ");
			String eng = sc.nextLine();
			Integer intEng = Integer.valueOf(eng);

			System.out.print("수학 : ");
			String math = sc.nextLine();
			Integer intMath = Integer.valueOf(math);

			sV.setStName(stName);
			sV.setKor(intKor);
			sV.setEng(intEng);
			sV.setMath(intMath);

			scList.add(sV);

			System.out.println();
		} // end while
	}

	@Override
	public void saveScore() {

	}

}
