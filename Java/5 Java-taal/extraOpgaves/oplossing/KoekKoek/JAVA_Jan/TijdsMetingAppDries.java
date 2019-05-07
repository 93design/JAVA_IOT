package KoekKoek.KlasJan;
import java.util.Scanner;

public class TijdsMetingAppDries {
    public static void main(String[] args) {
        //Ingave begindag-uur-minuut
        Scanner beginDag = new Scanner(System.in);
        System.out.println("Geef je begin-dag in (1-31)");
        int beginD = beginDag.nextInt();
        Scanner beginUur = new Scanner(System.in);
        System.out.println("Geef je begin-uur in");
        int beginU = beginUur.nextInt();
        Scanner beginMin = new Scanner(System.in);
        System.out.println("Geef je begin-minuten in");
        int beginM = beginMin.nextInt();

        //Ingave stopdag-uur-minuut
        Scanner stopDag = new Scanner(System.in);
        System.out.println("Geef je eind-dag in (1-31)");
        int stopD = stopDag.nextInt();
        Scanner stopUur = new Scanner(System.in);
        System.out.println("Geef je eind-uur in");
        int stopU = stopUur.nextInt();
        Scanner stopMin = new Scanner(System.in);
        System.out.println("Geef je eind-minuten  in");
        int stopM = stopMin.nextInt();

        //Variabelen voor resulterende uren/minuten op te slaan
        int resultU = stopU - beginU;
        int resultM = stopM - beginM;

        //Urenberekening
        if (stopM < beginM) {
            resultM = 60 + (stopM - beginM);
            resultU--;
        } else if ((stopD - beginD) > 1) {
            System.out.println("U heeft te veel uren gewerkt.");
        } else if (resultU >= 24 && resultM > 0) {
            System.out.println("U heeft te veel uren gewerkt.");
        } else if ((stopD - beginD) == 1) {
            resultU = ((24 - beginU) + stopU);
            if (resultU >= 24 && resultM > 0) {
                resultU--;
            } 
            System.out.println("De werknemer heeft op dag " + beginD + " en dag " + stopD + ", " + resultU + " uur en " + resultM + " minuten gewerkt.");
        } else {
            System.out.println("De werknemer heeft op dag " + beginD + " en dag " + stopD + ", " + resultU + " uur en " + resultM + " minuten gewerkt.");
        }


        //Loonsberekening, modulus gebruikt om dag 6 'zaterdag' en dag 7 'zondag' te definiëren, onrealistisch IRL
        double pecunia = ((11.5 * resultU) + ((11.5 / 60) * resultM));
        if (beginD % 6 != 0 && stopD % 6 != 0 && beginD % 7 != 0 && stopD % 7 != 0) {
            System.out.println("Loon: " + pecunia);
        }
        if (beginD % 6 == 0 && stopD % 6 == 0) {
            pecunia = pecunia * 1.25;
        } else if (beginD % 7 == 0 && stopD % 7 == 0) {
            pecunia = pecunia * 1.50;
        } else if (stopD % 6 == 0 && stopD != beginD) {
            pecunia = ((11.50 * stopU) + ((11.50 / 60) * stopM)) * 1.25;
            pecunia = pecunia + (11.50 * (24 - beginU - 1) + (11.50 / 60) * (60 - stopM));
        } else if (beginD % 6 == 0 && stopD % 7 == 0) {
            pecunia = (11.50 * (24 - beginU - 1) + (11.50 / 60) * (60 - beginM)) * 1.25;
            pecunia = pecunia + (((11.50 * stopU) + ((11.50 / 60) * stopM)) * 1.50);
        } else if (beginD % 7 == 0 && stopD != beginD) {
            pecunia = (11.50 * (24 - beginU - 1) + ((11.50 / 60) * (60 - beginM))) * 1.50;
            pecunia = pecunia + ((11.50 * (stopU) + (11.50 / 60) * stopM));
        }
        System.out.println("Loon: " + pecunia);
        
        //sluiten scanners
        beginDag.close();
        beginUur.close();
        beginMin.close();
        stopDag.close();
        stopUur.close();
        stopMin.close();
    }


}