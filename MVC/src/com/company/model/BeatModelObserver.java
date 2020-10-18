package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class BeatModelObserver implements BeatModelObservable {

    List<UpdateObserver> observers;

    public BeatModelObserver() {
        observers = new ArrayList<>();
    }

    @Override
    public void addNewObserver(UpdateObserver observer) {
        if (!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void removeObserver(UpdateObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void execute(){
        for(var i: observers)
            i.bpmHasUpdated();
    }
}
