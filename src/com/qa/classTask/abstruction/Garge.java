package com.qa.classTask.abstruction;

import java.util.ArrayList;
import java.util.List;

public class Garge {

	protected List<Vehicle> garageData;
	// public List <String>garageData=new ArrayList<String>();

//public Garge(List) {
//
//	}
//Car [] carlist =new Car[100];
//int carCount;
//	
//	public void createCar(int id, String type, String manufacturer, String model, String dateofmanufacturer,String Color) {
//		carlist[carCount++]=new Car(id, type, manufacturer, model, dateofmanufacturer,Color);
//		
//	}

//public void addVehicle(String vehicles) {
//	gragelists.add(vehicles);
//	
//
//}
//
//
//public void calculateBill(String vehicles) {
//	gragelists.add(vehicles);
//	
//
//}
//
//public void removeVehicle(String vehicles) {
//	gragelists.add(vehicles);
//	
//
//}
//public void emptyGrage(String vehicles) {
//	gragelists.add(vehicles);
//	
//
//}

	public Garge(List<Vehicle> garageData) {
		this.garageData = garageData;
	}

	public void addVehicle(Vehicle loco) {
		this.garageData.add(loco);
	}

	public void removeVehicle(Vehicle loco) {
		this.garageData.remove(loco);
	}

	public double calculateBill() {
		
		double bill = 0.00;
		for (int i = 0; i < this.garageData.size(); i++) {
			if (this.garageData.get(i) instanceof Car) {
				bill = bill + 12.57;
			} else {
				bill = bill + 5;
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
			System.out.println(this.garageData.iterator().next().toString());
		} else {
			System.out.println("Sorry! You have no cars!");
		}
	}
}
