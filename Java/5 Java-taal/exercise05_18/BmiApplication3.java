package be.intecbrussel.basis.exercise05_18;

import java.util.Scanner;

public class BmiApplication3 {
	public static void main(String[] args) {
		System.out.println("Enter your length (cm):");
		int height = readInt();
		System.out.println("Enter your weight (kg):");
		int weight = readInt();
		float bmi = calculateBmi(weight, height);
		printDiagnose(bmi);
	} 	
	
	public static int readInt() {
		Scanner input = new Scanner(System.in);
		int tempInt = input.nextInt();
		return tempInt;
	}	
	
	public static float calculateBmi(int weight, int height) {		
		float tempBMI = weight/((height/100F) *(height/100F));
		return tempBMI;
	}
	
	public static void printDiagnose(float bmi) {
		System.out.println("Your BMI is: " + bmi);
		if (bmi < 20) {
			System.out.println("Underweight");
		} else if (bmi < 25) {
			System.out.println("OK");
		} else if (bmi < 30) {
			System.out.println("Overweight");
		} else if (bmi < 40) {
			System.out.println("Obesitas");
		} else {
			System.out.println("Pathological overweight");
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
