package Randarray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		Random randy = new Random();

		int[][] cardPair = new int[4][2];

		for (int i = 0; i < cardPair.length; i++) {
			for (int j = 0; j < cardPair[i].length; j++) {
				cardPair[i][j] = randy.nextInt(23)+1;
			}
		}
		int winner = 0;
		int highest = 0;
		int previous = 0;
		for (int i = 0; i < cardPair.length; i++) {
			int total = 0;
			for (int j = 0; j < cardPair[i].length; j++) {
				total += cardPair[i][j];
			}
			
			if (total > highest && total <=23) {
				highest = total;
				winner = i;
			}
		}
		
		System.out.println(Arrays.deepToString(cardPair)); 
		System.out.println(winner);
	}

	
}
