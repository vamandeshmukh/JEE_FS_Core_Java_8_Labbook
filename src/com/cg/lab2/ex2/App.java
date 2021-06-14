package com.cg.lab2.ex2;

import java.util.Scanner;
/*
 * Exercise 2: Create a method that can accept an array of String objects and 
 * sort in alphabetical order. The elements in the left half should be completely in uppercase and 
 * the elements in the right half should be completely in lower case. Return the resulting array.
 * Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
 */

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array:");
		int arraySize = sc.nextInt();
		String[] inputArray = new String[arraySize];

		for (int i = 0; i < inputArray.length; i++) {
			System.out.println("Please Enter String in the array at position " + (i + 1));
			inputArray[i] = sc.next();
			System.out.println(inputArray[i]);
		}
		sc.close();
		App.sortStrings(inputArray, arraySize);
	}

	static void sortStrings(String[] inputArray, int arraySize) {
		String temp;
		for (int i = 0; i < arraySize; i++) {
			for (int j = i + 1; j < arraySize; j++) {
				if (inputArray[i].compareTo(inputArray[j]) > 0) {
					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		for (int k = 0; k < arraySize / 2; k++) {
			System.out.print(inputArray[k].toUpperCase());
		}
		for (int k = arraySize / 2; k < arraySize; k++) {
			System.out.print(inputArray[k].toLowerCase());
		}
	}

}
