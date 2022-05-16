package com.callor.app.service.impl;

import java.util.List;

import com.callor.app.model.BookVO;
import com.callor.app.service.BookService;

public class BookServiceImplV1 implements BookService {
	/*
	 * protected 제한자
	 * 
	 * 클래스를 상속해 줄 것을 생각하고 만들때는
	 * 상속받을 클래스에서 변수를 사용 할 수 있도록
	 * private 제한자를 protected로 변경한다
	 * 
	 * protected는 기본적으로 private 성질을 가지면서
	 * 상속받은 클래스에서는 public처럼 변수에 접근 할 수 있다
	 */
	
	protected List<BookVO> bookList;

	@Override
	public void inputBook() {
	}

	@Override
	public void bookList() {
	}

}
