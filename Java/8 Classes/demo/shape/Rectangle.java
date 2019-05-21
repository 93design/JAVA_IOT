package org.rastalion.chapter8_klassen_definiëren.shape;
/**
 * Created by Mrrobot on 10/04/2018 javabasics-workspace.
 */
public class Rectangle {

    /*
    instance Eigenschappen
     */
    private int x;
    private int y;
    private double height;
    private double width;

    /*
    klasse eigenschappen
     */
    public static final int ANGLES = 4;
    public static int counter = 0;

    {
        counter++;
    }

    public Rectangle () {
        this(0, 0, 0, 0);
    }

    public Rectangle (double width) {
        this(width, 0, 0, 0);
    }

    public Rectangle (double width, double height) {
        this(width, height, 0, 0);
    }

    public Rectangle (double width, double height, int x) {
        this(width, height, x, 0);
    }

    public Rectangle (double width, double height, int x, int y) {
        setPosition(x, y);
        setWidth(width);
        setHeight(height);
//        counter++;
    }

    public Rectangle (Rectangle rect) {
        this.x = rect.getX();
        this.y = rect.getY();
        setWidth(rect.getWidth());
        setHeight(rect.height);
    }

    /*
        Getters en Setters
         */
    public int getX () {
        return x;
    }

    public void setX (int x) {
        this.x = x;
    }

    public int getY () {
        return y;
    }

    public void setY (int y) {
        this.y = y;
    }

    public double getHeight () {
        return height;
    }

    public void setHeight (double height) {
        this.height = (height < 0) ? -height : height;
    }

    public double getWidth () {
        return width;
    }

    public void setWidth (double width) {
        this.width = width < 0 ? -width : width;
    }

    public void setPosition (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getArea () {
        return height * width;
    }

    public static int getANGLES () {
        return ANGLES;
    }
}
