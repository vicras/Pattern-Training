package com.company.subject;

import com.company.observers.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class ConcreteSubject implements Subject {
    private List<Observer> observers;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }


    @Override
    public void addNewObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index > -1) {
            observers.remove(index);
        }

    }

    @Override
    public void sendInformation() {
        for (var i : observers) {
            i.update();
        }
    }
}
