package com.callor.todo.service;

/*
 * Scanner를 사용하여 키보드에서 입력받는 일을 대신 수행 할 클래스 정의
 */

public interface InputService {
	public Integer menu();
	public String inputContent();
	public Integer selectTodo();	
}
