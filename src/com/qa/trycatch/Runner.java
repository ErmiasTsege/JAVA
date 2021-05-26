package com.qa.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		try {
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
				if (num2 == 0) {
					throw new ArithmeticException("Error:Attemting to divide a number by zero!");
				}
				result = Calculator.div(num1, num2);
				System.out.println("The result is:" + result);
				break;
			default:
				System.out.println("please try again");

			}
			scanner.close();
		} catch (InputMismatchException e) {
			System.out.println("You have entered a non numeric field value");
		} finally {
			System.out.println("Finally!!! :) ");
		}

	}
}
