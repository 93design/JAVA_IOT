package BoatDockInterfaces;

public class Boat implements Floatable {

	private String name;
	private double weight;
	private int topSpeed;
	
	
	public Boat() {
		super();
	}
	public Boat(String name, double weight, int topSpeed) {
		super();
		this.name = name;
		this.weight = weight;
		this.topSpeed = topSpeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	@Override
	public void Float() {
		System.out.println("Floating on the ocean");
		
	}
	@Override
	public void Move() {
		Float();
	}
	
	
}
