package com.callor.score.service.controller;

import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.callor.score.service.domain.StudentVO;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.service.impl.StudentServiceImplV1;

public class ScoreControllerV2 {
	public static void main(String[] args) {
		String stFile = "src/com/callor/score/data/student.txt";
		int stLength = 50;
		StudentService stService = new StudentServiceImplV1(stFile, stLength);
		
		stService.loadStudent();
		StudentVO[] stList = stService.getStudents();
		StudentVO stNo1 = stService.findByNum("0001");
		/*
		 * ScoreServiceImplV1 클래스를 사용하여 객체를 생성하고
		 * method를 호출하여 기능을 수행하려고 한다
		 * 
		 * 보통 다음과 같은 코드로 인스턴스를 생성한다
		 * 		클래스 객체 = new 클래스()
		 * 
		 * 인터페이스를 상속 받아서 선언한 클래스일 경우는 인터페이스로 객체를 선언하고
		 * 실제 사용 할 클래스의 생성자를 호출하여 인스턴스를 생성한다
		 * 		인터페이스 객체 = new 클래스Impl()
		 */
		
		/*
		 * ScoreService 인터페이스로 scService 객체를 선언하고 
		 * ScoreServiceImplV1 클래스의 생성자를 호출하여 인스턴스 생성
		 */
		ScoreService scService = new ScoreServiceImplV1();
		
		scService.makeScore();
		scService.printScore();
	}
}
