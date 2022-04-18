package com.callor.classes.service;

public class ScoreServiceV3 {
	protected String[] student;
	protected int[] intKor;

	public ScoreServiceV3() {
		this(10);
	}

	public ScoreServiceV3(int length) {
		student = new String[length];
		intKor = new int[length];
	}

	public ScoreServiceV3(String[] student) {
		this.student = student;
		intKor = new int[this.student.length];
	}
}
