package org.rastalion.chapter13_interfaces.demo1;

public class Rectangle implements Scaleable{

    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void scale(int factor) {
        height = (height * factor) / 100;
        width = (width * factor) / 100;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,50);
        rectangle.scale(Scaleable.DOUBLE);

        System.out.println(rectangle);
    }
}
