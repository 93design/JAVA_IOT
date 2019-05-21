package carEnginePassengerUML;

public class Passenger {
	
	private String name;

	public Passenger(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + "]";
	}
	
	

}
