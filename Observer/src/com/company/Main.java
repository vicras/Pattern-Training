package com.company;

import com.company.observers.FirstObserver;
import com.company.subject.ConcreteSubject;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject co = new ConcreteSubject();
        FirstObserver firstObserver = new FirstObserver();
        co.addNewObserver(firstObserver);
        co.sendInformation();
    }
}
