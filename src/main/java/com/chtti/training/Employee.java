package com.chtti.training;

import lab8.Work;

public class Employee implements Work {

    static {
        counter = 500;
        System.out.println("test");
    }

    public Employee() {
    }

    public static int getCounter() {
        return counter;
    }

    public Employee(String name) {
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Kevin");
        System.out.println("keven name=" + emp1.getName());
        emp1.setName("Kevin Wang");
        System.out.println("keven name=" + emp1.getName());
    }

    private String name;
    private static int counter;

    @Override
    public void startWork() {

    }

    @Override
    public void endWork() {

    }
}
