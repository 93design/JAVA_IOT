package Wafels;

import java.util.Scanner;

public class WaffelMainAppDeel3Methods {
	public static void main(String args[]) {

		final double COST_PRICE = 0.35;
		final double SALE_PRICE = 0.50;
		double donationFee = 0.05;
		double sales;
		double donation;
		double revenue;

		System.out.println("Aantal verkochte wafels");
		int waffleAmount = getIntInput("Aantal verkochte Wafels");

// if implementeren
		if (waffleAmount > 1000) {
			sales = salesCalc(1000, SALE_PRICE);
			// eerste 1000
			donation = donationCalc(1000, donationFee);
			revenue = revenueCalc(waffleAmount, SALE_PRICE, COST_PRICE, donationFee);

			donationFee = 0.06;
			// plus volgende
			donation += donationCalc(waffleAmount, donationFee);
			revenue += revenueCalc(waffleAmount - 1000, SALE_PRICE, COST_PRICE, donationFee);
		} else {
			sales = salesCalc(waffleAmount, SALE_PRICE);
			donation = donationCalc(waffleAmount, donationFee);
			revenue = revenueCalc(waffleAmount, SALE_PRICE, COST_PRICE, donationFee);
		}
		System.out.println("sales: " + sales);
		System.out.println("donation: " + donation);
		System.out.println("revenue: " + revenue);
	}

	public static double salesCalc(int amount, double sPrice) {
		double sales = amount * sPrice;
		return sales;
	}

	public static double donationCalc(int amount, double dFee) {
		double donationF = amount * dFee;
		return donationF;
	}

	public static double revenueCalc(int amount, double sPrice, double cPrice, double dFee) {
		double rev = amount * (sPrice - cPrice - dFee);
		return rev;
	}

	public static int getIntInput(String message) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println(message);
		return keyboard.nextInt();
	}
}

