package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Exec8 {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = new FileInputStream("src/com/callor/app/exec/data.txt");

		Scanner sc = new Scanner(is);
		
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
