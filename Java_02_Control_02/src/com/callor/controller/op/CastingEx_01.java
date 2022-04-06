package com.callor.controller.op;

public class CastingEx_01 {

	public static void main(String[] args) {
		short shortNum1 = 0; // 2의 16승
		int intNum1 = 0; // 2의 32승
		long longNum1 = 0; // 2의 64승
		
		/*
		 * 크기(저장공간) 작은 type의 변수에 크기가 큰 type의 변수 값을 복사 대입하는 경우
		 * 값을 잃을 수 있다
		 * 하지만 억지로 대입하고자 한다면 강제 형 변환(Casting)을 수행해야 한다
		 * 강제 형 변환을 수행했을때 예측 할 수 없는 결과가 나올 수 있다
		 */
		
		shortNum1 = (short)intNum1;
		intNum1 = (int)longNum1;
		
		/*
		 * 연산식에 복합연산자가 포함 될 경우 변수 간에 강제 형 변환 발생
		 * 결과는 예축 할 수 없고 중요한 문제 야기 할 수 있다
		 */
		
		shortNum1 += intNum1;
		intNum1 += longNum1;
		
		/*
		 * 실수값(double, float)을 정수형 변수에 대입하면 문법 오류 발생
		 * 오차에 대한 안전장치
		 * 경우에 따라 소수점 이하 값을 무시하고 강제로 형 변환을 하여 실수값을 정수형 변수에 대입
		 */
		
		intNum1 = (int)3.0;
		intNum1 += 3.0;

		/*
		 * 복합연산자가 포함 된 식에서는 실수 값을 정수 값에 대입하는데 문법 오류가 나지 않는다
		 * 내부적으로 강제 형 변환이 일어나기 떄문이다
		 * 값을 예측 할 수 없고 논리적인 문제를 일으키지 않으면 많은 값을 대입하여 오류를 방지해야 한다
		 */
		
		intNum1 = 0;
		
		intNum1 += 3.123123123;
		
		System.out.println(intNum1);
	}

}
