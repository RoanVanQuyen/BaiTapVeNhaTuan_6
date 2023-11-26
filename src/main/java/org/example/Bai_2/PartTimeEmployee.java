package org.example.Bai_2;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    private int workingTime ;

    public int getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
    }

    public PartTimeEmployee(int workingTime) {
        this.workingTime = workingTime;
    }
    public PartTimeEmployee(){}
    public PartTimeEmployee(String name, int paymentPerHour, int workingTime) {
        super(name, paymentPerHour);
        this.workingTime = workingTime;
    }

    @Override
    public int caculatorSalary() {
        return workingTime * getPaymentPerHour();
    }

    Scanner Ip =new Scanner(System.in) ;
    public void Input(){
        System.out.print("Nhap vao ten nhan vien: ");
        setName(Ip.nextLine());
        System.out.printf("Nhap vao so tien 1 gio: ");
        setPaymentPerHour(Ip.nextInt());
        System.out.printf("Nhap vao so thoi gian lam viec: ");
        workingTime = Ip.nextInt() ;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "name='" + getName() + '\'' +
                ", paymentPerHour=" + getPaymentPerHour() +
                ", workingTime=" + workingTime +
                '}';
    }
}
