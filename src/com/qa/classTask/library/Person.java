package com.qa.classTask.library;

public class Person implements Readeablity  {
	
	private String name;
	private  boolean isRegistered;
	public int personalid;
	public static int count=1;

	 
	public Person(String name, boolean isRegistered) {
		super();
		this.name = name;
		this.isRegistered = isRegistered;
		this.personalid=++count;
	}

	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public boolean isRegistered() {
		return isRegistered;
	}


	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", isRegistered=" + isRegistered + ", personalid=" + personalid + "]";
	}




	@Override
	public void reading() {
		System.out.println("This person reads french");
		
	}



	public void speaking() {
		System.out.println("This person s french");
		
	}
	
	
	
	 

}
