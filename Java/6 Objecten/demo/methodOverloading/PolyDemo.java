package methodOverloading;

public class PolyDemo {

    public static void main (String[] args) {

        OverloadSample obj = new OverloadSample();

        //Java gaat zelf op zoek naar de juiste methode!!
        obj.print(10);
        obj.print("Jamie");
        obj.print("Jamie", 42);


    }

}
