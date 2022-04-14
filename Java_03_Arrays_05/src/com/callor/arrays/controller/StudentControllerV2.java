package com.callor.arrays.controller;

import com.callor.arrays.service.StudentServiceV2;

public class StudentControllerV2 {

	public static void main(String[] args) {
		StudentServiceV2 sV2 = new StudentServiceV2(3);

		sV2.inputStudent();
		sV2.printStudent();
	}

}
