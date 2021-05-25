package com.qa.classTask.garage;

public abstract class Vehicle {

	public int currentid;
	private String manufacturer;
	private String model;
	private String yearManufactured;

	private String Vehicletype;
	private double cost;

	public Vehicle(int currentid, String manufacturer, String model, String yearManufactured, String vehicletype,
			double cost) {
		this.currentid = currentid;
		this.manufacturer = manufacturer;
		this.model = model;
		this.yearManufactured = yearManufactured;
		this.Vehicletype = vehicletype;
		this.cost = cost;
	}

	public int getCurrentid() {
		return currentid;
	}

	public void setCurrentid(int currentid) {
		this.currentid = currentid;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getModel() {
		return model;
	}

	public String getYearManufactured() {
		return yearManufactured;
	}

	public String getVehicletype() {
		return Vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		Vehicletype = vehicletype;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [currentid=" + currentid + ", manufacturer=" + manufacturer + ", model=" + model
				+ ", yearManufactured=" + yearManufactured + ", Vehicletype=" + Vehicletype + ", cost=" + cost + "]";
	}

}