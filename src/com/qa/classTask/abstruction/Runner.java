package com.qa.classTask.abstruction;

public class Runner {

	public static void main(String[] args) {
      Car sedan= new Car("Toyota","fusion", "2013", "white");
      System.out.println(sedan.getColor());
      System.out.println(sedan.getDateOfCreation());
	}

}
