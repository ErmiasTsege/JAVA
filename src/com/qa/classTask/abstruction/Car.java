package com.qa.classTask.abstruction;

public class Car extends Vehicle {
	private String color;

	
	public Car(int id, String type, String manufacturer, String model, String dateofmanufacturer,String color) {
		super(id, type, manufacturer, model, dateofmanufacturer);
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}


	

	public void setColor(String color) {
		this.color = color;
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
