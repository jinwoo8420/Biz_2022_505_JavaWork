package com.callor.score.service;

import com.callor.score.service.domain.StudentVO;

/*
 * 1. student.txt 파일 읽고 학생 데이터들 만들기
 * 2. 생성된 학생 데이터들을 return
 * 3. 학번을 argument로 받아서 해당 학생 데이터를 return
 */

public interface StudentService {
	public void loadStudent();

	public StudentVO[] getStudents();
	
	// stNum 학번을 학생 데이터들에서 찾아서(findByNum) 학생 데이터를 return
	public StudentVO findByNum(String stNum);
}
