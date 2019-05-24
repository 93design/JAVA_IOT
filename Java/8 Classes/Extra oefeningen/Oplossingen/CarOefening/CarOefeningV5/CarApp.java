package CarOefeningV5;

import java.util.Random;

public class CarApp {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		//Deel 2
		//Car car1 = new Car();
		//Car car2 = new Car();
		Car car3 = new Car();
		
		
		
		//System.out.println(car3);
		//Car car4 = new Car("purple");
		//System.out.println(car4);
		//car3.printCar();
		
		Car car4 = new Car(RandomUtil.randomColor());
		Car car5 = new Car(RandomUtil.randomColor());
		
		System.out.println(car4);
		System.out.println(car5);
		
	}
}
