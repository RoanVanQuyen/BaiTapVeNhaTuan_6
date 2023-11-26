package org.example.Bai_1;

import org.example.Bai_1.Circle;
import org.example.Bai_1.Rectangle;
import org.example.Bai_1.Shape;
import org.example.Bai_1.Square;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void veHinh(int width , int length , boolean filled){
        if(filled == true) {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            for(int i = 0 ; i < length ; i++){
                for(int j = 0; j < width ; j++){
                    if(i == 0 || i == length-1){
                        System.out.print("*");
                    }
                    else{
                        if(j == 0 || j == width -1 ){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int choose;
        Scanner Ip  = new Scanner(System.in) ;
        Shape one = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPrimeter() {
                return 0;
            }
        } ;
        int shape = 1 ;
        double  width  = 0 , length = 0  ;
        do {
            System.out.printf("Nhập số 1 để thêm hình , chọn 2 để in ra: ");
            choose = Ip.nextInt() ;
            if(choose == 1) {
                System.out.print("Lựa chọn 1 với hình tròn \nLựa chọn 2 với hình chữ nhật \nLựa chọn 3 với hình vuông: ");
                shape = Ip.nextInt();
                if(shape == 1){
                    System.out.printf("Nhập vào bán kính: ");
                    double radius = Ip.nextDouble();
                    Circle circle = new Circle(radius);
                    one = circle ;
                }
                if(shape == 2){
                    System.out.printf("Chiều dài: ");
                    width = Ip.nextDouble() ;
                    System.out.printf("Chiều rộng: ");
                    length = Ip.nextDouble() ;
                    Rectangle rectangle = new Rectangle(width , length) ;
                    one = rectangle ;
                }
                if(shape == 3){
                    System.out.print("Kích thước cạnh: ");
                    double side = Ip.nextDouble() ;
                    length = side  ; width = side ;
                    Square square = new Square(side) ;
                }
                Ip.nextLine() ;
                System.out.printf("Nhap vao mau sac: ");
                String color = Ip.nextLine() ;
                System.out.printf("Bạn có muốn lấp đầy hình không (1=true , 2 = false): ");
                int fill = Ip.nextInt() ;
                boolean filled = fill == 1 ? true : false ;
                one.setColor(color);
                one.setFilled(filled);

            }
            if(choose == 2){
                System.out.println(one.toString());
                if( shape == 2 || shape == 3) {
                    veHinh((int)width, (int) length, one.isFilled());
                }
            }
        }while(choose < 3) ;


    }
}