package ExtraOpgavesOplossing;

import java.util.Scanner;

public class LussenOefening9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Input getal: ");
		int getal = input.nextInt();

		while (getal != 1) {
			if (getal % 2 == 0) {
				getal /= 2;
			} else {
				getal *= 3;
				getal +=1;
			}
			System.out.println(getal);
		}

	}

}
