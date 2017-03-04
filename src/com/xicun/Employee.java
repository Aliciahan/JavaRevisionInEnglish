package com.xicun;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by xicunhan on 03/03/2017.
 */
public class Employee {

    //instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;

    private final StringBuilder testfinal = new StringBuilder();

    public void appendTestFinal(String info){
        testfinal.append(info);
    }

    public String getTestFinal(){
        return testfinal.toString();
    }

    // constructor
    public Employee(String n, double s , int year, int month, int day){
        this.name= n;
        this.salary=s;

        this.hireDay = LocalDate.of(year,month,day);

    }

    //methods

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(int pourcentage){
        //
        this.salary = this.salary*((double)(100+pourcentage)/100);
    }

    public String informationStaff (){
        return "Name : "+this.name + ", Salary:"+ this.salary +
                ", hired at: "+this.hireDay.toString();
    }
    public String getHireDay(){
        return hireDay.toString();
    }
}
