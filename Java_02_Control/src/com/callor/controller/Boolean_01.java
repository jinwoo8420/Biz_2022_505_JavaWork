package com.callor.controller;

public class Boolean_01 {

	public static void main(String[] args) {
		int intNum1 = (int)(Math.random() * 1000) + 1;
		int intNum2 = (int)(Math.random() * 1000) + 1;
		
		boolean bEq = intNum1 == intNum2;
		boolean bNotEq = intNum1 != intNum2;
		boolean bGT = intNum1 > intNum2;
		boolean bLT = intNum1 < intNum2;
		
		/*
		 * 논리적 오류(문제)가 있는 코드
		 * intNum1 과 intNum2의 같음과 크기를 비교하여 그 결과를 보여주고 있다
		 * 하지만 같은지 비교를 하고 결과가 false이면 서로 다른지 비교를 한다
		 * 당연히 같지 않으면 bNotEq가 true가 될 것이고
		 * 이후에 else if 명령문은 전혀 실행하지 않는 코드가 된다
		 */
		
		if (bEq) {
			System.out.printf("%d == %d\n", intNum1, intNum2);
		} else if (bNotEq) {
			System.out.printf("%d != %d\n", intNum1, intNum2);
		} else if(bGT) {
			System.out.printf("%d > %d\n", intNum1, intNum2);
		} else if (bLT) {
			System.out.printf("%d < %d\n", intNum1, intNum2);
		}
		
		
	}

}
