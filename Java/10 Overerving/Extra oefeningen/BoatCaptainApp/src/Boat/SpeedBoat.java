package Boat;

public class SpeedBoat extends Boat {
	
	private double topSpeed = 70;

	public SpeedBoat(double weight, String name) {
		super(weight, name);
	}

	@Override
	public void accelerate(double amount) {
		this.speed+=amount;

	}

	@Override
	public String toString() {
		return "SpeedBoat [topSpeed=" + topSpeed + ", speed=" + speed + ", getCapitian()=" + getCapitian() + "]";
	}

	
}
