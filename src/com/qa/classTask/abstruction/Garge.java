package com.qa.classTask.abstruction;

import java.util.ArrayList;
import java.util.List;

public class Garge {

	protected List<Vehicle> garageData;

	public Garge(List<Vehicle> garageData) {
		this.garageData = garageData;
	}

	public void addVehicle(Vehicle grageitems) {
		this.garageData.add(grageitems);
	}

	public void removeVehicle(Vehicle grageitems) {
		this.garageData.remove(grageitems);
	}

	public double calculateBill() {

		double bill = 0.00;
		for (int i = 0; i < this.garageData.size(); i++) {
			if (this.garageData.get(i) instanceof Car) {
				bill = bill + 100.0;
			} else if (this.garageData.get(i) instanceof Motorcycle) {
				bill = bill + 75.0;
			} else if (this.garageData.get(i) instanceof Bicycle) {

				bill = bill + 50.0;
			} else {
				bill = bill + 15.0;
			}
		}
		return bill;
	}

	public void removeByID(int Search) {
		if (!this.garageData.isEmpty()) {
			int index = 0;
			for (int i = 0; i < this.garageData.size(); i++) {
				if (this.garageData.get(i).id == Search) {
					index = i;
				}
			}
			this.garageData.remove(index);
		} else {
			System.out.println("Nothing in the garage to remove.");
		}
	}

	public void Render() {
		if (!this.garageData.isEmpty()) {
			System.out.println("");
			System.out.println(this.garageData.iterator().next());
		} else {
			System.out.println("Sorry! You have no vehicles!");
		}
	}

	public void emptyGrage() {
		if (!this.garageData.isEmpty()) {
			this.garageData.clear();
		} else {
			System.out.println("Nothing in the garage to clear.");
		}
	}

}
