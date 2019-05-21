package org.rastalion.chapter8_klassen_definiëren.shape;

/**
 * Created by Mrrobot on 10/04/2018 javabasics-workspace.
 */
public class App {

    public static void main (String[] args) {

        Rectangle r1 = new Rectangle(14, 22, 64, 93);
        Rectangle r2 = new Rectangle(12, 22);
        Rectangle r3 = new Rectangle(84, 63);
        Rectangle r4 = new Rectangle(15, 7, 8);
        Rectangle r5 = new Rectangle(22);

        Rectangle copy = new Rectangle(r5);

        System.out.println(copy.getWidth());

    }

}
