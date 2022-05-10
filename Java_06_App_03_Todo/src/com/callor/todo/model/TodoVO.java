package com.callor.todo.model;

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
public class TodoVO {
	private String tKey; // ID
	private String tContent; // 할 일
	private String sdate; // 추가한(시작한) 날짜
	private String stime; // 추가한(시작한) 시각
	private String edate; // 완료한 날짜
	private String etime; // 완료한 시각
	private boolean bComp; // 완료 여부(true, false)

	@Override
	public String toString() {
		String result = String.format("%s\t", tKey);
		result += String.format("%s\t", sdate);
		result += String.format("%s\t", stime);

		/*
		 * 3항 연산
		 * 
		 * edate.isEmpty()가 true이면 "현재 진행 중" 문자열을 compStr에 저장 그렇지 않으면 "완료"를 compStr에 저장
		 */

//		String compStr = edate.isEmpty() ? "현재 진행 중" : "완료";
		
		// edate 값이 null이거나 "" 일 경우
		String compStr = edate == null || edate.isEmpty() ? "현재 진행 중" : "완료";

		if (edate == null || edate.isEmpty()) { // if문으로 풀어 썼을 경우
			compStr = "현재 진행 중";
		} else {
			compStr = "완료";
		}

		result += String.format("%s\n", compStr);

		return result;
	}
}
