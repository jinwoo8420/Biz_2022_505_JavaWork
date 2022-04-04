package com.callor.controller;

/*
 * com.callor.service.ServiceV1 클래스의 method등을 사용하겠다는 선언
 */

import com.callor.service.ServiceV1;

public class Method_03 {

	public static void main(String[] args) {
		// ServiceV1 클래스에 선언된 add(), multi()를 호출하여 return 된 값을 각각 변수에 저장
		int sum = ServiceV1.add();
		int multi = ServiceV1.multi();
		
		System.out.println(sum + multi);
		
	}

}
