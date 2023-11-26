package org.example.Bai_2;

import java.util.Comparator;

public abstract class Employee implements IEmployees {
    private String name ;
    private int paymentPerHour ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    @Override
    public int caculatorSalary() {
        return 0;
    }
    public int getWorkingTime(){
        return 0 ;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    public Employee(){}
    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", paymentPerHour=" + paymentPerHour +
                '}';
    }
}
