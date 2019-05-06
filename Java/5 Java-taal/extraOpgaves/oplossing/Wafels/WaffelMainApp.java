package Wafels;

import java.util.Scanner;

public class WaffelMainApp {

	public static void main(String[] args) {
		//step1 
		final int COST_PRICE = 35;
		final int SALE_PRICE = 50;
		int donationFee = 5;
		
		//step2	
		Scanner keyboard = new Scanner(System.in);
		
		
		//step3
		System.out.println("Aantal verkochte wafels");
		int waffleAmount = keyboard.nextInt();
		
		//step4
		int sales = waffleAmount * SALE_PRICE;
		int donation = waffleAmount * donationFee;
		int revenue = waffleAmount * (SALE_PRICE - COST_PRICE - donationFee);
		
		System.out.println("sales: " + sales/100);
		System.out.println("donation: " + donation/100);
		System.out.println("revenue: " + revenue/100);
		
		
	}

}
