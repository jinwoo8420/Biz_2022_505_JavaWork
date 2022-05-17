package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx5 {

	public static void main(String[] args) {
		List<AddressVO> aVO = new ArrayList<>();
		AddrServiceV1 addrService = new AddrServiceV1();

		AddressVO vo = new AddressVO();

		vo = AddressVO.builder().name("hong").tel("010-111-111").age(33).build();
		aVO.add(vo);

		vo = AddressVO.builder().name("lee").tel("010-222-222").age(19).build();
		aVO.add(vo);

		vo = AddressVO.builder().name("sung").tel("010-333-333").age(16).build();
		aVO.add(vo);
		
		vo = AddressVO.builder().name("lim").tel("010-444-444").age(45).build();
		aVO.set(2,vo);
		
		addrService.printAddrList(aVO);
	}
}
