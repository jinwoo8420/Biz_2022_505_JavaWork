package com.callor.todo.service;

import java.io.IOException;
import java.util.List;

import com.callor.todo.model.TodoVO;

public interface TodoService {
	public void todoInsert(String content); // TODO 추가
	public List<TodoVO> todoSelectAll(); // 전체 TodoList 조회
	public TodoVO findByKey(String key); // key 값으로 1개의 TodoList 조회
//	public void update(TodoVO tVO); // Todo 내용 변경 => 할 일 완료 후 사용 할 method
	
	/**
	 * @since 2022-05-13
	 * @author jinwoo8420
	 * @implNote method 변경
	 * 
	 * TodoList의 item index와 content를 매개변수로 받아
	 * TodoList의 항목 중 index번째의 content를 변경 할 수 있도록 method 변경
	 */
	
	public void update(Integer num, String content);
	
	public void compTodo(Integer num); // 할 일 완료 했을 시 사용 할 method
	public void saveTodo(String fileName) throws IOException; // Todo 내용 파일에 저장
}
