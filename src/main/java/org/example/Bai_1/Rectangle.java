package org.example.Bai_1;

public class Rectangle extends Shape{
    protected double width ;
    protected double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (width + length) * 2;
    }

    @Override
    public double getPrimeter() {
        return  width * length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(){}
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

}
