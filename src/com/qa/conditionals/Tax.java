
package com.qa.conditionals;

public class Tax {
	
	//Taxes Create the tax class, it contains 2 methods.
	public static double salary=50000;
	public static double taxvalue;
	
	public static double taxSalary() {
		if(salary < 15000.0) {
			taxvalue=0.0;
			return taxvalue;}
		else if (salary<20000.0){
			taxvalue=0.1;
			return taxvalue;
			
		}
		else if (salary<30000.0){
			taxvalue=0.15;
			return taxvalue;
			
		}
		
		else if (salary<45000.0){
			taxvalue=0.20;
			return taxvalue;
			
		}
		
		else 
			{taxvalue=0.25;
		return taxvalue;}
		
		
	}
	
	public static double  taxedSalary(){
		if(salary < 15000.0) {
			taxvalue=0.0;
			return taxvalue*salary;}
		else if (salary<20000.0){
			taxvalue=0.1;
			return taxvalue*salary;
			
		}
		else if (salary<30000.0){
			taxvalue=0.15;
			return taxvalue*salary;
			
		}
		
		else if (salary<45000.0){
			taxvalue=0.20;
			return taxvalue*salary;
			
		}
		
		else 
			{taxvalue=0.25;
		return taxvalue*salary;}
		
		
	}
	
	
	public static double  taxedSalaryCombined(){
		if(salary < 15000.0) {
			
			return taxSalary();}
		else if (salary<20000.0){
			
			return taxSalary();
			
		}
		else if (salary<30000.0){
			
			return taxSalary();
			
		}
		
		else if (salary<45000.0){
			
			return taxSalary();
			
		}
		
		else 
			{
		return taxSalary();}
		
		
	}
	
	
	public static double combinedTwoMethods() {
		return taxSalary()*salary;
		
	}
	
	public static int getSumMult(int num1,int num2,boolean bool) {
		if(bool==true) {
			return num1+num2;}
			else {return num1*num2;}
		}
	
	public static int blackJack(int num1,int num2) {
		if(num1>0 && num2>0) {
			  if(num1 >21 && num2 >21) {
				  return 0;
			  }
			  else if(num1 >21 &&num2<21) {
				  return num2 ;
			  }
			  
			  else if (num2 >21&& num1<21) 
				{return num1;}
			  else if(Math.abs(num1-21)<Math.abs(num2-21)) {
				 return num1;}
			 else {return num2;}
			
			}	
		
	 else return 0;
		}
	
	public static int uniqueSum(int num1,int num2,int num3) {
	
		if((num1!=num2 )&&(num2!=num3)) {
			return num1+num2+num3;}
			else if((num1==num2)&& (num2!=num3))
				{return num3;}
			else if((num1!=num2)&& (num2==num3)) {
				return num1;}
			else if((num1!=num2)&& (num1==num3)) {
					return num2;}
			else if((num1==num2) && (num2==num3)) {
					return 0;
				}
			else {return 0;}
			}
	
	//fizzBuzz
	public static void fizzBuzz() {
		  for (int index = 1; index <= 100; index++) {
			    if (index % 3 == 0 && index % 5 == 0) {
			      System.out.println("FizzBuzz");
			    } else if (index % 3 == 0) {
			    	   System.out.println("Fizz");
			    } else if (index % 5 == 0) {
			    	   System.out.println("Buzz");
			    } else {
			    	   System.out.println(index);
			    }
			  }
			}
	//Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11
	public static void addTwoDigitNumbers(int num) {
		       int lastNum;
		       int firstNum;	
			lastNum=num%10;			
			firstNum=num/10;
			System.out.println(firstNum+lastNum);
		}
	

   

    
}
	



