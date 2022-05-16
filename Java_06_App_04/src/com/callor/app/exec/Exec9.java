package com.callor.app.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exec9 {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fileReader = new FileReader("src/com/callor/app/exec/data.txt");
			BufferedReader buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();

				if (reader == null) {
					break;
				}

				System.out.println(reader);

			}

			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
