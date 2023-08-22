package com.javafee.java.lessons.lesson25.statics;

public class Employee {
    static int count = 0;
    int id;

    Employee(){
        id = count++; //zwiekszamy pole count, przy tworzeniu każdego obiektu Employee
    }
}
