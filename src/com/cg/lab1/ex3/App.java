package com.cg.lab1.ex3;

import java.util.Scanner;

/*
 * Exercise 3: The Fibonacci sequence is defined by the following rule. 
 * The first 2 values in the sequence are 1, 1. 
 * Every subsequent value is the sum of the 2 values preceding it. 
 * Write a Java program that uses both recursive and non-recursive functions 
 * to print the nth value of the Fibonacci sequence?
 * https://en.wikipedia.org/wiki/Fibonacci_number 
 */

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inputValue, outputValue = 0;
		System.out.println("Enter a number to print the faboniccs series value upto:");
		inputValue = sc.nextInt();
		int fibonacciSequence[] = new int[inputValue];

		fibonacciSequence[0] = 1;
		fibonacciSequence[1] = 1;

		for (int i = 2; i < inputValue; i++) {
			fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
		}

		for (int i = 0; i < inputValue; i++) {
			outputValue = fibonacciSequence[fibonacciSequence.length - 1];
		}
		System.out.println(outputValue);
		sc.close();
	}
}
