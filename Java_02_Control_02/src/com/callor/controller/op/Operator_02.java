package com.callor.controller.op;

public class Operator_02 {

	public static void main(String[] args) {
		int intNum1 = 0, intNum2 = 0;
		
		System.out.println(intNum1 += 10);
		
		System.out.println((intNum1 += 10) > 10);
		
		/*
		 * Short-circut Evaluation(SCE)
		 * (최적화된) 단축 평가 값
		 * 연산의 효율을 높이기 위해 불필요한 연산은 하지 않는다
		 * 두 개의 논리 연산의 결과를 OR 연산하여 console에 출력
		 * 결과는 true 또는 false
		 * 
		 * 1. intNum1 + 10 연산
		 * 2. 결과가 > 20인지 검사 : true
		 * 3. true || ? 연산에서 좌우 값 중 한 개라도 true이면 결과는 true
		 * 즉, ?의 결과가 무엇이든 앞의 결과가 true 이므로 최종 결과는 true
		 * 4. 따라서 이후의 연산은 실행하지 않는다
		 */
		
		System.out.println( ( (intNum1 += 10) > 20) || ( (intNum2 += 10) > 10) );
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		System.out.println( ( (intNum1 += 10) < 20) && ( (intNum2 += 10) < 100) );
	}

}
