package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ScoreVO {
	private String stName;
	private int kor;
	private int eng;
	private int math;

	/*
	 * 객체지향에서 이러한 별개의 method를 메시지(객체의 행위)라고 한다
	 * 
	 * VO.getIntSum() method를 호출하면 3과목의 합계 점수를 return한다
	 */

	public int getIntSum() { // 필드 변수와 관계없이 총점을 계산하여 return하는 method 정의
		int sum = kor + eng + math;

		return sum;
	}

	public float getAvg() { // VO.getAvg() method를 호출하면 3과목의 평균을 계산하여 return
		int sum = getIntSum();
		float avg = (float) sum / 3;

		return avg;
	}

	/*
	 * toString() method를 재정의하여 한 학생의 성적 리스트를 문자열로 return
	 */

	public String toString() {
		String result = "";

		result += String.format("%-10s\t", stName); // 전체 10자리의 공간을 만들고 이름 위치 확보
		result += String.format("%5d\t", kor);
		result += String.format("%5d\t", eng);
		result += String.format("%5d\t", math);
		result += String.format("%5d\t", getIntSum());
		result += String.format("%5.2f\n", getAvg());

		return result;
	}

}
