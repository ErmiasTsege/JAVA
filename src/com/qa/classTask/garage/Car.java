package com.qa.classTask.garage;

public class Car extends Vehicle {

	private String carSize;

	public Car(int currentid, String manufacturer, String model, String yearManufactured, String vehicletype,
			double cost, String carSize) {
		super(currentid, manufacturer, model, yearManufactured, vehicletype, cost);
		this.carSize = carSize;

	}

	public String getCarSize() {
		return carSize;
	}

	public void setCarSize(String carSize) {
		this.carSize = carSize;
	}

	@Override
	public String toString() {
		return "Car [carSize=" + carSize + ", currentid=" + currentid + "]";
	}



}
