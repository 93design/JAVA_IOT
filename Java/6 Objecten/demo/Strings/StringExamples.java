package demo;

public class StringExamples {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        //Nope nope nope
        System.out.println("Has the same reference: " + (s1 == s2));
        System.out.println("Has the same reference: " + (s2 == s3));

        //this is da wae
        System.out.println("Have the same value " + s1.equals(s2));
        System.out.println("Has the same value but different reference " +  s2.equals(s3));

        //Now workout on the book chapter 6 exercise 3

    }

}
