package Randarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Oefening3 {

	public static void main(String[] args) {
		Random randy = new Random(); 
		
		int toGuess = randy.nextInt(23)+1;
		
		Scanner keyboard = new Scanner(System.in); 
		boolean guessed = false;
		int[] guesses = new int[0];
		while(!guessed) {
			System.out.println("geef je gokje");
			int guess = keyboard.nextInt();
			
			if (guess == toGuess) {
				guessed = true;
				guesses = addGuess(guesses, guess);
			} else if(guess < toGuess) {
				System.out.println("Hoger");
				guesses = addGuess(guesses, guess);
				
			} else if (guess > toGuess) {
				System.out.println("Lager");
				guesses = addGuess(guesses, guess);
			}
		}
		
		System.out.println("aantal gokken = " + guesses.length);
		for (int gok: guesses) {
			System.out.print(gok + " ");
		}
		
		Arrays.toString(guesses);
	}

	private static int[] addGuess(int[] guesses, int guess) {
		int[] newArray = new int[guesses.length+1];
		
		for(int i = 0; i <guesses.length; i++) {
			newArray[i] = guesses[i];
		}
		
		newArray[guesses.length] = guess;
		
		return newArray;
	}

}
