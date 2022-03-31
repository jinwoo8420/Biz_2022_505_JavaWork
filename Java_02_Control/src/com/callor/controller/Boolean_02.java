package com.callor.controller;

public class Boolean_02 {

	public static void main(String[] args) {
		boolean bYes = true;
				
		System.out.println(bYes); // bYes에 저장 된 값을 출력
		System.out.println(bYes == true); // bYes에 저장 된 값이 true인지 비교연산하여 출력
		
		boolean bWhat = bYes;
		
		bWhat = bYes == true;		
		bWhat = bYes();
		
		
		
	} // end main()
	
	public static boolean bYes() { return true; }

}
