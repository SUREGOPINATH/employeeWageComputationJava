package com.utility;

public class Utilities {

    static int isFulltime = 1;
    public void attendanceChecker () {

        employeeAttendance((int) Math.floor(Math.random() *10 ) % 2);
    }
    public static void employeeAttendance (int attendance) {

        if (attendance == isFulltime)
            System.out.println("employee present");
        else
            System.out.println("employee Absent");
    }

}
