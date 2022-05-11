package com.callor.todo.controller;

import java.util.List;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.InputService;
import com.callor.todo.service.TodoService;
import com.callor.todo.service.impl.InputServiceImplV2;
import com.callor.todo.service.impl.TodoServiceImplV1;
import com.callor.utils.Line;

public class TodoControllerV12 {

	public static void main(String[] args) {
		TodoService toService = new TodoServiceImplV1();
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
			} else if (mainMenu == 4) {
				List<TodoVO> todoList = toService.todoSelectAll();
				printTodo(todoList);

				System.out.println(Line.dLine(50));

				while (true) {
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
