package com.qa.classTask.abstruction;

public class Bicycle extends Vehicle {

	private String typeOfbicycle;

	public Bicycle(int id, String type, String manufacturer, String model, String dateofmanufacturer,
			String typeOfbicycle) {
		super(id, type, manufacturer, model, dateofmanufacturer);
		this.typeOfbicycle = typeOfbicycle;
		// TODO Auto-generated constructor stub
	}

	public String getTypeOfbicycle() {
		return typeOfbicycle;
	}

	public void setTypeOfbicycle(String typeOfbicycle) {
		this.typeOfbicycle = typeOfbicycle;
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
