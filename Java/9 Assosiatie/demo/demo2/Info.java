package demo2;

/**
 * Created by Mrrobot on 11/04/2018 javabasics-workspace.
 */
public class Info {

    private Person person;
    private MyDate date;

    public Info (String firstname, String lastname, int month, int day, int year) {
        person = new Person(firstname, lastname);
        date = new MyDate(day, month, year);
    }

    public void setInfo (String firstname, String lastname, int day, int month, int year) {
        person.setName(firstname, lastname);
        date.setDate(day, month, year);
    }

    @Override
    public String toString () {
        return "Name: " + person + "\nDate of Birth: " + date;
    }
}
