package com.xicun;
/**
 * Created by xicunhan on 04/03/2017.
 */
public class TestEmployee {
    public static void main(String[] args){
        Employee[] staffs = new Employee[3];
        staffs[0] = new Employee("Carl Cracker",1000,2017,5,9);
        staffs[1] = new Employee("Harry Poter",1200,2016,5,9);
        staffs[2] = new Employee("Tony Tester",1500,2015,5,9);

        for (Employee e: staffs){
            e.raiseSalary(5);
        }

        for (Employee e: staffs){
            System.out.println(e.informationStaff());
        }

        staffs[0].appendTestFinal("helloworld");
        System.out.println(staffs[0].getTestFinal());
    }
}
