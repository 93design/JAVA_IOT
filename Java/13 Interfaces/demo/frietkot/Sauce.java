package frietkot;

public class Sauce implements Orderable {

	
	private final double price = 0.8;
	private String name; 
	
	public Sauce(String name) {
		this.name = name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

}
