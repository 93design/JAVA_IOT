package frietkot;

public class Fryshack {

	private String name;

	public Fryshack(String string) {
		this.name = string;
	}

	public String getName() {
		return name;
	}
	
	public void makeOrders() {
		makeOrderOne();
		makeOrderTwo();
		makeOrderTree();
	}

	private void makeOrderOne() {
		
	}

	private void makeOrderTwo() {
		Order order2 = new Order(new Orderable [] {new Fries(FriesSize.BIG), new Sauce("Maynoaise"), new Beer()});
		System.out.println(order2.CalculateTotalPrice());	
	}

	private void makeOrderTree() {
		Order order1 = new Order();
		order1.addItemToOrder(new Fries(FriesSize.BIG));
		order1.addItemToOrder(new Fries(FriesSize.SMALL));
		order1.addItemToOrder(new Sauce("Maynoaise"));
		order1.addItemToOrder(new Sauce("Ketchup"));
		order1.addItemToOrder(new Water());
		order1.addItemToOrder(new Soda());
		System.out.println(order1.CalculateTotalPrice());	
		
	};
	
	
}
