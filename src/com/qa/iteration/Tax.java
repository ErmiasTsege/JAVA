package com.qa.iteration;

public class Tax {
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
	
	
	public static double combinedTwoMethods() {
		return taxSalary()*salary;
		
	}
	
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

	public static void addTwoDigitNumbers(int num) {
		       int lastNum;
		       int firstNum;	
			lastNum=num%10;			
			firstNum=num/10;
			System.out.println(firstNum+lastNum);
		}
		
	
	

}
