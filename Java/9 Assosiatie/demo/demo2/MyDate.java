package demo2;

/**
 * Created by Mrrobot on 11/04/2018 javabasics-workspace.
 */
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString () {
        return day + "/" + month + "/" + year;
    }
}
