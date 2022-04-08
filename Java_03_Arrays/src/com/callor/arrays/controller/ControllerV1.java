package com.callor.arrays.controller;

import com.callor.arrays.service.ServiceV1;
import com.callor.arrays.service.ServiceV1A;

public class ControllerV1 {

	public static void main(String[] args) {
		ServiceV1 sV1 = new ServiceV1();
		
		System.out.println(sV1.scoreKorSum());
		
		ServiceV1A sV1A = new ServiceV1A();
		
		System.out.println(sV1A.scoreKorSum());
		
	}

}
