package com.callor.controller;

public class Boolean_03 {

	public static void main(String[] args) {
		boolean bYes = true;
		boolean bWhat = bYes;
		
		bWhat = bYes == false; // bYes에 저장된 값이 false가 물어보는 연산이 실행되고 결과가 bWhat에 저장
		bWhat = bYes != true; // bYes에 저장된 값이 true가 아닌지 물어보는 연산이 실행되고 결과는 false
		bWhat = !bYes; // ! : Not 연산기호 / boolean형 데이터를 반전시키는 연산
		bWhat = !bWhat; 
		bWhat = !bWhat;		
	}

}
