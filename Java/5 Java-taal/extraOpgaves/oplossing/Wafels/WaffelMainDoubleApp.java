package Wafels;

import java.util.Scanner;

public class WaffelMainDoubleApp {

	public static void main(String[] args) {
		//step1 
		final double COST_PRICE = 0.35;
		final double SALE_PRICE = 0.50;
		double donationFee = 0.05;
		
		//step2	
		Scanner keyboard = new Scanner(System.in);
		
		
		//step3
		System.out.println("Aantal verkochte wafels");
		int waffleAmount = keyboard.nextInt();
		
		//step4
		double sales = waffleAmount * SALE_PRICE;
		double donation = waffleAmount * donationFee;
		double revenue = waffleAmount * (SALE_PRICE - COST_PRICE - donationFee);
		
		System.out.println("sales: " + sales);
		System.out.println("donation: " + donation);
		System.out.println("revenue: " + revenue);
		
		
	}

}
