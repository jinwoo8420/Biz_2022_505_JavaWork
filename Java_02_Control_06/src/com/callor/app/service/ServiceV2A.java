package com.callor.app.service;

public class ServiceV2A {
	
	public void print() {
		// ServiceV2와 ServiceV2A는 같은 package에 저장된 클래스이기 때문에 import 필요 X
		ServiceV2 sV2 = new ServiceV2();
		
//		sV2.sum(); // sum()은 private으로 설정되어 있기 때문에 호출 불가
		sV2.add(); // add()는 한정자를 생략했기 때문에 같은 package에 있는 클래스들 끼리는 호출 가능
	}
}
