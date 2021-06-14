package com.cg.lab1.ex7;

import java.util.Scanner;

/*
 * Exercise 7: Create a method to check if a number is an increasing number. 
 */

public class App {

	public static boolean checkNumber(int number) {

		String str = Integer.toString(number);
		boolean isIncreasingNumber = false;

		for (int i = 0; i < str.length() - 1; i++) { // 1233456 - Yes <= No <
			if (str.charAt(i) < str.charAt(i + 1)) {
				isIncreasingNumber = true;
			} else {
				isIncreasingNumber = false;
				break;
			}
		}
		return isIncreasingNumber;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number: ");

		int number = sc.nextInt();

		sc.close();

		boolean result = App.checkNumber(number);

		if (result) {
			System.out.println("This is an increasing number.");
		} else {
			System.out.println("This is NOT an increasing number.");
		}
	}
}
