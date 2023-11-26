package org.example.Bai_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private  static ArrayList<Employee> employees = new ArrayList<>()  ;
    public  static void sortByPay(){
        employees.sort((o1 , o2)->{
            return o2.caculatorSalary() - o1.caculatorSalary() ;
        });
    }

    public static void removeByWorkingTime(){
        Employee one =  Collections.min(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getWorkingTime() - o2.getWorkingTime();
            }
        }) ;
        ArrayList<Employee> employeesRemove = new ArrayList<>() ;
        for(int i = 0 ; i < employees.size() ; i++){
            if(employees.get(i).getWorkingTime() == one.getWorkingTime()){
                System.out.println(employees.get(i).toString());
                employeesRemove.add(employees.get(i)) ;
            }
        }
        for(int i = 0 ; i < employeesRemove.size() ; i++){
            employees.remove(employeesRemove.get(i));
        }
    }
    public static void main(String [] args){

        employees.add(new PartTimeEmployee("Roan Van Quyen" , 23 , 4)) ;
        employees.add(new FullTimeEmployee("Le Thi Linh" , 35)) ;
        employees.add(new FullTimeEmployee("Nguyen Viet Hoang" , 32));
        Scanner Ip = new Scanner(System.in) ;
        int choose =0 ;
        do {
            System.out.println("Moi nhap lua chon: ");
            System.out.printf("1: Muốn thêm nhân viên \n2: Muốn in toàn bộ thông tin\n3: Muốn sắp xếp nhân viên theo lương\n4: Xoá nhân viên làm việc ít giờ nhất\n5: Để thoát: ");

            choose = Ip.nextInt() ;
            if(choose == 1) {
                System.out.printf("Moi nhap loai nhan vien ban muon them(1-Parttime 2-Fulltime): ");
                int emp = Ip.nextInt();
                if (emp == 1) {
                    Ip.nextLine()  ;
                    PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
                    partTimeEmployee.Input();
                    employees.add(partTimeEmployee) ;
                } else {
                    Ip.nextLine() ;
                    FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
                    fullTimeEmployee.Input();
                    employees.add(fullTimeEmployee) ;
                }
            }
            if(choose == 2){
                for(Employee x : employees){
                    System.out.println(x.toString() );
                }
            }
            if(choose == 3){
                sortByPay();
            }
            if(choose == 4){
                removeByWorkingTime();
            }

        }while(choose < 5);

    }
}
