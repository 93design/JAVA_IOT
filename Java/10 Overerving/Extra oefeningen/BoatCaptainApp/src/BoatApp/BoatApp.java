package BoatApp;

import Boat.Boat;
import Boat.FisherBoat;
import Boat.SpeedBoat;
import Person.Capitain;
import Person.Passenger;

public class BoatApp {

	public static void main(String[] args) {
		
		Capitain cyriel = new Capitain("cyriel", 63);
		Capitain alex = new Capitain("alex", 29);
		
		System.out.println(cyriel);
		
		
		Boat boat1 = new SpeedBoat(0, "");
		boat1.setCapitian(cyriel);
		
		FisherBoat fish = new FisherBoat(0, "");
		fish.setCapitian(cyriel);
		fish.setDeckNickName("duimpje");
		fish.setDeckNickAge(61);
		
		
		System.out.println(boat1);
		
		//System.out.println(fish);
		cyriel.setName("Den dikken");
		
		System.out.println(boat1);
		
		Passenger test1 = new Passenger("testje", 12, "Huis");
		Passenger test2 = new Passenger("testje", "Huis");
	
		
		boat1 = new SpeedBoat(0, "testje");
		
		
		System.out.println(boat1);
		
		
	}

}
