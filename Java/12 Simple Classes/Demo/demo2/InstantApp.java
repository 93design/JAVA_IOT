package demo2;

import java.time.Instant;

public class InstantApp {

    public static void main(String[] args) {

        System.out.println("De epoch birth: " + Instant.EPOCH);
        System.out.println("Verste dat we kunnen terug gaan : " + Instant.MIN);
        System.out.println("Verste dat we in de toekomst kunnen gaan : " + Instant.MAX);

        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());

        Instant earlier = now.minusSeconds(20);
        System.out.println(earlier);

        Instant later = now.plusSeconds(50);
        System.out.println(later);

        System.out.println(now.isAfter(earlier));
        System.out.println(now.isBefore(later));

    }

}
