
package com.qa.iteration;

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
	//Recreate the following flowchart as a project.		
	public static void flowChart1() {
		       
		       for (int A=100;A<200;A++) {
		    	   if(A<200) {
		    		   System.out.println(A);
		    	   }
		       }
	}
	//Create a method that can print out the numbers 1-10 10 times each.
	public static void flowChart2() {
		int A=100;
	       do {
	    	   
	    	   if(A%2==0) {
	    		   System.out.println("_");
	    		   A++;
	    	   }else {System.out.println("*"); A++;}
	       }while(A<=200);   
	   	  
     
}
	//Create a method that can print out the numbers 1-10 10 times each.
	public static void printNumber() {
		
		 for (int A=1;A<=10;A++) {
//			for (int B=1;B<=10;B++) //print 1 up to 10 10 times each
			 for (int B=1;B<=A;B++) //print 1 up to 10 A times each
			 {
	    	  System.out.println(A);
	    		       }
}  
	   	  
    
}
	//Create a method that can print out the numbers 1-10 10 times each.
public static void Array1() {
	
	int[] arrayone=new int[10];	
  for(int i=0;i<arrayone.length;i++) {
	  arrayone[i]=i+1;
    System.out.print(arrayone[i]*10+"\s");}
	
}
public static void Array2() {
	
	int[] arraytwo= {1,2,3,4,5,6,7,8,9,10};	
  for(int i=0;i<arraytwo.length;i++) {
	
    System.out.print(arraytwo[i] + "\s");
//  System.out.print(arraytwo[i]*10 + "\s");
    }
}

//Create an array of integers 1-20 and iterate through it, using an enhanced for loop, square, 
//and then print each value.
	
public static void Array3() {
	
	int[] arraythree= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};	
for(int i:arraythree) {
	 System.out.print(i + "\s");
}
	
   

    
}
	
}


