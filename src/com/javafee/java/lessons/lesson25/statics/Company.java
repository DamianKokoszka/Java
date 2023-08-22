package com.javafee.java.lessons.lesson25.statics;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        //odwołanie przez klasę
        System.out.println("Employee count: " + Employee.count); //2
        //odwołanie przez referecję
        System.out.println("Employee count: " + emp1.count);//2
        System.out.println("Employee count: " + emp2.count);//2
    }
}
