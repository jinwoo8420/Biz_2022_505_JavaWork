package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScoreVO2 {
	protected int stNum;
	protected int intKor;
	protected int intEng;
	protected int intMath;
	protected int intSum;
	protected float fAvg;
	
	public int getIntSum() {
		int intSum = intKor + intEng + intMath;

		return intSum;
	}

	public float getFAvg() {
		return (float) getIntSum() / 3;
	}

	public String toString() {
		/*
		 * 문자열 변수 = "대한민국"
		 * 문자열 변수 += "우리나라"
		 * 
		 * 이러한 코드는 문자열 변수가 관리하는 메모리 구조 상 메모리 낭비와 속도에 이슈가 존재
		 * 그래서 문자열을 여러번 결합하는 코드는 StringBuilder / StringBuffer 라는 클래스를 사용
		 */
		
		StringBuilder retStr = new StringBuilder(); // 문자열 변수 += "문자열"
		
		retStr.append(String.format("%5d\t", stNum));
		retStr.append(String.format("%5d\t", intKor));
		retStr.append(String.format("%5d\t", intEng));
		retStr.append(String.format("%5d\t", intMath));
		retStr.append(String.format("%5d\t", getIntSum()));
		retStr.append(String.format("%5.2f", getFAvg()));

		return retStr.toString();
	}
}
