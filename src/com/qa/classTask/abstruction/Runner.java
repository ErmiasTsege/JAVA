package com.qa.classTask.abstruction;

import java.util.ArrayList;
import java.util.List;


public class Runner {

	public static void main(String[] args) {
     
//      System.out.println(sedan.getColor());
//      System.out.println(sedan.getDateOfCreation());
//      
      
      
   
      Car sedan= new Car(1,"4w","Toyota","fusion", "2013", "white");
      Motorcycle jacson = new  Motorcycle(2, "Black","bmw", "turbo", "1999",1000);
      
      
      Bicycle mountain = new Bicycle(3, "big", "bmx", "200","2000");

      
      List <Vehicle> instantGarage = new ArrayList<Vehicle>();
      Garge parkingRoom = new Garge(instantGarage);
      
      parkingRoom.addVehicle(sedan);
      parkingRoom.addVehicle(jacson);
      parkingRoom.addVehicle(mountain);
      double bill = parkingRoom.calculateBill();
      System.out.println("Bill is: "+ bill + "$");
   
      parkingRoom.Render();
    
  
    
      parkingRoom.removeByID(2);
      parkingRoom.Render();
      parkingRoom.addVehicle(mountain);
      parkingRoom.Render();

     

  
      
  	      
	}

}
