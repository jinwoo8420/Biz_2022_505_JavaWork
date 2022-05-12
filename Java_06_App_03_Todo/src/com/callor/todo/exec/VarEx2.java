package com.callor.todo.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.todo.model.TodoVO;

public class VarEx2 {

	public static void main(String[] args) {
		List<TodoVO> todoList = new ArrayList<>();
		
		/*
		 * Builder 패턴을 사용한 VO 객체 생성
		 * 
		 * 클래스.builder() method에 의해서 VO 객체가 선언되고
		 * 필드변수로 선언한 것과 같은 이름의 setter method를 사용하여 VO 객체의 각 변수 값을
		 * 채워넣으면서 VO 객체를 생성하는 것
		 */

		TodoVO tVO = TodoVO.builder().sdate("2022-05-11").build();

		todoList.add(tVO);
		
		tVO = new TodoVO();
		tVO.setSdate("2022-05-22");
		tVO.setTContent("목요일 오후");
		todoList.add(tVO);
	}

}
