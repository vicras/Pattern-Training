package com.company.states;

import com.company.model.Car;

public class PendingState implements CarState{

    Car car;

    public PendingState(Car car) {
        this.car = car;
    }

    @Override
    public void turnOf() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void go() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void outOfFull() {

    }

    @Override
    public void fillTheCar() {

    }

    @Override
    public void startSleep() {

    }

    @Override
    public void wakeUp() {
        car.setCurrentState(car.getLaunchedState());
    }
}
