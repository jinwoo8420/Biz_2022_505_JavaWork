package com.callor.app.service;

public class ServiceV2 {
	
	/*
	 * ServiceV2 클래스에는 guguDan()가 두 번 선언되어 있다
	 * 보통 같은 이름의 method를 두 번 이상 선언하면 오류가 발생한다
	 * method의 매개변수(argument)가 있고 없음에 따라 이름은 같지만 서로 다른
	 * method로 판단하여 오류가 발생하지 않는다 
	 */
	
	public void guguDan() {
		
		/*
		 * for(초기화코드; 비교코드; 변화코드) { }
		 * 초기화 코드는 for() 명령을 만나면 최초에 한번만 실행
		 * 비교코드를 실행하여 결과가 true이면 { } 내부의 코드 실행
		 * { } 코드가 실행 완료되면 변화코드 실행
		 */
		
		for (int i = 1; i < 10; i++) {
			System.out.println("3 x " + i + " = " + (3 * i));
		}
	} // end guguDan()
	
	/* 
	 * guguDan(변수선언) 형식으로 method 선언하기
	 * method의 괄호 안에 선언된 변수를 argument라고 한다
	 * argument : 매개변수, parameter
	 * 호출하는 곳에서 값을 전달하면 전달된 값을 변수에 저장하고
	 * 코드내에서 변수 값을 사용하여 연산을 수행한다
	 * argument가 포함된 method를 호출 할 때는 반드시 argument에 합당한 값을 함께 전달해 주어야 한다 (값을 주입)
	 */
	
	public void guguDan(int dan) {
		int index = 1;
		
		for (; index < 10; index++) {
			System.out.println(dan +  " x " + index + " = " + (dan * index));
		}
	}
	
}
