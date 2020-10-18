package com.company.states;

import com.company.model.Car;

public class OutOfFullState implements CarState {

    Car car;

    public OutOfFullState(Car car) {
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
        car.setCurrentState(car.getLaunchedState());
    }

    @Override
    public void startSleep() {

    }

    @Override
    public void wakeUp() {

    }
}
