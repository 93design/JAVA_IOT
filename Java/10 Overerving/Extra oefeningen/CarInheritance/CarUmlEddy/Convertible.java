package CarUmlEddy;
public class Convertible extends Car{

    private String sunroof;

    public Convertible(String sunroof) {
        this.sunroof = sunroof;
    }

    @Override
    public String toString() {
        return "Convertible{" +
                "sunroof='" + sunroof + '\'' +
                '}';
    }

    public String getSunroof() {
        return sunroof;
    }

    public void setSunroof(String sunroof) {
        this.sunroof = sunroof;
    }
    public void switchToNoRoof(){}
}
