package com.programs;
import com.utility.EmployeeWageComputationObject;
import com.utility.Utilities;

/**
 * @author : Sure Gopinath
 * Created Date : 17th Oct 2020
 * Functionality : This is employee wage computation program
 *                 contains employee attendance will taken using
 *                 random function through that calculating the
 *                 employee wages for month
 *
 * */
public class employeeWageComputationJava {

    public static void main (String[] args)
    {
        System.out.println("welcome to employee wage Computation\n");
        Utilities utilities = new Utilities();
        EmployeeWageComputationObject employeeWageComputationObject = new EmployeeWageComputationObject();
        employeeWageComputationObject.setWagePerHr(20);
        employeeWageComputationObject.setDaysInMonth(20);
        employeeWageComputationObject.setMaxWorkingHours(100);
        employeeWageComputationObject.setCompany("dmart");
        utilities.employeeDailyWagePerMonth(employeeWageComputationObject.getCompany(),employeeWageComputationObject.getWagePerHr(),
                                            employeeWageComputationObject.getDaysInMonth(),employeeWageComputationObject.getMaxWorkingHours());


        employeeWageComputationObject.setWagePerHr(20);
        employeeWageComputationObject.setDaysInMonth(20);
        employeeWageComputationObject.setMaxWorkingHours(100);
        employeeWageComputationObject.setCompany("reliance");
        utilities.employeeDailyWagePerMonth(employeeWageComputationObject.getCompany(),employeeWageComputationObject.getWagePerHr(),
                                            employeeWageComputationObject.getDaysInMonth(),employeeWageComputationObject.getMaxWorkingHours());
    }
}
