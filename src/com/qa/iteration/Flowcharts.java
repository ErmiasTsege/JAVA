package com.qa.iteration;

public class Flowcharts {

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
		

	

}