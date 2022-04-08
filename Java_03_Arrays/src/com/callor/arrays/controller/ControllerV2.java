package com.callor.arrays.controller;

import com.callor.arrays.service.ServiceV2;

public class ControllerV2 {

	public static void main(String[] args) {
		
		/*
		 * ServiceV2 클래스를 사용하여 sV2 객체(object)를 선언하고
		 * 생성자 method를 호출하여 sV2를 인스턴스로 생성
		 * 
		 * ServiceV2 type의 sV2 인스턴스 생성하기
		 * 
		 * sV2 인스턴스를 생성하기 위해서는 
		 * ServiceV2 클래스의 생성자 method(ServiceV2())를 호출하여
		 * 새로운(new) 인스턴스를 생성
		 */
		
		ServiceV2 sV2 = new ServiceV2();
		
		sV2.scoreKorSum();
	}

}
