package com.qa.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrayslist {

	
	
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
