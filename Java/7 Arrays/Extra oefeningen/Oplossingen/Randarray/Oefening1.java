package Randarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Oefening1 {

	public static void main(String[] args) {
		Random randy = new Random();

		int[] toGuess = new int[100];
		for (int i = 0; i < toGuess.length; i++) {
			toGuess[i] = randy.nextInt(23) + 1;
		}

		int sum = sum(toGuess);
		double avg = avg(toGuess);
		int product = product(toGuess);

		System.out.println("sum =" + sum);
		System.out.println("product =" + product);
		System.out.println("avg =" + avg);
		System.out.println(Arrays.toString(toGuess));
		System.out.println("--------------------");

	}

	private static int product(int[] toGuess) {
		int product = 1;
		for (int i = 0; i < toGuess.length; i++) {
			product *= toGuess[i];
		}
		return product;
	}

	private static double avg(int[] toGuess) {
		double sum = sum(toGuess);
		double avg = sum / toGuess.length;
		return avg;
	}

	private static int sum(int[] toGuess) {
		int sum = 0;
		for (int i = 0; i < toGuess.length; i++) {
			sum += toGuess[i];
		}
		return sum;
	}

}
