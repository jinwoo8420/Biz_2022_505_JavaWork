package com.callor.score.service.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> nums1 = new ArrayList<Integer>();
		List<Float> nums2 = new LinkedList<Float>();

		nums1.add(10);
		nums1.add(20);
		nums1.add(30);

		int num0 = nums1.get(0);
		System.out.println(num0);
		System.out.println(nums1.get(1));
		System.out.println(nums1.get(2));

		// 현재 3개의 데이터만 추가되어 있기 때문에 index 3번 요소의 값은 get() 할 수 없다
//		System.out.println(nums1.get(3));

		for (int i = 0; i < nums1.size(); i++) {
			System.out.println(nums1.get(i));
		}

		// 위 코드에서 nums1.size()은 nums1의 요소 개수 만큼 반복하여 호출 실행된다 (비효율적)

		int nums1Len = nums1.size(); // size값을 for() 명령 이전에 변수에 담아두고 시작

		for (int i = 0; i < nums1Len; i++) {
			Integer num = nums1.get(i);
			System.out.println(num);
		}

		for (Integer num : nums1) {
			System.out.println(num);
		}

	}
}
