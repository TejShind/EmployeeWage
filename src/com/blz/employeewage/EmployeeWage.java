package com.blz.employeewage;

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_WAGE_PER_HR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HRS = 100;

    public static void main(String[] args) {
        computeWage();
    }

    private static void computeWage() {
        int empHr;
        int totalWorkingDays = 0, totalEmpWage, totalWorkingHrs = 0;
        System.out.println("Welcome to Employee Wage Computation Program");
        //Monthly Wage Computation
        while (totalWorkingDays <= MAX_WORKING_DAYS && totalWorkingHrs <= MAX_WORKING_HRS) {
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck) {
                case FULL_TIME -> {
                    System.out.println("Employee is working Full Time  on day " + totalWorkingDays);
                    empHr = 8;
                }
                case PART_TIME -> {
                    System.out.println("Employee is working Part Time  on day " + totalWorkingDays);
                    empHr = 4;
                }
                default -> {
                    System.out.println("Employee is Absent on day " + totalWorkingDays);
                    empHr = 0;
                }
            }

            totalWorkingHrs = totalWorkingHrs + empHr;
            System.out.println("Employee worked for " + totalWorkingDays + " Days " + totalWorkingHrs + " Hours");
            totalWorkingDays++;
        }
        totalEmpWage = EMP_WAGE_PER_HR * totalWorkingHrs;
        System.out.println("Employee's Monthly wage is " + totalEmpWage);
    }
}