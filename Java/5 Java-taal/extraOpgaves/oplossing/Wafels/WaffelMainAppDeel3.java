package Wafels;

import java.util.Scanner;

public class WaffelMainAppDeel3 {

	// step 7 deel 2 afwerken

	public static void main(String[] args) {

		final double COST_PRICE = 0.35;
		final double SALE_PRICE = 0.50;
		double donationFee = 0.05;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Aantal verkochte wafels");
		int waffleAmount = keyboard.nextInt();
		double sales;
		double donation;
		double revenue;

		// if implementeren
		if (waffleAmount > 1000) {
			sales = waffleAmount * SALE_PRICE;

			// eerste 1000
			donation = 1000 * donationFee;
			revenue = 1000 * (SALE_PRICE - COST_PRICE - donationFee);

			donationFee = 0.06;
			// plus volgende
			double extraDonation = (waffleAmount - 1000) * donationFee;
			double extraRevenue = (waffleAmount - 1000) * (SALE_PRICE - COST_PRICE - donationFee);

			donation = donation + extraDonation;
			revenue = revenue + extraRevenue;

			// donation += extraDonation
			// revenue += extraRevenue
		} else {
			sales = waffleAmount * SALE_PRICE;
			donation = waffleAmount * donationFee;
			revenue = waffleAmount * (SALE_PRICE - COST_PRICE - donationFee);
		}

		System.out.println("sales: " + sales);
		System.out.println("donation: " + donation);
		System.out.println("revenue: " + revenue);
	}

	// normaal bij 2000
	// sales: 1000.0
	// donation: 120.0
	// revenue: 180.00000000000006

}
