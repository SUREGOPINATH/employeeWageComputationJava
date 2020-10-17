package com.utility;

import java.util.Arrays;
/**
 * @author : Sure Gopinath
 * Created Date : 17th Oct 2020
 * Functionality : This is utilities program contains all
 *                 logic and code of program is present inside
 *                 this file
 * */
public class Utilities {


    static int wagePerHr = 20;
    static int daysInMonth = 20;
    static  int wages = 0;
    static int totalWages = 0;
    static int[] arrayOfWages = new int[20];

    /**
     * Functionality : This is only function that called in employee
     *                 wage computation program
     *
     * */
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

    /**
     * @return -> this return the value obtain from employeeAttendance method
     *
     * */
    public static int attendanceChecker () {

        return employeeAttendance((int) Math.floor(Math.random() *10 ) % 3);
    }

    /**
     * @param attendance -> it has value from attendanceChecker(0,1,2)
     *                      0 -> employee Absent
     *                      1 -> employee Fulltime
     *                      2 -> employee parttime
     * @return -> return the value wage from employeeDailyWage method
     * */
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

    /**
     * @param hrs -> it has value from employeeAttendance(0,4,8)
     *               0 -> working hours is 0 i.e employee absent
     *               4 -> working hours is 4 i.e employee parttime
     *               8 -> working hours is 8 i.e employee Fulltime
     *
     * */
    public static int employeeDailyWage (int hrs) {
        return hrs*wagePerHr;
    }

}
