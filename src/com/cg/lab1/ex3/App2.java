package com.cg.lab1.ex3;

import java.util.Scanner;

class App2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print the fibonacci series value upto:");
		int inputValue = sc.nextInt();
		System.out.println(App2.fibonacciValue(inputValue));
		sc.close();
	}

	public static int fibonacciValue(int input) {
		if (input < 2)
			return 1;
		else
			return fibonacciValue(input - 1) + fibonacciValue(input - 2);

	}

}
