package com.callor.arrays;

public class ArraysV2 {

	public static void main(String[] args) {
		int[] intNums = new int[3];
		
		/*
		 * 배열의 개수를 3개로 선언하면 index는 항상 배열의 개수 -1
		 * index < length : index와 length는 항상 0보다 큰 정수
		 */
		
		intNums[0] = 10;
		intNums[1] = 20;
		intNums[2] = 30;
		intNums[3] = 40; // 배열의 개수(length)가 3인데 index 3번에 값을 저장하려고 시도하면 ArrayOutOfBound 문제 발생
		
		
	}

}
