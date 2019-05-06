package Wafels;

import java.util.Scanner;

public class WaffelMainAppDeel2 {

	//step 7 deel 2 afwerken
	
	public static void main(String[] args) {
	 
		final double COST_PRICE = 0.35;
		final double SALE_PRICE = 0.50;
		double donationFee = 0.05;
		
	
		Scanner keyboard = new Scanner(System.in);
		

		System.out.println("Aantal verkochte wafels");
		int waffleAmount = keyboard.nextInt();
		
		//if implementeren 
		if (waffleAmount > 1000) {
			donationFee = 0.06;
		}
		
		double sales = waffleAmount * SALE_PRICE;
		double donation = waffleAmount * donationFee;
		double revenue = waffleAmount * (SALE_PRICE - COST_PRICE - donationFee);
		
		System.out.println("sales: " + sales);
		System.out.println("donation: " + donation);
		System.out.println("revenue: " + revenue);
		
		
		
	}

}
