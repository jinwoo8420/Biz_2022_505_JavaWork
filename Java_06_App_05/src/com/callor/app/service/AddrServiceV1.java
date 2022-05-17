package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1 {
	public void printAddr(AddressVO aVO) {
		System.out.println(aVO.getAddr());
	}

	public void printAddrList(AddressVO[] aVO) {
		for (int i = 0; i < aVO.length; i++) {
			System.out.println(aVO[i]);
		}
	}

	public void printAddrList(List<AddressVO> aVO) {
		AddressVO temp;

		for (int i = 0; i < aVO.size(); i++) {
			for (int j = i + 1; j < aVO.size(); j++) {
				if (aVO.get(i).getAge() > aVO.get(j).getAge()) {
					temp = aVO.get(j);
					aVO.set(j, aVO.get(i));
					aVO.set(i, temp);
				} else {
					break;
				}
			}
		}

		for (int i = 0; i < aVO.size(); i++) {
			System.out.println(aVO.get(i));
		}
	}
}
