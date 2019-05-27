package CarOefeningV1;

public class Car {

	private String kleur = "white";
	private int horsePower = 100;
	private int speed = 0;
	private boolean lights = false;

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

}
