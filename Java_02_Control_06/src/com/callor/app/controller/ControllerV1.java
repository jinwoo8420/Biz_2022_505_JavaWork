package com.callor.app.controller;

import com.callor.app.service.ServiceV1;

public class ControllerV1 {

	public static void main(String[] args) {
		ServiceV1 sV1 = new ServiceV1();
		
		System.out.println(sV1.scoreSum());
	}

}
