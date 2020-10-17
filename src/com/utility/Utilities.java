package com.utility;

public class Utilities {

    static int isFulltime = 1;
    static int wagePerHr = 20;
    public void attendanceChecker () {

        employeeAttendance((int) Math.floor(Math.random() *10 ) % 2);
    }
    public static void employeeAttendance (int attendance) {

        if (attendance == isFulltime) {
            System.out.println("employee present");
            System.out.println("employee daily wage is " + employeeDailyWage(8));
        }
        else {
            System.out.println("employee Absent");
            System.out.println("employee daily wage is " + employeeDailyWage(0));
        }
    }
    public static int employeeDailyWage (int hrs) {
        return hrs*wagePerHr;
    }

}
