package KoekKoek;

import java.util.Scanner;

public class TijdsMetingStringSwitch {

    public static void main(String[] args) {

        int uurStart, minuutStart,uurstop,minuutstop;
        int uurberekening=0;
        int minuutberekening=0;
        String werkdag;
        boolean test =false ;
        double bereking;

        Scanner input = new Scanner(System.in);

        //aanvraag star uur en minuut
        System.out.print("Star uur : ");
        uurStart = input.nextInt();
        System.out.print("Start min :");
        minuutStart = input.nextInt();

        System.out.println("Star tijd = "+uurStart+":"+minuutStart);
        System.out.println();

        //aanvraag stop uur en minuut
        System.out.print("Stop uur : ");
        uurstop= input.nextInt();
        System.out.print("Stop min : ");
        minuutstop= input.nextInt();

        System.out.println("Stop tijd = "+uurstop+":"+minuutstop);
        System.out.println();

        if(uurStart > uurstop){ //als start uur grote is dan stop uur wilt het zeggen dat 24u overschreden is
            uurberekening=(24-uurStart)+uurstop;
        }else{ // anders zitten we binnen de zelfde dag
            uurberekening = uurstop-uurStart;
        }

        if (minuutStart>minuutstop){//bereken hoeveel minuten gewerkt zijn geweest
            minuutberekening = (60-minuutStart)+minuutstop;
        }else{
            minuutberekening=(minuutstop-minuutStart);
        }

        //aantonen hoeveel uur en minuten gewerkt zijn
        System.out.println("zijn personeel heeft "+uurberekening+":"+minuutberekening+" gewerkt");


        // controleren welke dag dat hij gewerkt heeft
        while (!test) {
            System.out.print("Werkdag :");
            werkdag = input.next();

            //berekening van normaal koste/uur en minuut
            bereking = ((double) uurberekening * 11.5) + ((11.5 / 60) * (double) minuutberekening);


            switch (werkdag) {

                case "maandag":
                case "dinsdag":
                case "woensdag":
                case "donderdag":
                    System.out.println(bereking);
                    test=true;
                    break;
                case "vrijdag":
                    if (uurStart>uurstop){
                        //eerst berekenen hoveel uur de vrijdag gewerk is en daarna de rest op zaterdag
                      bereking=((24-(double) uurStart)*11.5)+ (((double)uurstop*11.5)*1.25)+(((11.5/60)*(double)minuutberekening)*1.25);
                    }
                    System.out.println(bereking);
                    test = true;
                    break;
                case "zaterdag":
                    if (uurStart>uurstop){
                        //eerst berekenen hoveel uur de vrijdag gewerk is en daarna de rest op zaterdag
                        bereking=(((24-(double) uurStart)*11.5)*1.25)+ (((double)uurstop*11.5)*1.50)+(((11.5/60)*(double)minuutberekening)*1.50);
                    }else {
                        bereking=bereking*1.25;
                    }
                    System.out.println(bereking);
                    test = true;
                    break;
                case "zondag":
                    System.out.println(bereking*1.50);
                    test=true;
                    break;
                default:
                    System.out.println("gelieve een juiste dag te kiezen !");
            }
        }

    }
}
