package com.callor.todo.service.impl;

import java.util.Scanner;

import com.callor.todo.service.InputService;
import com.callor.utils.Line;

public class InputServiceImplV1 implements InputService {
	protected final Scanner sc;

	public InputServiceImplV1() {
		sc = new Scanner(System.in);
	}

	@Override
	public Integer menu() {
		System.out.println(Line.dLine(50));
		System.out.println("업무 선택");
		System.out.println(Line.sLine(50));

		System.out.println("1. TODO 추가");
		System.out.println("2. TODO List 보기");
		System.out.println("3. Key로 검색");
		System.out.println("4. 완료 처리");
		System.out.println("5. 종료");
		System.out.println(Line.sLine(50));

		System.out.print("선택 >> ");
		String strMenu = sc.nextLine();

		Integer intMenu = 0;

		try {
			intMenu = Integer.valueOf(strMenu);
		} catch (Exception e) {
			return null;
		}

		return intMenu;
	}

	@Override
	public String inputContent() {
		System.out.print("할 일 >> ");
		String content = sc.nextLine();

		return content;
	}

	@Override
	public Integer selectTodo() {
		return null;
	}

}
