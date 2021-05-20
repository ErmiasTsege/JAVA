package com.qa.conditionals;

import com.qa.String.AboutString;
import com.qa.iteration.Flowcharts;
import com.qa.conditionals.Tax;

public class Runner {

public static void main(String[] args) {
	System.out.println(	Tax.taxSalary());
	System.out.println(	Tax.taxedSalary());
	//System.out.println(	Tax.combinedTwoMethods());
	System.out.println(Tax.	taxedSalaryCombined());

// Create a method which accepts 3 parameters, 2 integers and a boolean.
   //If the boolean is true, the method will return a sum of the two numbers,
	//and it if is false it will return the multiplication of the two numbers.
	System.out.println(Tax.getSumMult(1, 2, true));
	System.out.println(Tax.getSumMult(3, 3, false));
	System.out.println(Tax.getSumMult(1, 1, true));
	//Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21.
	//If they both go over 21 then return 0.
	System.out.println(Tax.blackJack(10, 21));
	System.out.println(Tax.blackJack(20, 18));
	System.out.println(Tax.blackJack(1, 22));
	System.out.println(Tax.blackJack(22, 23));
	
	//Given 3 integer values, return their sum. If one value is the same as another value, 
	//they do not count towards the sum. In other words, only return the sum of unique numbers given.
	System.out.println(	Tax.uniqueSum(1, 2, 3));
	System.out.println(	Tax.uniqueSum(3, 3, 3));
	System.out.println(	Tax.uniqueSum(1, 1, 2));
	//Taxes Create the tax class, it contains 2 methods.

//FizzBuzz
	Tax.fizzBuzz();
//Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11
	Tax.addTwoDigitNumbers(74);
	 
}
}