package carEngineColor;

public class Car {
	
	private Engine engine = new Engine(0);
	private Passenger driver;
	private Color color;
	private int speed;
	
	public Car(Passenger driver, Color color, int fuel, int speed) {
		super();
		this.engine.setFuel(fuel);
		this.driver = driver;
		this.color = color;
		this.speed = speed;
	}

	public Engine getEngine() {
		return engine;
	}

	public Passenger getDriver() {
		return driver;
	}

	public void setDriver(Passenger driver) {
		this.driver = driver;
	}

	public Color getColor() {
		return color;
	}

	public void accelerate(int amount) {
		if(engine.getFuel() > 0 && driver !=null) {
			do {
				speed += amount--;
				engine.setFuel(engine.getFuel()-1);
			} while(engine.getFuel()> 0);
		}
	}
	
	public void tune() {
		System.out.println("Doe dit als je ook Hp hebt toegevoegd aan je engine");	
	}
	
	public void reFuel(int amount) {
		engine.reFuel(amount);
	}
	
	public void repaint(Color color) {
		this.color = color;
		int price = color.getPrice();
		System.out.println("Price for repainting is " +price);
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", driver=" + driver + ", color=" + color + ", speed=" + speed + "]";
	}

	
	
	
	
	
}
