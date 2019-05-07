package KoekKoek.KlasJan;

import java.util.Scanner;

public class Hannes{

    public static void main(String[] args) {

        //variables
        int beginuur = 0;
        int beginminuten = 0;
        int einduur = 0;
        int eindminuten = 0;
        int uren_tot = 0;
        int totaaluren = 0;
        int totaalminuten = 0;
        Scanner keyboard = new Scanner(System.in);
        boolean boolbeginuur = false;
        boolean boolbeginminuten = false;
        boolean booleinduur = false;
        boolean booleindminuten = false;
        double loon = 0;

        //input

        while (!boolbeginuur) {
            System.out.println("geef het uur in waarop u startte te werken, gebruik hiervoor 24h notatie");
            beginuur = keyboard.nextInt();
            if (beginuur < 0 || beginuur > 24) {
                boolbeginuur = false;
                System.out.println("Gelieve een cijfer te kiezen tussen 0 en 24");

            } else boolbeginuur = true;
        }

        while (!boolbeginminuten) {
            System.out.println("geef de minuten in waarop u startte te werken");
            beginminuten = keyboard.nextInt();
            if (beginuur < 0 || beginuur > 60) {
                boolbeginminuten = false;
                System.out.println("Gelieve een cijfer te kiezen tussen 0 en 60");

            } else boolbeginminuten = true;
        }

        while (!booleinduur) {
            System.out.println("geef de uren in waarop u stopte te werken");
            einduur = keyboard.nextInt();
            if (beginuur < 0 || beginuur > 24) {
                booleinduur = false;
                System.out.println("Gelieve een cijfer te kiezen tussen 0 en 24");

            } else booleinduur = true;
        }


        while (!booleindminuten) {
            System.out.println("geef de minuten in waarop u stopte te werken");
            eindminuten = keyboard.nextInt();
            if (beginuur < 0 || beginuur > 60) {
                booleindminuten = false;
                System.out.println("Gelieve een cijfer te kiezen tussen 0 en 60");

            } else booleindminuten = true;
        }

        //berekeningen uren en minuten
        if (einduur < beginuur) {
            totaaluren = (24 - beginuur) + einduur;

        } else {

            totaaluren = einduur - beginuur;
        }


        totaalminuten = eindminuten - beginminuten;

        //rechtzetten fout in berekening
        if (totaalminuten  < 0 ) {

            totaaluren--;
            totaalminuten = 60 + totaalminuten;

        }


        //loon berekenen
        double loonuren = totaaluren * 11.5;
        double loonminuten = (60 / totaalminuten) * 11.5;
        loon = loonuren + loonminuten;


        System.out.println("U hebt " + totaaluren + " uur en " + totaalminuten + " minuten gewerkt, uw loon is " + loon + " euro");







    }



}
