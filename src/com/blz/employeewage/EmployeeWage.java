package com.blz.employeewage;

public class EmployeeWage {

    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    private static int numOfWorkingDays;
    private final String company;
    private final int empRatePerHr;
    private final int maxHrPerMonth;
    private int totalWage;

    EmployeeWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrPerMonth = maxHrPerMonth;
    }

    public static void main(String[] args) {
        EmployeeWage company1 = new EmployeeWage("TATA", 35, 20, 22);
        EmployeeWage company2 = new EmployeeWage("INFOSYS", 25, 20, 20);
        int c1= company1.computeWage();
        int c2 = company2.computeWage();
        System.out.println(c1);
        System.out.println(c2);

        }

    @Override
    public String toString() {
        return "EmployeeWage{" +
                "company='" + company + '\'' +
                ", empRatePerHr=" + empRatePerHr +
                ", numOfWorkingDays=" + numOfWorkingDays +
                ", maxHrPerMonth=" + maxHrPerMonth +
                ", totalWage=" + totalWage +
                '}';
    }

    private int computeWage() {
        int empHr;
        int totalWorkingDays = 0, totalWorkingHrs = 0;
        //Monthly Wage Computation
        while (totalWorkingDays <= numOfWorkingDays && totalWorkingHrs <= maxHrPerMonth) {
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck) {
                case FULL_TIME -> empHr = 8;
                case PART_TIME -> empHr = 4;
                default -> empHr = 0;
            }
            totalWorkingHrs = totalWorkingHrs + empHr;
            System.out.println("Employee worked for " + totalWorkingDays + " Days " + totalWorkingHrs + " Hours");
            totalWorkingDays++;
        }
        totalWage = empRatePerHr * totalWorkingHrs;
        return totalWage;
    }
}

