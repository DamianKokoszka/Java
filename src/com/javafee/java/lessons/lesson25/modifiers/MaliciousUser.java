package com.javafee.java.lessons.lesson25.modifiers;

public class MaliciousUser {
    public void countMyVisit(PublicVisitCounter counter){
        counter.increment();
        counter.userCount = -10;
    }
}
