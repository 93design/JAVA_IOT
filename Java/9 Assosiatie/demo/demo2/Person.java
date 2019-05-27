package demo2;

/**
 * Created by Mrrobot on 11/04/2018 javabasics-workspace.
 */
public class Person {

    private String firstname;
    private String lastname;

    public Person (String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setName (String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString () {
        return firstname + " " + lastname;
    }
}
