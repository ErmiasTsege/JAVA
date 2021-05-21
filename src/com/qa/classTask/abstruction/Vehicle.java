package com.qa.classTask.abstruction;

public abstract class Vehicle {
	private String manufacturer;
	private String model;
	private String dateOfCreation;
	private String type;
	int id;

	public Vehicle(int id, String type, String manufacturer, String model, String dateofmanufacturer)

	{
		this.id = id;
		this.type = type;
		this.manufacturer = manufacturer;
		this.model = model;
		this.dateOfCreation = dateofmanufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getModel() {
		return model;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public abstract void breaking();

	public abstract void accelerating();

	@Override
	public String toString() {
		return "Vehicle [manufacturer=" + manufacturer + ", model=" + model + ", dateOfCreation=" + dateOfCreation
				+ ", type=" + type + ", id=" + id + "]";
	}

}
