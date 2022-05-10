package com.callor.todo.service;

import java.util.List;

import com.callor.todo.model.TodoVO;

public interface TodoService {
	public void todoInsert(String content); // TODO 추가
	public List<TodoVO> todoSelectAll(); // 전체 TodoList 조회
	public TodoVO findByKey(String key); // key 값으로 1개의 TodoList 조회
	public void update(TodoVO tVO); // Todo 내용 변경 => 할 일 완료 후 사용 할 method
	public void saveTodo(String fileName); // Todo 내용 파일에 저장
}
