package BoatDockInterfaces;



public class Car implements Drivable{
	private int horsePower;
	private BrandType brand;
	private Person owner;
	private FuelType fuel;
	private double fuelUsage;
	private double maxFuel;
	
	
	public Car(BrandType brand, FuelType fuel) {
		super();
		this.brand = brand;
		this.fuel = fuel;
	}


	@Override
	public void Move() {
		Drive();
	}


	@Override
	public void Drive() {
		System.out.println("Cruising down the street in my " + brand);
	}


	
	
	
}
