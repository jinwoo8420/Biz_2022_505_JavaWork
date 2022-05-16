package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec4 {

	public static void main(String[] args) {
		List<BookVO> bookList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			String title = ((int) (Math.random() * 1000) + 100) + "";
			BookVO bookVO = new BookVO();

			bookVO.setTitle(title);
			bookList.add(bookVO);
		}

		for (BookVO vo : bookList) {
			System.out.println(vo.toString());
		}

	}

}
