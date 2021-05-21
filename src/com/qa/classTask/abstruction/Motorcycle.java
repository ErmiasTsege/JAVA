package com.qa.classTask.abstruction;

public class Motorcycle extends Vehicle{
	
	private int price;
	
	
	

	public Motorcycle(int id, String type, String manufacturer, String model, String dateofmanufacturer,int price) {
		super(id, type, manufacturer, model, dateofmanufacturer);
		// TODO Auto-generated constructor stub
		this.price=price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accelerating() {
		// TODO Auto-generated method stub
		
	}


	

}
