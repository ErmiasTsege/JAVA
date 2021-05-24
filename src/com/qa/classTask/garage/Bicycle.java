package com.qa.classTask.garage;

public class Bicycle extends Vehicle {

	private String bicSize;

	public String getBicSize() {
		return bicSize;
	}

	public void setBicSize(String bicSize) {
		this.bicSize = bicSize;
	}

	public Bicycle(int currentid, String manufacturer, String model, String yearManufactured, String vehicletype,
			double cost, String bicSize) {
		super(currentid, manufacturer, model, yearManufactured, vehicletype, cost);
		this.bicSize = bicSize;
	}

	@Override
	public String toString() {
		return "Bicycle [bicSize=" + bicSize + ", currentid=" + currentid + "]";
	}

}
