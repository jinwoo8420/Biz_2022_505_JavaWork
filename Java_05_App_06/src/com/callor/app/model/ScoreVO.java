package com.callor.app.model;

/*
 * 성적 처리를 하기 위해서 반드시 필요한 데이터
 * 		학번, 국어, 영어, 수학
 * 
 * 출력 결과를 보기 위해서 총점과 평균과 석차도 출력
 * 
 * 추상화 : 필요한 데이터 설계
 * private 변수 선언 : VO 클래스의 추상화 된 데이터를 저장 할 변수들
 * 
 * private 변수에 접근하기 위하여 getter, setter method 선언
 * 저장 된 데이터를 학인하기 위하여 toString() method 재정의
 * 
 * Spring Project에서는 기본 생성자, 모든 필드를 포함한 임의 생성자를 만들지만 Console Project에서는 생성자 생략 가능
 */

public class ScoreVO {
	private int intStNum;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float fAvg;
	private int intRank;

	public int getIntStNum() {
		return intStNum;
	}

	public void setIntStNum(int intStNum) {
		this.intStNum = intStNum;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSum() {
		intSum = intKor + intEng + intMath;

		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getfAvg() {
		fAvg = (float) getIntSum() / 3;

		return fAvg;
	}

	public void setfAvg(float fAvg) {
		this.fAvg = fAvg;
	}

	public int getIntRank() {
		return intRank;
	}

	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}

	/*
	 * toString() method를 재정의하여 한 한생의 성적 내용을 문자열로 만들어 return
	 */

	@Override
	public String toString() {
		String scStr = String.format("%5d\t", intStNum);
		scStr += String.format("%5d\t", intKor);
		scStr += String.format("%5d\t", intEng);
		scStr += String.format("%5d\t", intMath);
		scStr += String.format("%5d\t", getIntSum());
		scStr += String.format("%5.2f\n", getfAvg());

		return scStr;

//		return "ScoreVO [intStNum=" + intStNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
//				+ ", intSum=" + intSum + ", fAvg=" + fAvg + ", intRank=" + intRank + "]";
	}

}
