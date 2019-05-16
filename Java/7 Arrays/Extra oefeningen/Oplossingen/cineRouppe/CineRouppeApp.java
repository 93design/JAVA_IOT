package cineRouppe;

import java.util.Scanner;

public class CineRouppeApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int[] ticketPrices = { 6, 12, 10, 8 };
		double[] drinkPrices = { 2, 2.5, 3 };
		double[] popcornPrices = { 3, 4, 5 };
		double totalPrice;
		
		System.out.println("What movie do you wanna watch?");
		System.out.println("1- \"Labyrith\" = 6 euro\r\n" + "2- \"LOTR\" = 12 euro\r\n"
				+ "3- \"Hot tub time machine\" = 10 euro\r\n" + "4 - \"thief of bagdad\" =  8euro \r\n" + "");
		System.out.print("Choice: ");
		int movieChoice = keyboard.nextInt() - 1;
		int ticketPrice = ticketPrices[movieChoice];
		

		System.out.print("age: ");
		int age = keyboard.nextInt() - 1;
		
		if (age < 16) {
			ticketPrice /=2;
		} else if (age < 65) {
			ticketPrice *=0.8;
		}
		
		System.out.print("DrinkSize: ");
		String drinkChoice = keyboard.next();
		
		int drinkIntChoice = StringToIntSwitch(drinkChoice);
		double drinkPrice = drinkPrices[drinkIntChoice];
		System.out.print("PopcornSize: ");
		String popCornChoice = keyboard.next();
		
		int popcornIntChoice = StringToIntSwitch(drinkChoice);
		
		double popcornPrice = popcornPrices[popcornIntChoice];
		
		
		printTicket(ticketPrice, drinkPrice,popcornPrice);
	}

	private static void printTicket(int ticketPrice, double drinkPrice, double popcornPrice) {
		double total = ticketPrice + drinkPrice + popcornPrice;
		
		System.out.println("------------------------");
		System.out.println("   ticketPrice: " + ticketPrice);
		System.out.println("------------------------");
		System.out.println("   drinkPrice: " + drinkPrice);
		System.out.println("   popcornPrice: " + popcornPrice);	
		System.out.println("------------------------");
		System.out.println("   totalPrice: " + total);	
		
	}

	private static int StringToIntSwitch(String drinkChoice) {
		drinkChoice = drinkChoice.toLowerCase();
		int lookUp = -1;
		switch(drinkChoice) {
		case "s": lookUp = 0;
		case "m": lookUp = 1;
		case "l": lookUp = 2;
		}
		return lookUp;
	}
}
