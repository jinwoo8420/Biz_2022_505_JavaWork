package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.utils.Line;

public class Exec2 {

	public static void main(String[] args) {
		AddressVO[] addrs = new AddressVO[3];

		addrs[0] = new AddressVO();
		addrs[0].setName("hong");
		addrs[0].setAge(30);

		addrs[1] = AddressVO.builder().name("lee").age(20).build();
		addrs[2] = AddressVO.builder().name("sung").age(16).build();

		for (AddressVO aVO : addrs) {
			System.out.println(aVO);
		}

		System.out.println(Line.dLine(70));

		int size = addrs.length;

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (addrs[i].getAge() > addrs[j].getAge()) {
					AddressVO temp = addrs[i];
					addrs[i] = addrs[j];
					addrs[j] = temp;
				}

			}
		}
		
		for (AddressVO aVO : addrs) {
			System.out.println(aVO);
		}
	}

}
