package demo1;

public class App {

    public static void main(String[] args) {

        Pet dog = new Pet("Davinci");
        Owner alex = new Owner("Alex",dog);

        System.out.println(alex);

    }

}
