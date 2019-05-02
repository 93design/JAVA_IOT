package be.intecbrussel.basis.exercise05_14;

import java.util.Scanner;

public class BmiKlassApp {
	public static void main (String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("wat is uw lengte in m"); 
		double lengte = in.nextDouble();
		
		System.out.println("Wat uw gewicht in kg");
		double gewicht = in.nextDouble();
		
		double bmi = gewicht / (lengte*lengte);
		
		System.out.printf("uw bmi is: %.2f", bmi);
		
		if (bmi < 20) {
			System.out.println("u heeft ondergewicht");
		} else if (bmi>= 20 && bmi <25) {
			System.out.println("u gewicht is ok");
		}else if (bmi> 25 && bmi <=30) {
			System.out.println("u heeft overgewicht");
		}else if (bmi> 30 && bmi <=40) {
			System.out.println("u heeft obisitas");
		} else if (bmi >40) {
			System.out.println("u gewicht is ziekelijk");
		}
		
		
		
		if (bmi > 40) {
			System.out.println("u heeft ondergewicht");
		} else if (bmi > 30) {
			System.out.println("u heeft obisitas");
		} else if (bmi <25)  {
			
		}
		
		
		
	}

}
