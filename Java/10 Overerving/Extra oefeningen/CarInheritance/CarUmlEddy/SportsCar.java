package CarUmlEddy;
public class SportsCar extends Car{

    private String spoiler;

    @Override
    public String toString() {
        return "SportsCar{" +
                "spoiler='" + spoiler + '\'' +
                '}';
    }

    public String getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(String spoiler) {
        this.spoiler = spoiler;
    }

    public SportsCar(String spoiler) {
        this.spoiler = spoiler;
    }

   
    public void setRaceMode(){}
}
