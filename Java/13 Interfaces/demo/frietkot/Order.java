package frietkot;

import java.util.Arrays;

public class Order {
	
	private Orderable[] orderItems;
	private static int orderNumber;
	
	static {
		orderNumber = 0;
	}

	public Order(Orderable[] orderIn) {
		this.orderItems = orderIn;
		orderNumber++;
	}
	
	public Order() {
		this(new Orderable[0]);
	}
	
	public void addItemToOrder(Orderable addItem) {
		orderItems = Arrays.copyOf(orderItems, orderItems.length+1);
		orderItems[orderItems.length-1] = addItem;
	}
	
	public double CalculateTotalPrice() {
		double sum = 0;
		for(Orderable orderItem: orderItems) {
			sum += orderItem.getPrice(); 
		}		
		return sum;
	}

	public static int getOrderNumber() {
		return orderNumber;
	}
	
	
	
}

