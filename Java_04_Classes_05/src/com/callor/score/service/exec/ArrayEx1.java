package com.callor.score.service.exec;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] intNums = new int[10];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < intNums.length; i++) {
			System.out.print(intNums[i] + "\t");
		}
		
		System.out.println();
		
		/*
		 * forEach : 확장된 for() 명령
		 * 배열의 0부터 끝까지(전체요소)에 대하여 연속적으로 연산을 수행하기 위한 simple한 for() 명령
		 * 전체 배열에 연산을 하고자 할 때 배열요소에 값을 저장 할 때는 사용 할 수 없다
		 * 배열요소 전체를 개별적으로 읽어서 연산을 수행하고자 할 때만 사용 가능
		 */
		
		for (int num : intNums) {
			System.out.print(num + "\t");
		}
	}
}
