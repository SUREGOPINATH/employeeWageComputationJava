package com.utility;

import java.util.Arrays;

public class Utilities {


    static int wagePerHr = 20;
    static int daysInMonth = 20;
    static  int wages = 0;
    static int totalWages = 0;
    static int[] arrayOfWages = new int[20];
    public void employeeDailyWagePerMonth () {

        for (int counter = 0; counter<daysInMonth;counter++) {
            int wages = attendanceChecker();
            arrayOfWages[counter] = wages;
            totalWages+=wages;
        }
        System.out.println("all wages in a month are "+ Arrays.toString(arrayOfWages));
        System.out.println("total wages of employee is "+totalWages);
    }
    public static int attendanceChecker () {

        return employeeAttendance((int) Math.floor(Math.random() *10 ) % 3);
    }
    public static int employeeAttendance (int attendance) {

        switch (attendance) {
            case 1 -> {
                System.out.println("employee fulltime present");
                wages = employeeDailyWage(8);
            }
            case 2 -> {
                System.out.println("employee parttime Present");
                wages = employeeDailyWage(4);
            }
            default -> {
                System.out.println("employee Absent");
                wages = employeeDailyWage(0);

            }
        }
        System.out.println("employee daily wage is " + wages);
        return wages;
    }
    public static int employeeDailyWage (int hrs) {
        return hrs*wagePerHr;
    }

}
