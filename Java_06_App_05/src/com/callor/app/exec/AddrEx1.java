package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class AddrEx1 {

	public static void main(String[] args) {
		AddressVO hong = new AddressVO();
		AddressVO lee = new AddressVO();
		AddressVO sung = new AddressVO();

		hong = AddressVO.builder().name("hong").addr("서울").tel("010-111-111").age(10).habby("산책").build();
		lee = AddressVO.builder().name("lee").addr("광주").tel("010-222-222").age(20).habby("산책").build();
		sung = AddressVO.builder().name("sung").addr("부산").tel("010-333-333").age(30).habby("산책").build();

		System.out.println(hong.toString());
		System.out.println(lee.toString());
		System.out.println(sung.toString());
	}
}
