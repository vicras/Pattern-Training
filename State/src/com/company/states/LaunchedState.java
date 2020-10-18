package com.company.states;

import com.company.model.Car;

public class LaunchedState implements CarState{

    Car car;

    public LaunchedState(Car car) {
        this.car = car;
    }

    @Override
    public void turnOf() {
        car.setCurrentState(car.getTurnOffState());
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void go() {
        car.setCurrentState(car.getInMotionState());
    }

    @Override
    public void stop() {

    }

    @Override
    public void outOfFull() {
        car.setCurrentState(car.getOutOfFullState());
    }

    @Override
    public void fillTheCar() {

    }

    @Override
    public void startSleep() {
        car.setCurrentState(car.getPendingState());
    }

    @Override
    public void wakeUp() {

    }
}
