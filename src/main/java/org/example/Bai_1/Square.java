package org.example.Bai_1;

public class Square extends Rectangle{

    public void setSide(double side){
        length = side  ;
        width = side ;
    }
    public double getSide(){
        return length ;
    }
    public void setLength(double side){
        setSide(side);
    }
    public void setWidth(double side){
        setSide(side);
    }
    public Square(double side){
        length = side ;
        width = side ;
    }
    public Square(double side , String color , boolean filled){
        length = side;
        width = side ;
        this.color = color ;
        this.filled = filled ;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side='" + length + "'" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
