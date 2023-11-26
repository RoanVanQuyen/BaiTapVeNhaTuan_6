package org.example.Bai_2;

import java.util.Scanner;

public class FullTimeEmployee extends Employee{
    @Override
    public int caculatorSalary() {
        return 8 * getPaymentPerHour();
    }

    public FullTimeEmployee() {
    }

    public int getWorkingTime(){
        return 8 ;
    }

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + getName() + '\'' +
                ", paymentPerHour=" + getPaymentPerHour() +
                "}";
    }
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        System.out.printf("Nhap vao ten nhan vien: ");
        setName(Ip.nextLine());
        System.out.printf("Nhao vao so tien 1 gio: ");
        setPaymentPerHour(Ip.nextInt());
    }
}
