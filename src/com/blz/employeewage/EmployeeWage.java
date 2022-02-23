package com.blz.employeewage;

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int EMP_WAGE_PER_HR = 20;

    public static void main(String[] args) {
        int empHr = 0;
        int empWage = 0;
        System.out.println("Welcome to Employee Wage Computation Program");
        int Empcheck = (int) (Math.random() * 10) % 2;

        if (Empcheck == FULL_TIME) {
            empHr = 8;
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is Absent");
        }
        empWage = empHr * EMP_WAGE_PER_HR;
        System.out.println("Employee's wage is " + empWage);
    }
}