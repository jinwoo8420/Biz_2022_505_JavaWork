package com.callor.score.service.exec;

import java.util.List;

import com.callor.score.service.domain.StudentVO;

public class VarEx3 {
	public static void main(String[] args) {
		// primitive
		int num1;
		float num2;
		double num3;
		long num4;
		boolean bYes;
		char char1;

		// wrapper class : 기본형 변수들을 감싸고 있는 class
		Integer num11;
		Float num22;
		Double num33;
		Long num44;
		Boolean bYes1;
		Character char11;
		
		/*
		 * <> : Generic
		 * Object를 선언 할 수 있지만 메모리 관리, 유효성 관리 등이 어렵기 때문에 하지 않는다
		 */
		
		List<Object> list;
		List<Integer> intList;
		
		/*
		 * 데이터의 유효성 검사
		 * Integer type만 add 할 수 있는 intList에 Float type의 값을 추가하려고 하니 오류가 발생한다
		 */
//		intList.add(30.0f);
		
		/*
		 * stList에는 StudentVO type의 데이터만 추가 할 수 있다
		 * 만약 다른 type의 데이터가 추가되면 오류가 난다
		 * 이러한 기능을 사용하지 않으면 stList에 저장 된 데이터가 유효한지 잘못되었는지 걱정해야 할 것 이다 
		 * 사전에 Generic을 선언함으로써 개발자는 데이터에 대한 유효성 문제를 걱정하지 않아도 된다
		 * 즉 stList에 담긴 학생 정보들은 무결성을 유지한다
		 */
		
		List<StudentVO> stList;
	}
}
