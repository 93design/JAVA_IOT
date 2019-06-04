package CarUml.Eddy;

public class Car {
	//basic car class has 3 properties
	private String color;
	private int rpm;
	private  String direction;
	//default constructor calls super constructo
	public Car() {
		super();
	}	
	//getter and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//implementatie van een standaard acceleratie
	public void accelerate() {
		System.out.println("acceleration engine with oil");
		rpm +=10;
	}

	public void slowDown() {
		rpm -=10;
	}

	public void turnLeft() {
		direction = "left";
	}

	public void turnRight() {
		direction = "right";
	}

	

	@Override
	public String toString() {
		return "Car [color=" + color + ", rpm=" + rpm + ", direction=" + direction + "]";
	}

	public void printCar() {

		System.out.println("The car is  " + toString() + " with color " + getColor());

	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

}
