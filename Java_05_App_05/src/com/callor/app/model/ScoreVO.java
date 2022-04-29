package com.callor.app.model;

public class ScoreVO {
	private int stNum;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float avr;

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public float getAvr() {
		return avr;
	}

	public void setAvr(float avr) {
		this.avr = avr;
	}

	@Override
	public String toString() {
		return stNum + " " + kor + " " + eng + " " + math + " " + sum + " " + avr;
	}

}
