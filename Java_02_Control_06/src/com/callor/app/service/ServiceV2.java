package com.callor.app.service;

/*
 * 한정자, 제한자
 * 클래스, method, 변수 등의 첫번째 키워드로 사용하는 것들
 * public private protected
 * 한정자를 어떤 것을 사용하느냐에 따라 클래스, method, 변수 등을 다른 블럭에서
 * 사용(호출, 실행) 할 수 있는 권한이 달라진다
 * 
 * public은 어디에서나, 누구나 사용 할 수 있다
 * 
 * private은 같은 블럭에서만 사용 할 수 있다
 * 만약 method를 private으로 지정하면 다른 곳에서 인스턴스.method()와 같은 코드로 사용 할 수 없다
 * 
 * 생략을 하면 같은 package에서는 호출 할 수 있다
 * package가 달라지면 private과 성질이 같아진다
 */

public class ServiceV2 {
	
	private int sum() { // private 한정자 설정
		return 100 + 200;
	}
	
	int add() { // 한정자 생략
		return 200 + 300;
	}
}
