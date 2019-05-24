package Randarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Oefening2 {

	public static void main(String[] args) {
		Random randy = new Random();
		
		
		int[] toGuess = new int[6];
		for(int i = 0; i < toGuess.length; i++) {
			toGuess[i] = randy.nextInt(23) + 1;
		}
		Scanner keyboard = new Scanner(System.in);
		boolean guessed = false;
		int correct = 0;
		
		for(int i = 0; i <10; i++) {
			int guess = keyboard.nextInt();
			for(int j = 0; j < toGuess.length; j++) {
				if (guess == toGuess[j]) {
					correct++;
				}
			} 
		}
		System.out.println("je had er " + correct);
		System.out.println(Arrays.toString(toGuess));
	}
}
