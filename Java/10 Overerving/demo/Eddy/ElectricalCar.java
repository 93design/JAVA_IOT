package CarUml.Eddy;
public class ElectricalCar extends Car{
    private String battery;
    private int volt = 0;

    public ElectricalCar(String battery) {
    	super();
        this.battery = battery;
    }
    
    public void accelerate() {
		volt +=10;
		System.out.println("currant volt" + volt + "procent battery left: " + battery);
	}

	public void slowDown() {
		volt -=10;
		
	}

    @Override
    public String toString() {
        return "ElectricalCar{" +
                "battery='" + battery + '\'' +
                '}';
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
   
    public void chargeBattery(int amount){
    	battery +=amount;
    }
}
