package com.qa.calculatorMaven;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double result;

		System.out.println("please enter the two numbers:");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();

		System.out.println("please enter the operation you want to perform (+ - * /):");
		String operation = scanner.next();

		switch (operation) {
		case "+":
			result = Calculator.add(num1, num2);
			System.out.println("The result is:" + result);
			break;
		case "-":
			result = Calculator.sub(num1, num2);
			System.out.println("The result is:" + result);
			break;
		case "*":
			result = Calculator.mult(num1, num2);
			System.out.println("The result is:" + result);
			break;
		case "/":
			result = Calculator.div(num1, num2);
			System.out.println("The result is:" + result);
			break;
		default:
			System.out.println("please try again");

		}

		scanner.close();
	}

}
