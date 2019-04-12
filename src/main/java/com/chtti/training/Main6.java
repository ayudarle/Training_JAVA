package com.chtti.training;

public class Main6 {

    public static void main(String[] args) {
        Employee e1 = new Employee("A");
        System.out.println(Employee.getCounter());
        Employee e2 = new Employee("B");
        System.out.println(Employee.getCounter());
        Employee e3 = new Employee("C");
        System.out.println(Employee.getCounter());

    }


}
