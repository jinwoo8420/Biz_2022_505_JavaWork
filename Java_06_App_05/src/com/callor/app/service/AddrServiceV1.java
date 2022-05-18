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

		for (int i = 0; i < aVO.size(); i++) {
			for (int j = i + 1; j < aVO.size(); j++) {
				if (aVO.get(i).getAge() > aVO.get(j).getAge()) {
					AddressVO temp = aVO.get(j);
					aVO.set(j, aVO.get(i));
					aVO.set(i, temp);
<<<<<<< HEAD
				}
=======
				} 
>>>>>>> 45034f019552631b6012832c6de9dd40a3037de8
			}
		}

		for (int i = 0; i < aVO.size(); i++) {
			System.out.println(aVO.get(i));
		}
	}
}
