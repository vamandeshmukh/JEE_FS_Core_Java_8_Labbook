package com.cg.lab3.ex5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	public static void main(String args[]) {
		App.getTextFileDetails();
	}

	public static void getTextFileDetails() {
		try {
			int lines = 0, characters = 0, words = 0;
			int code = 0;
			FileInputStream fis = new FileInputStream("sample.txt");
			while (fis.available() != 0) {
				code = fis.read();
				if (code != 10)
					characters++;
				if (code == 32)
					words++;
				if (code == 13) {
					lines++;
					words++;
				}
			}
			System.out.println("Number of characters in the file: " + characters);
			System.out.println("Number of words in the file: " + (words + 1));
			System.out.println("Number of lines in the file: " + (lines + 1));
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
