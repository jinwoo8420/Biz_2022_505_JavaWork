package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx3 {

	public static void main(String[] args) {
		AddressVO[] aVO = new AddressVO[3];
		AddrServiceV1 addrService = new AddrServiceV1();

		aVO[0] = AddressVO.builder().name("hong").addr("서울").tel("010-111-111").age(10).habby("산책").build();
		aVO[1] = AddressVO.builder().name("lee").addr("광주").tel("010-222-222").age(20).habby("산책").build();
		aVO[2] = AddressVO.builder().name("sung").addr("부산").tel("010-333-333").age(30).habby("산책").build();

		addrService.printAddrList(aVO);
	}
}
