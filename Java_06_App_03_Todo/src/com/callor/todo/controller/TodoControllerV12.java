package com.callor.todo.controller;

import java.io.IOException;
import java.util.List;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.InputService;
import com.callor.todo.service.TodoService;
import com.callor.todo.service.impl.InputServiceImplV2;
import com.callor.todo.service.impl.TodoServiceImplV2;
import com.callor.utils.Line;

public class TodoControllerV12 {

	public static void main(String[] args) throws IOException {
		TodoService toService = new TodoServiceImplV2();
		InputService inService = new InputServiceImplV2();

		while (true) {
			Integer mainMenu = inService.menu();

			if (mainMenu == null) {
				System.out.println("다시 선택");
				continue;
			}

			if (mainMenu == 1) {
				while (true) {
					String content = inService.inputContent();

					if (content.equals("QUIT")) {
						break;
					}

					toService.todoInsert(content);
				} // end while
			} else if (mainMenu == 2) {
				List<TodoVO> todoList = toService.todoSelectAll();

				printTodo(todoList);
			} else if (mainMenu == 3) {
				while (true) {
					List<TodoVO> todoList = toService.todoSelectAll();
					printTodo(todoList);
					System.out.println(Line.dLine(60));

					System.out.println("내용 변경할 할 일 선택");
					Integer num = inService.selectTodo();

					// 할 일 입력 받고 입력받은 내용을 선택한 Todo의 반영
					if (num == null) {
						System.out.println("숫자만 선택");
						continue;
					}

					if (num == -1) {
						break;
					}

					String content = inService.inputContent();

					if (content.equals("QUIT")) {
						break;
					}

					toService.update(num, content);

//					String content = inService.inputContent();
//					
//					if (content.equals("QUIT")) {
//						break;
//					}
//
//					todoList.get(num - 1).setTContent(content);
//					todoList.get(num - 1).setEdate(null);
				}
			} else if (mainMenu == 4) {

				while (true) {
					List<TodoVO> todoList = toService.todoSelectAll();
					printTodo(todoList);

					System.out.println(Line.dLine(50));

					System.out.println("할 일 선택");
					Integer num = inService.selectTodo();

					if (num == null) {
						System.out.println("숫자만 선택");
						continue;
					}

					if (num == -1) {
						break;
					}

					toService.compTodo(num);
				} // end while

			} else if (mainMenu == 5) {
				toService.saveTodo(null);
			} else if (mainMenu == 6) {
				System.out.println("종료");
				break;
			} // end if
		} // end while
	} // end main

	private static void printTodo(List<TodoVO> toVO) {
		System.out.println(Line.dLine(50));
		System.out.print("No\t");
		System.out.print("시작 일자\t");
		System.out.print("시작 시간\t");
		System.out.print("할 일\t");
		System.out.println("상태");
		System.out.println(Line.sLine(50));

		int size = toVO.size();

		for (int i = 0; i < size; i++) {
			System.out.printf("%d\t", i + 1);
			System.out.print(toVO.get(i).getSdate() + "\t");
			System.out.print(toVO.get(i).getStime() + "\t");
			System.out.print(toVO.get(i).getTContent() + "\t");

			String comp = toVO.get(i).getEdate() == null || toVO.get(i).getEdate().isEmpty() ? "진행 중" : "완료됨";

			System.out.println(comp);
		}
	}
}
