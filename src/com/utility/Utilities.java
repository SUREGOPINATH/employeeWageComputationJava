package com.utility;

public class Utilities {


    static int wagePerHr = 20;
    public void attendanceChecker () {

        employeeAttendance((int) Math.floor(Math.random() *10 ) % 3);
    }
    public static void employeeAttendance (int attendance) {

        switch (attendance) {
            case 1 -> {
                System.out.println("employee fulltime present");
                System.out.println("employee daily wage is " + employeeDailyWage(8));
            }
            case 2 -> {
                System.out.println("employee parttime Present");
                System.out.println("employee daily wage is " + employeeDailyWage(4));
            }
            default -> {
                System.out.println("employee Absent");
                System.out.println("employee daily wage is " + employeeDailyWage(0));
            }
        }
    }
    public static int employeeDailyWage (int hrs) {
        return hrs*wagePerHr;
    }

}
