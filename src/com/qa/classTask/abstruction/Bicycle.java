package com.qa.classTask.abstruction;

public class Bicycle extends Vehicle {

	
	private String typeOfbicycle;
	
	
	
	public Bicycle(String manufacturer, String model, String dateofmanufacturer,String typeOfbicycle) {
		super(manufacturer, model, dateofmanufacturer);
		
		this.typeOfbicycle=typeOfbicycle;
		
	}

	public String getTypeOfbicycle() {
		return typeOfbicycle;
	}

	public void setTypeOfbicycle(String typeOfbicycle) {
		this.typeOfbicycle = typeOfbicycle;
	}
	
}
