package org.example;

import java.util.*;

public class ComparableDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(4,"sarat",29,10000));
        employeeList.add(new Employee(7,"sarat",29,10000));
        employeeList.add(new Employee(2,"sarat",29,10000));
        employeeList.add(new Employee(3,"sarat",29,10000));
        employeeList.add(new Employee(5,"sarat",29,10000));
        employeeList.add(new Employee(1,"sarat",29,10000));

        System.out.println("=======================Before Sorting===============================");
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println("=======================After Sorting===============================");
        System.out.println(employeeList);
    }
}
