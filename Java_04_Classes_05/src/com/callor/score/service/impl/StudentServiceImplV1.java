package com.callor.score.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.score.service.StudentService;
import com.callor.score.service.domain.StudentVO;

public class StudentServiceImplV1 implements StudentService {
	private StudentVO[] stList;
	private String stFile;

//	public StudentServiceImplV1() {
//	}

	public StudentServiceImplV1(String stFile, int length) {
		this.stFile = stFile;
		this.stList = new StudentVO[length];

		for (int i = 0; i < this.stList.length; i++) {
			this.stList[i] = new StudentVO();
		}
	}

	@Override
	public void loadStudent() {
		InputStream is = null;

		try {
			is = new FileInputStream(this.stFile);
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(stFile + " 파일을 찾을 수 없음");
			return;
		}
		Scanner sc = new Scanner(is);

//		while (true) {
//			boolean bYes = sc.hasNext();
//
//			if (bYes == false) {
//				break;
//			}
//			String stLine = sc.nextLine();
//			System.out.println(stLine);
//		}

		int index = 0; // stList의 요소

		while (sc.hasNext()) {
			String stLine = sc.nextLine();
			System.out.println(stLine);
			String[] stInfos = stLine.split(":");

			System.out.println("학번:" + stInfos[0]);
			System.out.println("이름:" + stInfos[1]);
			System.out.println("학년:" + stInfos[2]);
			System.out.println("학과:" + stInfos[4]);
			System.out.println("주소:" + stInfos[5]);

			StudentVO stVO = new StudentVO();

			stVO.setStNum(stInfos[0]);
			stVO.setStName(stInfos[1]);
			stVO.setStGrade(stInfos[2]);
			stVO.setStDept(stInfos[4]);
			stVO.setStAddr(stInfos[5]);

			stList[index] = stVO;

			index++;
		} // end while (stList에 모든 데이터가 담김)
		this.printStudents();
	} // end loadStudent

	private void printStudents() { // V1에서 stList에 담긴 데이터들을 확인하기 위하여 내부용으로 만든 method
		for (int i = 0; i < stList.length; i++) {
			System.out.println(stList[i].toString());
		}

		for (StudentVO vo : stList) {
			System.out.println(vo.toString());
		}
	}

	@Override
	public StudentVO[] getStudents() {
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		return null;
	}

}
