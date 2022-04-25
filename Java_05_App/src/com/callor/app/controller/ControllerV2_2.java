package com.callor.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.service.ServiceV2;

public class ControllerV2_2 {

	public static void main(String[] args) {
		// 1. scoreList에는 실제 데이터가 저장 될 곳의 주소만 담겨있는 상태
		List<Integer> scoreList = new ArrayList<Integer>();
		
		// 2. scoreList의 주소를 생성자의 매개변수로 주입
		ServiceV2 sV2 = new ServiceV2(scoreList);
		
		System.out.println(scoreList);
		
		// 3. scoreList의 주소를 전달받은 intList에 10개의 데이터를 추가
		sV2.getScore(10);
		
		/*
		 *  4. ServiceV2의 getScore()가 추가한 데이터를 바라보고 있는 scoreList를 출력
		 *  5. scoreList와 intList는 같은 데이터를 바라보고 있기 때문에 
		 *     ServiceV2.getScore()가 추가한 데이터를 Controller에서 출력 할 수 있다
		 */
		System.out.println(scoreList);
	}

}
