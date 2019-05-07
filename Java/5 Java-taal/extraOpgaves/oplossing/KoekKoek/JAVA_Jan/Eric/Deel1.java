package KoekKoek.KlasJan.Eric;

import java.util.Scanner;

public class Deel1 {


    public static void main(String args[]) {

        int hourIn;
        int minIn;
        int hourOut;
        int minOut;
        int minTotIn;
        int minTotOut;
        int hourTotal;
        int MinTotal;

        Scanner input = new Scanner(System.in);

        System.out.println("Type the time when you arrived at work. First the hour then the minutes.");
        hourIn = input.nextInt();
        minIn = input.nextInt();

        // Total of the minutes when arriving at work
        minTotIn = hourIn * 60 + minIn;

        System.out.println("Type the time when you left your work. First the hour then the minutes.");
        hourOut = input.nextInt();
        minOut = input.nextInt();

        // Total of the minutes when leaving work
        minTotOut = hourOut * 60 + minOut;

        // Hours worked at job
        hourTotal = (minTotOut - minTotIn)/60;
        MinTotal = (minTotOut - minTotIn) % 60;

        String nameHour;
        if(hourTotal > 2){
            nameHour = " hours ";
        }
        else{
            nameHour = " hour ";
        }


        System.out.println("You 've worked : " + hourTotal + nameHour + " and " + MinTotal + " minutes");

    }
}
