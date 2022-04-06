package com.callor.app.controller;

import com.callor.app.service.ServiceV2;

/*
 * ServiceV2 클래스에 guguDan()를 선언하고 guguDan()은 3단 구구단을 출력
 * ControllerV2에서는 guguDan()을 호출하여 구구단 출력 
 */

public class ControllerV2 {

	public static void main(String[] args) {
		ServiceV2 sV2 = new ServiceV2();
		
		sV2.guguDan();
		
		System.out.println("=================================");
		
		sV2.guguDan(5);
	}

}
