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

    static  int wages = 0;
    static int empHrs = 0;
    static int totalWages = 0;
    static int[] arrayOfWages = new int[20];

    /**
     * Functionality : This is only function that called in employee
     *                 wage computation program
     *
     * */
    public void employeeDailyWagePerMonth (String company,int wagePerHr,int daysInMonth,int maxworkingHours) {

        int index = 0;
        int totalDays = 1;
        int totalHrs = 0;
        while (totalDays<=daysInMonth && totalHrs<maxworkingHours) {
            empHrs = attendanceChecker();
            wages = empHrs * wagePerHr;
            System.out.println("Day"+totalDays+" Wage is "+wages+"\n");
            arrayOfWages[index] = wages;
            totalWages+=wages;
            totalHrs+=wages/20;
            totalDays++;
            index++;
        }
        System.out.println("all wages in a month are "+ Arrays.toString(arrayOfWages));
        System.out.println("Total working hours "+totalHrs);
        System.out.println("The wages of employee in the "+company+" company for month is "+totalWages+"\n");
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
     * @return -> return the value of empHrs ( 0,4,8 )
     *            0 -> employee Hours for Absent employee
     *            4 -> employee Hours for Parttime employee
     *            8 -> employee Hours for Fulltime employee
     * */
    public static int employeeAttendance (int attendance) {

        switch (attendance) {
            case 1 -> {
                System.out.println("employee fulltime present");
                empHrs = 8;
            }
            case 2 -> {
                System.out.println("employee parttime Present");
                empHrs = 4;
            }
            default -> {
                System.out.println("employee Absent");
                empHrs = 0;

            }
        }
        return empHrs;
    }

}
