package com.company.model;

public interface BeatModelObservable {
    void addNewObserver(UpdateObserver observer);
    void removeObserver(UpdateObserver observer);
    void execute();
}
