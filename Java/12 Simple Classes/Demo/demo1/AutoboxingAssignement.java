package demo1;

/*
a1 en a2 past in een 8bit geheugen plaats
Hierdoor zal de vm dezelfde geheugenplaats gebruiken hiervoor.

500 valt hierbuiten vandaar de "rare" gedraging hieronder
 */

public class AutoboxingAssignement {

    public static void main(String[] args) {

        Integer a1 = 5;
        Integer a2 = 5;

        Integer b1 = 500;
        Integer b2 = 500;

        System.out.println(a1 == a2);
        System.out.println(a1 != a2);

        System.out.println(b1 == b2);
        System.out.println(b1 != b2);

    }

}
