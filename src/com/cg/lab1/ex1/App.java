package com.cg.lab1.ex1;

/*
 * Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number
 */

public class App {

	public static void main(String[] args) {
		int input = 12345;
		int output = App.findSumOfCubes(input);
		System.out.println(input);
		System.out.println(output);
	}

	public static int findSumOfCubes(int number) {
		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			sum += digit * digit * digit;
			number /= 10;
		}
		return sum;
	}
}
