package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
        Employee farah = new Employee(1000000);

        //System.out.println(farah.salary);
        //does not print salary

        System.out.println(farah.getSalary());
        farah.setSalary(1100000);
        System.out.println(farah.getSalary());

    }
}
