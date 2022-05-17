package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx2 {

	public static void main(String[] args) {
		AddressVO hong = AddressVO.builder().name("hong").addr("서울").tel("010-111-111").build();

		AddrServiceV1 addrService = new AddrServiceV1();

		addrService.printAddr(hong);
	}
}
