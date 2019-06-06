package carEngineColor;

public class Engine {

	private int fuel;
	
	public Engine(int fuel) {
		super();
		this.fuel = fuel;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public void reFuel(int amount) {
		this.fuel += amount;
		
	}
	
	
}
