package CarOefeningV3;

public class Car {

	private String kleur;
	private int horsePower;
	private int speed;
	private boolean lights;
	public static final int WHEEL;
	
	static {
		WHEEL = 4;
	}
	
	{
		kleur= "black";
		speed=20;
		
	}
	
	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {
		this.kleur = kleur;
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

	@Override
	public String toString() {
		return "Car [kleur=" + kleur + ", horsePower=" + horsePower + ", speed=" + speed + ", lights=" + lights + "]";
	}
	
	

}
