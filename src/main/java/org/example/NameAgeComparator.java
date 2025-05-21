package org.example;

import java.util.Comparator;

public class NameAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2){
        int flag = e1.getName().compareTo(e2.getName());
        if(flag == 0){
            flag = e1.getAge() - e2.getAge();
        }
        return flag;
    }
}
