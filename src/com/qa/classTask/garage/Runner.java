package com.qa.classTask.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.classTask.garage.Bicycle;
import com.qa.classTask.garage.Car;
import com.qa.classTask.garage.Garge;
import com.qa.classTask.garage.Motorcycle;
import com.qa.classTask.garage.Vehicle;

public class Runner {

	public static void main(String[] args) {

		Vehicle grageitems = new Car(1, "toyota", "DX", "2000", "Sedan", 300.0, "Big");
		Vehicle grageitems2 = new Bicycle(2, "bmx", "mountain", "2001", "course", 300.0, "big");
		Vehicle grageitems3 = new Motorcycle(3, "bmw", "policetype", "2000", "Sedan", 400.0, "big");
		Vehicle grageitems4 = new Motorcycle(4, "suzki", "normal", "2020", "trbuengine", 1400.0, "small");
		List<Vehicle> instanceofGrage = new ArrayList<Vehicle>();

		Garge gragelists = new Garge(instanceofGrage);

		gragelists.AddVheicles(grageitems);

		gragelists.AddVheicles(grageitems2);
		gragelists.AddVheicles(grageitems3);
		gragelists.AddVheicles(grageitems4);

		// gragelists.Render();
		gragelists.removeVehicleById(3);
		gragelists.Render();
		// System.out.println( grageitems.toString());

		System.out.println(gragelists.CalculateBill(grageitems2));

		gragelists.emptyGrage();
		gragelists.Render();
	}

}
