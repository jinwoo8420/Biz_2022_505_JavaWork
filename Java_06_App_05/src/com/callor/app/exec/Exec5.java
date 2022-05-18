package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.utils.Line;

public class Exec5 {

	public static void main(String[] args) {
		List<AddressVO> addrs = new ArrayList<>();

		AddressVO vo = new AddressVO();

		vo.setName("hong");
		vo.setAge(30);
		addrs.add(vo);

		addrs.add(AddressVO.builder().name("lee").age(20).build());
		addrs.add(AddressVO.builder().name("sung").age(16).build());

		addrs.add(new AddressVO()); // 공백 객체 추가
		int size = addrs.size();
		addrs.get(size - 1).setName("lim");
		addrs.get(size - 1).setAge(40);

		for (AddressVO aVO : addrs) {
			System.out.println(aVO);
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (addrs.get(i).getName().compareTo(addrs.get(j).getName()) > 0) {
					AddressVO temp = addrs.get(j);
					addrs.set(j, addrs.get(i));
					addrs.set(i, temp);
				}
			}
		}

		System.out.println(Line.dLine(70));

		for (AddressVO aVO : addrs) {
			System.out.println(aVO);
		}
	}

}
