package com.callor.todo.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.todo.model.TodoVO;

public class TodoServiceImplV2 extends TodoServiceImplV1 {

	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}

	/*
	 * 저장된 todolist.txt 파일을 읽어서 todoList에 추가하기
	 */

	protected void loadTodoList() {
		InputStream is = null;

		try {
			is = new FileInputStream(this.saveFileName);
		} catch (FileNotFoundException e) {
			System.out.println(saveFileName + " 파일을 찾을수 없습니다");
			return;
		}
		Scanner fileRead = new Scanner(is);

		while (fileRead.hasNext()) {
			String todoLine = fileRead.nextLine();

			String[] todoInfo = todoLine.split(",");

			String tKey = todoInfo[0];
			String sdate = todoInfo[1];
			String stime = todoInfo[2];
			String edate = todoInfo[3];
			String etime = todoInfo[4];
			String tContent = todoInfo[5];

			if (edate.equalsIgnoreCase("null")) {
				edate = null;
			}

//			if (todoInfo.length < tContent) {
//				continue;
//			}

			TodoVO tVO = TodoVO.builder().tKey(tKey).sdate(sdate).stime(stime).edate(edate).etime(etime)
					.tContent(tContent).build();

			todoList.add(tVO);
		} // end while
		try {

			is.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		fileRead.close();
	} // end loadTodo

	@Override
	public void update(Integer num, String content) {
		int index = num - 1;

		TodoVO tVO;

		try {
			tVO = todoList.get(index);
		} catch (Exception e) {
			System.out.println("리스트에 없음");
			return;
		}

		// 할 일 변경
		tVO.setTContent(content);

		// update 후 내용을 파일에 자동으로 저장
		try {
			this.saveTodo(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} // end class
