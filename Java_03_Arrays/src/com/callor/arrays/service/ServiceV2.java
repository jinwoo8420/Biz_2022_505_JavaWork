package com.callor.arrays.service;

public class ServiceV2 {
	
	public int scoreKorSum() {
		
		/*
		 * intKor 이름으로 정수형 배열 선언
		 * new int[100] : 100개의 요소(저장공간)를 생성
		 * 정수형이기 때문에 모두 0으로 clear
		 */

		int[] intKor = new int[100];
		
		System.out.println(intKor[3]); // 정수형 intKor의 3번 요소의 값을 Console에 출력
		
		intKor[3] = 100; // 정수형 intKor의 3번 요소의 정수 100을 대입(저장, 할당)
		
		System.out.println(intKor[3]); // 정수형 intKor의 3번 요소의 값을 Console에 출력
		
		return 0;		
	}
}
