package com.callor.score.service;

import com.callor.score.service.domain.StudentVO;

/*
 * 1. student.txt 파일 읽고 학생 데이터들 만들기
 * 2. 생성된 학생 데이터들을 return
 * 3. 학번을 argument로 받아서 해당 학생 데이터를 return
 */

public interface StudentService {
	/*
	 * 추상 method
	 * method의 접근제한자(public), method의 이름, 매개변수, return type만 정의 한 것
	 * 연산(실행)되는 실제 코드가 없는 method 
	 */
	
	public void loadStudent();

	public StudentVO[] getStudents();
	
	// stNum 학번을 학생 데이터들에서 찾아서(findByNum) 학생 데이터를 return
	public StudentVO findByNum(String stNum);
}
