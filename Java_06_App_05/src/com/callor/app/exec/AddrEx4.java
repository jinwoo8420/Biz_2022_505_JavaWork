package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx4 {

	public static void main(String[] args) {
		List<AddressVO> aVO = new ArrayList<>();
		AddrServiceV1 addrService = new AddrServiceV1();

		AddressVO vo = new AddressVO();

		vo = AddressVO.builder().name("hong").addr("서울").tel("010-111-111").age(10).habby("산책").build();
		aVO.add(vo);

		vo = AddressVO.builder().name("lee").addr("광주").tel("010-222-222").age(20).habby("산책").build();
		aVO.add(vo);

		vo = AddressVO.builder().name("sung").addr("부산").tel("010-333-333").age(30).habby("산책").build();
		aVO.add(vo);

		addrService.printAddrList(aVO);
	}
}
