package KoekKoek.KlasJan.Eric;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Deel2 {


    public static void main(String args[]) {

        int dayIn;
        int hourIn;
        int minIn;
        int dayOut = 0;
        int dayOutTry;
        int hourOut;
        int minOut;
        int minTotIn;
        int minTotOut;
        int dayTotal;
        int minTotLessThan24h;
        int minTotalAllDay;
        double minTotalAllDayDouble;
        int hourTotal;
        int minTotal;
        final int MaxMin = 60 * 24;
        final double euroHour = 11.5;
        double salary;


        Scanner input = new Scanner(System.in);

        // 1) Table with the days of the week

        System.out.println("Here under you can read the number you have\nto type when you choose a day in a week");
        System.out.println("Type 1 for Monday");
        System.out.println("Type 2 for Tuesday");
        System.out.println("Type 3 for Wednesday");
        System.out.println("Type 4 for Thursday");
        System.out.println("Type 5 for Friday");
        System.out.println("Type 6 for Saturday");
        System.out.println("Type 7 for Sunday");

        // 2) Input of the time of entry and exit to/from work

        System.out.println("Type the day when you arrived at work");
        dayIn = input.nextInt();

        boolean flag = true;

        while (flag) {
            System.out.println("Type the day when you left the work");
            dayOutTry = input.nextInt();

            if (dayOutTry - dayIn > 1) {
                System.out.println("You cannot work more than 2 days in a row!");
                System.out.println("Retype the day when you left the work");
            } else {
                dayOut = dayOutTry;
                flag = false;
            }

        }


        System.out.println("Type the time when you arrived at work. First the hour then the minutes.");
        hourIn = input.nextInt();
        minIn = input.nextInt();

        System.out.println("Type the time when you left your work. First the hour then the minutes.");
        hourOut = input.nextInt();
        minOut = input.nextInt();

        //3)  Calculation of the total of minutes spend at the work

        // Total of the minutes when arriving at work
        minTotIn = dayIn * 60 * 24 + hourIn * 60 + minIn;

        // Total of the minutes when leaving work
        minTotOut = dayOut * 60 * 24 + hourOut * 60 + minOut;

        // Hours worked at job

        minTotalAllDay = minTotOut - minTotIn;

        dayTotal = (minTotalAllDay) / (60 * 24);
        minTotLessThan24h = minTotalAllDay % (60 * 24);

        hourTotal = (minTotLessThan24h) / 60;
        minTotal = (minTotLessThan24h) % 60;


        // 3) Calculation of the salary
        minTotalAllDayDouble = (double) minTotalAllDay;
        salary = (minTotalAllDayDouble / 60) * euroHour;

        // 4) Some formatting work
        DecimalFormat f = new DecimalFormat("##.00");
        String nameDay;
        if (dayTotal > 2) {
            nameDay = " days ";
        } else {
            nameDay = " day ";
        }


        String nameHour;
        if (hourTotal > 2) {
            nameHour = " hours ";
        } else {
            nameHour = " hour ";
        }

        // 5) Display of the result
        if (minTotalAllDay <= MaxMin) {
            System.out.println("You 've worked : " + dayTotal + nameDay + hourTotal + nameHour + " and " + minTotal + " minutes");
            System.out.println("You've earned " + f.format(salary) + " euros");
        } else {
            System.out.println("You can not work more than 24 hours!");
        }


    }
}
