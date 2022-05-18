package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

/*
 * List : interface, 데이터 그룹을 저장하기 위한 type
 * 		Collections type
 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터 type
 * List 를 선언할때는 Generic type 을 지정한다
 * 		1. List 에 add 하는 데이터를 제한하여
 * 		잘못된 데이터가 add 되는 것을 방지하기 위함
 * 		2. 메모리 낭비를 막고 성능상 잇점이 있기 때문에
 * 아래 선언된 List 는 Generic type 이 AddressVO 이다
 * 여기 List 에 데이터를 추가하려면 먼저 AddressVO type 의
 * 		vo 객체를 만들고, 데이터를 저장한 다음 add 한다
 */

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
		aVO.set(2, vo);

		addrService.printAddrList(aVO);
	}
}
