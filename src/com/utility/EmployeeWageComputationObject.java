package com.utility;

public class EmployeeWageComputationObject {

    private static int wagePerHr;
    private static int daysInMonth;
    private static int maxWorkingHours;
    private static String company;

    public static int getWagePerHr() {
        return wagePerHr;
    }

    public static void setWagePerHr(int wagePerHr) {
        EmployeeWageComputationObject.wagePerHr = wagePerHr;
    }

    public static int getDaysInMonth() {
        return daysInMonth;
    }

    public static void setDaysInMonth(int daysInMonth) {
        EmployeeWageComputationObject.daysInMonth = daysInMonth;
    }

    public static int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public static void setMaxWorkingHours(int maxWorkingHours) {
        EmployeeWageComputationObject.maxWorkingHours = maxWorkingHours;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        EmployeeWageComputationObject.company = company;
    }
}
