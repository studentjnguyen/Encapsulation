package org.horizoncolumbus.hs;

public class Employee {
    private int salary;

    Employee(int EmployeeSalary){
        salary = EmployeeSalary;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int newSalary){
        salary = newSalary;
    }
}
