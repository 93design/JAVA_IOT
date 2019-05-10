package methodOverloading;

public class OverloadSample {

    public void print (String s) {
        System.out.println("First method with only String " + s);
    }

    public void print (int i) {
        System.out.println("Second method with only int " + i);
    }

    public void print (String s, int i) {
        System.out.println("Third method with both " + s + "--" + i);
    }

}
