package com.callor.app.controller;

public class MainController {
	public static void main(String[] args) {
		MenuController menu = new MenuController();
		StudentControllerV1 stController = new StudentControllerV1();

		while (true) {
			menu.viewMainMenu();
			Integer select = menu.selectMenu();

			if (select == null) {
				System.out.println("다시 입력");
				continue;
			} else if (select == 1) {
				stController.selectMenu();
			} else if (select == 2) {
				menu.viewScMenu();
			} else if (select == -1) {
				break;
			} else {
				System.out.println("잘못 입력");
			} // end it
		} // end while
		System.out.println("end");
	} // end main
}
