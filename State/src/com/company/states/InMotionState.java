package com.company.states;

import com.company.model.Car;

public class InMotionState implements CarState {
    Car car;

    public InMotionState(Car car) {
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
        car.setCurrentState(car.getLaunchedState());
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

    }
}
