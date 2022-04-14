package com.callor.arrays.controller;

import com.callor.arrays.service.StudentServiceV1;

public class StudentController {

	public static void main(String[] args) {
		StudentServiceV1 sV10 = new StudentServiceV1(); // 기본 생성자 호출하여 인스턴스 생성
		StudentServiceV1 sV1 = new StudentServiceV1(5); // 임의 생성자 호출하여 인스턴스 생성
		
		sV1.inputStudent();
//		sV1.printStudent();
	}

}
