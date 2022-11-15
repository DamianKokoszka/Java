package com.javafee.java.lessons.lesson10.backend;

public class SkanBiletu {
    public int sprawdznumer(String numerwejscia, String numerbiletu){
        int size1 = numerwejscia.length();
        int size2 = numerbiletu.length();
        if(size1 != size2){
            return 0;
        }
        else if(numerwejscia.equals(numerbiletu)){
            return 1;
        }
        return 0;
    }
}