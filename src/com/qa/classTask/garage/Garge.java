package com.qa.classTask.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.classTask.garage.Vehicle;

public class Garge {

	private int vheicleid = 0;
	public List<Vehicle> garagedata;

	public Garge(List<Vehicle> garagedata) {

		this.garagedata = garagedata;
	}

	public void AddVheicles(Vehicle Vehicleitems) {
		int id;

		id = vheicleid++;

		Vehicleitems.setCurrentid(id);

		this.garagedata.add(Vehicleitems);
	}

	public void Render() {

		if (!this.garagedata.isEmpty()) {
			for (int i = 0; i < garagedata.size(); i++) {
				System.out.println("");
				System.out.println(this.garagedata.get(i));
			}
		} else {
			System.out.println("Sorry! You have no vehicles!");
		}
	}

	public void removeVehicleById(int id) {

		this.garagedata.remove(id);

	}

	public double CalculateBill(Vehicle Vehicleitems) {
		double bill = 0.0;

		if (Vehicleitems instanceof Car) {
			bill = bill + 400.0;
		} else if (Vehicleitems instanceof Motorcycle) {
			bill = bill + 300.0;
		} else if (Vehicleitems instanceof Bicycle) {
			bill = bill + 200.0;
		} else {
			bill = bill + 0.0;
		}

		return bill;

	}

	public void RemoveVehicleByType(Vehicle Vehicleitems) {

		if (Vehicleitems instanceof Car) {
			garagedata.remove(Vehicleitems);
		} else if (Vehicleitems instanceof Motorcycle) {
			garagedata.remove(Vehicleitems);
		} else if (Vehicleitems instanceof Bicycle) {
			garagedata.remove(Vehicleitems);
		} else {
			garagedata.remove(Vehicleitems);
		}

	}

	public List<Vehicle> getVehicles() {
		return this.garagedata;
	}

	public void emptyGrage() {
		if (!this.garagedata.isEmpty()) {
			this.garagedata.removeAll(garagedata);
		} else {
			System.out.println("Nothing in the garage to clear.");
		}
	}

	@Override
	public String toString() {
		return "Garge [ garagedata=" + garagedata + "]";
	}

}
