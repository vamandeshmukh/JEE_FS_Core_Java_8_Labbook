package com.cg.lab1.ex2;

import java.util.Scanner;

/*
 * Exercise 2: Write a java program that simulates a traffic light. 
 * The program lets the user select one of three lights: 
 * red, yellow, or green with radio buttons. 
 * On entering the choice, an appropriate message 
 * with “stop” or “ready” or “go” should appear in the console. 
 * Initially there is no message shown.
 */

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please select one color for the light: \n1 - Red\n2 - Yellow\n3 - Green");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Red light");
			break;
		case 2:
			System.out.println("Yellow light");
			break;
		case 3:
			System.out.println("Green light");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		sc.close();

	}
}
