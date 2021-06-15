package com.cg.lab3.ex4;

/*
 * Exercise 4: Create a method that accepts a number and modifies it such that 
 * the each of the digit in the newly formed number is equal to the difference between 
 * two consecutive digits in the original number. 
 * The digit in the units place can be left as it is.  
 * Note: Take the absolute value of the difference. Ex: 6-8 = 2
 */

public class App {

	public static void main(String[] args) {

		int number1 = 42569874;
		System.out.println(number1);
		System.out.println(App.modifyNumber(number1));

	}

	public static int modifyNumber(int number1) {

		String temp = Integer.toString(number1);
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < temp.length() - 1; i++) {
			int num = temp.charAt(i) - temp.charAt(i + 1);
			result.append(Math.abs(num));
		}
		result.append(temp.charAt(temp.length() - 1));
		return Integer.parseInt(result.toString());
	}

}
