package com.callor.classes.exec;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		String fileName = "data.txt";
		InputStream is = ScannerEx2.class.getResourceAsStream(fileName);		
		Scanner sc = new Scanner(is);
		
		while (true) {
			boolean bYes = sc.hasNext();
			
			if (bYes == false) {
				break;
			}
			
			String strLine = sc.nextLine();
			
			System.out.println(strLine);
		}
	}

}
