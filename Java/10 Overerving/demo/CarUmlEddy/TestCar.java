package CarUmlEddy;
public class TestCar {

    public static void main(String[] args) {

        Car car1 = new SportsCar("yes");
        car1.setColor("BLACK");

        Car car2 = new Convertible("YES");
        car2.setColor("WHITE");

        Car car3 = new ElectricalCar("LITHIUM");
        car3.setColor("ORANGE");

        SUV car4 = new SUV();
        car4.setColor("BLUE");
        car4.spinRims();


        car1.printCar();
        car1.accelerate();
       
        ElectricalCar car5;
        car5 = new ElectricalCar("LITHIUM");
        car5.setColor("BLUE");
        car5.chargeBattery(60);       
        car5.printCar();
        
        car5.accelerate();

         
         
        //System.out.println(car5.getColor());
        //System.out.println("color "+ car2.getColor());
        //System.out.println("color "+ car3.getColor());
        //System.out.println("color "+ car4.getColor());












    }


}
