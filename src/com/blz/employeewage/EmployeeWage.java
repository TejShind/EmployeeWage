package com.blz.employeewage;

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    public static void main(String[] args) {
        computeWage("TATA", 50, 20, 22);
        computeWage("INFOSYS", 35, 20, 25);
    }

    private static void computeWage(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHrPerMonth) {
        int empHr;
        int totalWorkingDays = 0, totalEmpWage, totalWorkingHrs = 0;
        System.out.println("Welcome to Employee Wage Computation Program");
        //Monthly Wage Computation
        while (totalWorkingDays <= numOfWorkingDays && totalWorkingHrs <= maxHrPerMonth) {
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
        totalEmpWage = empRatePerHr * totalWorkingHrs;
        System.out.println("Employee's Monthly wage for " + companyName + " is " + totalEmpWage);
    }
}