package com.qa.classTask.garage;

public class Motorcycle extends Vehicle {
	public String engineType;

	public Motorcycle(int currentid, String manufacturer, String model, String yearManufactured, String vehicletype,
			double cost, String engineType) {
		super(currentid, manufacturer, model, yearManufactured, vehicletype, cost);

		this.engineType = engineType;

	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Motorcycle [engineType=" + engineType + ", currentid=" + currentid + "]";
	}

}
