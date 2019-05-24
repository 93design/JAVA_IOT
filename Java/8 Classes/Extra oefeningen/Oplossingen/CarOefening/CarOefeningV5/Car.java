package CarOefeningV5;

public class Car {

	private String color;
	private int horsePower;
	private int speed;
	private boolean lights;
	public static final int WHEEL;
	private static int counter;
	
	static {
		WHEEL = 4;
		counter = 0;
	}
	
	{
		color= "white";
		speed=0;
		counter++;
		horsePower = 100;
	}
	public Car() {
		this("",0,0,false);
	}
	
	public Car(String color) {
		this(color,0,0,false);
	}
	public Car(String color,int speed) {
		this(color,speed,0,false);
	}
	public Car(String color,int speed, int hp) {
		this(color,speed,hp,false);
	}
	
	public Car(String color, int horsePower, int speed, boolean lights) {
		super();
		this.color = color;
		this.horsePower = horsePower;
		this.speed = speed;
		this.lights = lights;
	}



	

	public String getColor() {
		return color;
	}

	public void setColor(String kleur) {
		this.color = kleur;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isLights() {
		return lights;
	}

	public void setLights(boolean lights) {
		this.lights = lights;
	}

	public void accelerate(int amount) {
		System.out.println("this is the int");
		this.speed += amount;
		if (this.speed < 0) {
			speed = 0;
		}
	}

	public void accelerate(int amount, int nitro) {
		this.speed += (amount * nitro);
	}

	public void tune(int amount) {
		this.horsePower += 30;
	}
	
	public void printCar() {
		System.out.println("de auto is Kleur " + color + " en rijdt aan" + speed + " kilometer per uur");
	}
	
	@Override
	public String toString() {
		return "Car [kleur=" + color + ", horsePower=" + horsePower + ", speed=" + speed + ", lights=" + lights + "]";
	}
	
	

}
