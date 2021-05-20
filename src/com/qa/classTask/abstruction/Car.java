package com.qa.classTask.abstruction;

public class Car extends Vehicle {
	private String color;

	public Car(String manufacturer, String model, String dateofmanufacturer,String color) {
		super(manufacturer, model, dateofmanufacturer);
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
