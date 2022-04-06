package com.callor.app.controller;

import com.callor.app.service.ServiceV1;

public class ControllerV1 {

	public static void main(String[] args) {

		/*
		 * ServiceVi1 클래스의 method를 사용하기 위한 준비 (인스턴스 생성)
		 * 클래스를 사용하여 변수처럼 객체(object)를 선언하고 new 키워드와 생성자 method를 사용하여
		 * 객체를 인스턴스화 시킨다
		 */
		
		ServiceV1 serviceV1 = new ServiceV1();
		
		int intScoreSum = serviceV1.scoreSum();
		
		System.out.println("Score Sum = " + intScoreSum);
		
		/*
		 * void type의 method는 단독으로 호출한다
		 * 결과를 변수에 담을 수 없다 
		 */
		
		serviceV1.scorePrint();
		
		/*
		 * scoreSum()은 return type int 형이다
		 * scoeSum()은 과목의 총점을 계산하여 결과를 return 하고 있다
		 * main()에서는 scoreSum()을 호출하여 결과를 어딘가에 담아서 출력하는 일을 수행해야 하는데
		 * 아래의 코드는 결과(return)를 받아 수행하는 코드가 없다
		 * 그래서 결과를 확인 할 수 없다
		 */
		
		serviceV1.scoreSum();
		
		/*
		 * scoreSum()이 return 한 결과를 어딘가의 기억 장소에 저장하고 내용을 console에 출력
		 */
		
		System.out.println(serviceV1.scoreSum());
		
		/*
		 * scorePrint()는 void type이기 때문에 println()에 포함하여 사용할 수 없다
		 * System.out.println(serviceV1.scorePrint());
		 */
		
	}

}
