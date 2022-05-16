package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec3 {

	public static void main(String[] args) {
		List<BookVO> bookList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			BookVO bookVO = new BookVO();

			bookVO.setTitle("DO it 자바");
			bookVO.setComp("이지즈버플리시");
			bookList.add(bookVO);			 
		}
		
		for (BookVO vo : bookList) {
			System.out.println(vo.toString());
		}
		
	}

}
