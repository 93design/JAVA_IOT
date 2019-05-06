package ExtraOpgavesOplossing;

import java.util.Scanner;

public class LussenOefening4Euros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner input = new Scanner(System.in);
		
		double  geld = input.nextDouble();
		
		int count500 = 0;
		int count200 = 0;
		int count100 = 0 ;
		int count50 = 0;
		int count20 = 0;
		int count10 = 0;
		int count5 = 0;
		int count2 = 0;
		int count1 = 0;
		
		
		while(geld>0) {
			if(geld >=500) {
				count500= (int) geld/500;
				geld = (int) geld % 500;
				System.out.println(geld);
			} else if(geld >=200) {
				count200= (int) geld/200;
				geld = geld % 100;
			}else if(geld >=500) {
				count100= (int) geld/100;
				geld = geld % 100;
			}else if(geld >=50) {
				count50= (int) geld/50;
				geld = geld % 100;
			}else if(geld >=20) {
				count20= (int) geld/20;
				geld = geld % 20;
			}else if(geld >=10) {
				count10= (int) geld/10;
				geld = geld % 10;
			}else if(geld >=5) {
				count5= (int) geld/5;
				geld = geld % 5;
			}else if(geld >=2) {
				count2= (int) geld/2;
				geld = geld % 2;
			}else  {				
				count1=(int)geld;
				geld=0;
				
			}
			
		}
			
	
	
		System.out.println("500: " +count500);
		System.out.println("200: " +count200);
		System.out.println("100: " +count100);
		System.out.println("50: " +count50);
		System.out.println("20: " +count20);
		System.out.println("10: " +count10);
		System.out.println("5: " +count5);
		System.out.println("2: " +count2);
		System.out.println("1: " +count1);
			}
}
