package CarOefeningV4;

import java.util.Random;

public class CarApp {
	public static void main(String[] args) {
		Random randy = new Random();
		//Deel 2
		//Car car1 = new Car();
		//Car car2 = new Car();
		Car car3 = new Car(randy.nextInt(20));
		
		System.out.println(car3);
		//Car car4 = new Car("purple");
		//System.out.println(car4);
		
		car3.printCar();
		
	}
}
