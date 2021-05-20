package com.qa.classTask.abstruction;

public class Motorcycle extends Vehicle{
	
	private int price;
	
	
	public Motorcycle(String manufacturer,String model, String dateofmanufacturer,int price) {
		
		super(manufacturer,model,dateofmanufacturer);
		this.price=price;
	
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	

}
