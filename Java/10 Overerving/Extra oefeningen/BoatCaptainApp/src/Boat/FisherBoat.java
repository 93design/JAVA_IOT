package Boat;

import Person.Deckhand;

public class FisherBoat extends Boat {

	private Deckhand deckHand = new Deckhand(0, "");
	
	
	public FisherBoat(double weight, String name) {
		super(weight, name);
	}

	@Override
	public void accelerate(double amount) {
		// TODO Auto-generated method stub

	}
	
	public void setDeckNickName(String name) {
		this.deckHand.setNickName(name);
	}
	
	public void setDeckNickAge(int age) {
		this.deckHand.age = age;
	}

	@Override
	public String toString() {
		return "FisherBoat [deckHand=" + deckHand + ", speed=" + speed + ", getCapitian()=" + getCapitian() + "]";
	}
	
	
	

}
