package HeatException;

import java.util.Scanner;

public class HeatExceptionApp {

	public static void main(String[] args) {

	
			try {
				learnAtCertainTemperature(3); 
			} catch (ExtremeHeatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExtremeColdException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Scanner keyboard = new Scanner(System.in);
			int testje = keyboard.nextInt();
			
	
	}

	public static void learnAtCertainTemperature(int temperature) throws ExtremeHeatException,ExtremeColdException  {
		if (temperature > 5 && temperature < 28) {
			System.out.println("test1");
		} else if (temperature <0 ) {
			System.out.println("test2");
			throw new ExtremeColdException();		
		} else {
				throw new ExtremeHeatException();
		}
		
		
		
		
		
	}

}
