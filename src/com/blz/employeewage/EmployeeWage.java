package com.blz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Present = 1;
        int Empcheck = (int) (Math.random() * 10) % 2;

        if (Empcheck == Present) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}