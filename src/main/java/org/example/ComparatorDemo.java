package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(4,"Chandu",29,10000));
        employeeList.add(new Employee(7,"Chandu",30,20000));
        employeeList.add(new Employee(2,"veena",25,70000));
        employeeList.add(new Employee(3,"Thapela",27,90000));
        employeeList.add(new Employee(5,"Sunitha",42,2000));
        employeeList.add(new Employee(1,"Charitha",50,15000));

        System.out.println("=======================Before Sorting===============================");
        System.out.println(employeeList);
        Collections.sort(employeeList,new NameComparator());
        System.out.println("=======================Sorting Based On Name===============================");
        System.out.println(employeeList);

        Collections.sort(employeeList, new SalaryComparator());

        System.out.println("=======================Sorting Based On Salary===============================");
        System.out.println(employeeList);

        System.out.println("=======================Sorting Based On Name and Age=========================");
        Collections.sort(employeeList, new NameAgeComparator());
        System.out.println(employeeList);
    }
}
