/*
 * com/callor/hello
 * base package = 현재 생성한 클래스가 저장
 */
package com.callor.hello;

/*
 * HelloKorea.java = 클래스파일 or 자바소스코드
 */
public class HelloKorea {
	/*
	 * main + ctrl + space
	 * 
	 * Key word, reserved word, 명령어(Command word) = ex) package, public, class, static, void
	 */
	public static void main(String[] args) {		
		System.out.println("반갑습니다");
		System.out.println(30 + 40);
		System.out.println(30 * 40);
		System.out.println(40 - 30);
		System.out.println(40 / 2);		
		System.out.println("30 + 40 = " + (30 + 40));		
		System.out.println("30 + 40 = " + "70");		
		System.out.println("대한" + "민국"); // 문자열 + 문자열은 문자열을 연결하여 결과를 만든다
		System.out.println("대한민국");
	}
}
