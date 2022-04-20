package com.callor.classes.exec;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		String fileName = "data.txt";
		InputStream is = ScannerEx1.class.getResourceAsStream(fileName);		
		Scanner sc = new Scanner(is);		
		String strLine = sc.nextLine();
		
		System.out.println(strLine);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		
		System.out.println(sc.nextLine());
	}

}
