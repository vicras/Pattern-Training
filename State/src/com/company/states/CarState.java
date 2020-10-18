package com.company.states;

public interface CarState {

    void turnOf();
    void turnOn();

    void go();
    void stop();

    void outOfFull();
    void fillTheCar();

    void startSleep();
    void wakeUp();
}
