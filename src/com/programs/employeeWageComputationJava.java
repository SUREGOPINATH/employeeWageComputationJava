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
        EmployeeWageComputationObject dmart = new EmployeeWageComputationObject();
        dmart.setWagePerHr(20);
        dmart.setDaysInMonth(20);
        dmart.setMaxWorkingHours(100);
        dmart.setCompany("dmart");
        utilities.employeeDailyWagePerMonth(dmart.getCompany(),dmart.getWagePerHr(),dmart.getDaysInMonth(),dmart.getMaxWorkingHours());
    }
}
