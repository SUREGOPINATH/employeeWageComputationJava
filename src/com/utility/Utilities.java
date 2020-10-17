package com.utility;

import java.util.Arrays;

public class Utilities {


    static int wagePerHr = 20;
    static int daysInMonth = 20;
    static  int wages = 0;
    static int totalWages = 0;
    static int[] arrayOfWages = new int[20];
    public void employeeDailyWagePerMonth () {

        int index = 0;
        int totalDays = 1;
        int totalHrs = 0;
        while (totalDays<daysInMonth && totalHrs<100) {
            int wages = attendanceChecker();
            arrayOfWages[index] = wages;
            totalWages+=wages;
            totalHrs+=wages/20;
            totalDays++;
            index++;
        }
        System.out.println("all wages in a month are "+ Arrays.toString(arrayOfWages));
        System.out.println("total wages of employee in a month is "+totalWages+"\ntotal working Days are "+totalDays+"\ntotal working hours are "+totalHrs);
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
        System.out.println("employee daily wage is " + wages+"\n");
        return wages;
    }
    public static int employeeDailyWage (int hrs) {
        return hrs*wagePerHr;
    }

}
