package com.qa.calculator;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("hello world");
          exampleMethod();  
          int result1;
          int result2;
          int result3;
          float  result4;
          result1=add(1,2);
          result2=mult(3,4);
          result3=sub(5,3);
          result4=div(10,5);
          System.out.println(result1);
          System.out.println(result2);  
          System.out.println(result3);
          System.out.println(result4);
          
	}

public static void exampleMethod() {
	System.out.println("Hello i am the method");
}

public static int add(int num1,int num2) {
	return num1+num2;
}
public static int sub(int num1,int num2) {
	return num1-num2;
}
public static int mult(int num1,int num2) {
	return num1*num2;
}
public static float div(float num1,float num2) {
	return num1/num2;
}
}