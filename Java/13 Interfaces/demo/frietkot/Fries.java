package frietkot;

public class Fries implements Fryable,Orderable{

	private FriesSize size;
	private double price;
	private static int friesCount;
	
	public Fries(FriesSize size) {
		this.size = size;
		CalculatePrice();
		friesCount++;
	}
	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void Fry() {
		System.out.println("A " + size.name().toLowerCase() + " is thrown in the fryer");
		
	}
	
	private void CalculatePrice() {
		this.price = size.getPrice();
	}

}
