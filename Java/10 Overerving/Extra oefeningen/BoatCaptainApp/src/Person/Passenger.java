package Person;

public class Passenger extends Person {

	public String destination = "";
	
	public Passenger(String name, String destination) {
		this(name, 0,destination);
	}

	public Passenger(String name, int age, String destination) {
		super(name,age);
		this.destination = destination;
	}

}
