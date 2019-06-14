package Boat;

import Person.Capitain;

public abstract class Boat {
	
	private  double weight;
	private double topSpeed = 50;
	private String name;
	//hier 
	private Capitain capitian;
	protected double speed = 0;
	
	public Boat(double weight, String name) {
		super();
		this.weight = weight;
		this.name = name;
	}
	
	Boat(double weight, String name, Capitain capitain) {
		this(weight,name);
		this.capitian = capitain;
	}

	public Capitain getCapitian() {
		return capitian;
	}

	public void setCapitian(Capitain capitian) {
		this.capitian = capitian;
	}
	
	public abstract void accelerate(double amount);
	

	

}
