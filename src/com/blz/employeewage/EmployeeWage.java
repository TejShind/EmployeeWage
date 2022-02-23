package com.blz.employeewage;

public class EmployeeWage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_WAGE_PER_HR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HRS = 100;

    public static void main(String[] args) {
        int empHr = 0;
        int empWage = 0;
        int totalWorkingDays = 1, totalEmpWage = 0, totalEmpHrs = 0;
        System.out.println("Welcome to Employee Wage Computation Program");
        while (totalEmpHrs < MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS)

            for (totalWorkingDays = 1; totalWorkingDays <= MAX_WORKING_DAYS; totalWorkingDays++) {
                int Empcheck = (int) (Math.random() * 10) % 3;
                switch (Empcheck) {
                    case FULL_TIME:
                        System.out.println("Employee is working Full Time  on day " + totalWorkingDays);
                        empHr = 8;
                        break;
                    case PART_TIME:
                        System.out.println("Employee is working Part Time  on day " + totalWorkingDays);
                        empHr = 4;
                        break;
                    default:
                        System.out.println("Employee is Absent on day " + totalWorkingDays);
                        empHr = 0;
                }
                totalWorkingDays++;
                totalEmpHrs = +empHr + totalEmpHrs;
            }
        totalEmpWage = EMP_WAGE_PER_HR * totalEmpHrs;
        System.out.println("Employee worked for " + totalWorkingDays + " Days " + totalEmpHrs + " Hours");
        System.out.println("Employee's Monthly wage is " + totalEmpWage);
    }
}