package com.qa.array;

public class Arrays {
	// Create a method that can print out the numbers 1-10 10 times each.
	public static void Array1() {

		int[] arrayone = new int[10];
		for (int i = 0; i < arrayone.length; i++) {
			arrayone[i] = i + 1;
			System.out.print(arrayone[i] * 10 + "\s");
		}

	}

	public static void Array2() {

		int[] arraytwo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < arraytwo.length; i++) {

			System.out.print(arraytwo[i] + "\s");
			// System.out.print(arraytwo[i]*10 + "\s");
		}
	}

	// Create an array of integers 1-20 and iterate through it, using an enhanced
	// for loop, square,
	// and then print each value.

	public static void Array3() {

		int[] arraythree = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i : arraythree) {
			System.out.print(i + "\s");
		}

	}

	// Create a method that can print out the numbers 1-10 10 times each.
	public static void printNumber() {

		for (int A = 1; A <= 10; A++) {
//			for (int B=1;B<=10;B++) //print 1 up to 10 10 times each
			for (int B = 1; B <= A; B++) // print 1 up to 10 A times each
			{
				System.out.println(A);
			}
		}

	}

}
