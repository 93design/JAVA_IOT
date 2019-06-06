package carEngineColor;

public class CarApp {

	public static void main(String[] args) {
		
		
			Passenger jamie = new Passenger("jamie");
			Passenger alex = new Passenger("Alexander");
			
			Car peugot = new Car(jamie, new Color("Red", new int[]{255,0,0}),40,0);
			Car volkswagen = new Car(alex, new Color("Blue", new int[]{0,0,255}),40,0);
			
			peugot.accelerate(20);
			
			
			System.out.println(peugot);
	}

}
