package com.qa.iteration;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class AboutString {
public static String str1="yesterday it was raining";
 public static String str2="today is sunny";
 public static String str3;
 public static void concat() {
	 str1=str1.toUpperCase();
	 str2=str2.toUpperCase();
	 System.out.println("\n"+str2 +"," + str1);
	 str3=str2 +"," + str1;
	 System.out.println("\n"+str3.substring(0,8) +" "+ str3.substring(32,39));
 }

 public static void countWords() {
	 int count1=1;
   for (int i=0;i<str2.length();i++) {
	   
     
	    if(str2.charAt(i)=='\s') {
	    	count1++;  
	    	
            }

   }
	System.out.println("\n"+ "There are "+ count1 + " words");
	
 }
 public static void sizeArray() {
	
	 List <Integer>myArray=new ArrayList<Integer>();
	 myArray.add(111);
	 myArray.add(2);
	 myArray.add(114);
	 myArray.add(11); 
	 myArray.add(23); 
	 myArray.set(0, 2200);
	 myArray.remove(0);
	System.out.println(myArray.get(1));
	for (int i=0;i<myArray.size();i++) {
		  System.out.println(myArray.get(i));
	}
	
	for (int i : myArray) {
	      System.out.println(i);
	    }
	myArray.set(0, 2200);
	 Collections.sort(myArray); 
	 System.out.println(myArray);
	 for (int i : myArray) {
	      System.out.println(i);
	    }
 }
 
 
 
}
