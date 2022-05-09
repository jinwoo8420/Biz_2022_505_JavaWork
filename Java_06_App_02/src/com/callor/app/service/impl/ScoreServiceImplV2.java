package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	public ScoreServiceImplV2() {
		super(); // 상속받은 ScoreServiceImplV1 클래스의 기본 생성자 호출
	}

	@Override
	public void inputScore() {
		while (true) {
			System.out.print("이름(QUIT : 종료) : ");
			String stName = sc.nextLine();

			if (stName.equals("QUIT")) {
				break;
			}

			String[] strSubject = { "국", "영", "수" };
			Integer[] intScore = new Integer[3];

			int index = 0;

			for (index = 0; index < strSubject.length; index++) {
				intScore[index] = 0;

				intScore[index] = getScore(strSubject[index]);

				if (intScore[index] == null) {
					/*
					 * 만약 index 값이 0이라면 국어 점수 입력 화면이 나타난다
					 * 
					 * 점수를 숫자로 입력하지 않고 Enter만 누르거나 다른 문자열이 섞인 경우라면
					 * "점수는 정수만 가능" 메시지를 보여주고 null return
					 * 
					 * 그 후 index 값을 -1 감소시켜 -1로 만든 후 다시 for() 처음으로 점프
					 * 
					 * for(index = -1; ...) {} 다시 실행
					 * 
					 * for(; ; index++)에 의해서 index는 다시 0이 되고
					 * 국어 점수 입력 화면이 다시 나타난다
					 */
					
					index--;
					continue;
				}

				if (intScore[index] < 0) {
					break;
				}
			} // end for
			
			if(index < strSubject.length) {
				break;
			}
			
			/*
			 * Build 패턴 사용하여 VO 객체 생성하면서 데이터 Setting
			 * 
			 * 1. 생성자 키워드 new 사용 X
			 * 2. 클래스.builder() method 시작
			 * 3. VO 클래스에 정의된 변수 이름이 method 역할 수행
			 * 4. 변수 이름에 해당하는 method에 값 전달 후 데이터 저장
			 * 5. build() method 호출하여 마감
			 * 
			 * Build 패턴 사용 이유
			 * 
			 * 1. VO 객체를 생성하고 setter method를 사용하여 데이터를 저장하는 번거로움 해결
			 * 2. 필드 생성자를 사용 할 때 모든 변수의 값을 준비해야하는 번거로움 해결
			 * 3. 준비된 데이터만 가지고 VO 객체를 생성하면서 데이터 Setting 가능
			 */
			
			ScoreVO scVO = ScoreVO.builder()
					.stName(stName)
					.kor(intScore[0])
					.eng(intScore[1])
					.math(intScore[2])
					.build();
			
			scList.add(scVO);
		 } // end while
		
		for (ScoreVO scVO : scList) {
			System.out.println(scVO.toString());
		}
	}

	/*
	 * 정수 점수를 정확히 입력했으면 점수를 return
	 * 
	 * 만약 exception이 발생하면 null return
	 * 
	 * QUIT 입력하면 -1 return
	 */

	private Integer getScore(String title) {
		System.out.printf("%s 점수입력(QUIT : 종료) >> ", title);
		String score = sc.nextLine();

		if (score.equals("QUIT")) {
			return -1;
		}

		Integer intScore = 0;

		try {
			intScore = Integer.valueOf(score);
		} catch (Exception e) {
			System.out.println("점수는 정수만 가능");
			return null;
		}

		return intScore;
	}
}
