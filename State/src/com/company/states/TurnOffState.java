package com.company.states;

import com.company.model.Car;

public class TurnOffState implements CarState {

    Car car;

    public TurnOffState(Car car) {
        this.car = car;
    }

    @Override
    public void turnOf() {

    }

    @Override
    public void turnOn() {
        car.setCurrentState(car.getLaunchedState());
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

    }
}
