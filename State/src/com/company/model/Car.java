package com.company.model;

import com.company.states.*;

public class Car implements CarState{

    //region States
    private CarState inMotionState;
    private CarState launchedState;
    private CarState outOfFullState;
    private CarState pendingState;
    private CarState turnOffState;

    private CarState currentState;
    //endregion


    public Car() {
        inMotionState = new InMotionState(this);
        launchedState = new LaunchedState(this);
        outOfFullState = new OutOfFullState(this);
        pendingState = new PendingState(this);
        turnOffState = new TurnOffState(this);

        currentState = turnOffState;
    }

    public CarState getInMotionState() {
        return inMotionState;
    }

    public CarState getLaunchedState() {
        return launchedState;
    }

    public CarState getOutOfFullState() {
        return outOfFullState;
    }

    public CarState getPendingState() {
        return pendingState;
    }

    public CarState getTurnOffState() {
        return turnOffState;
    }

    public void setCurrentState(CarState currentState) {
        this.currentState = currentState;
    }

    //region state actions

    @Override
    public void turnOf() {
        currentState.turnOf();
    }

    @Override
    public void turnOn() {
        currentState.turnOn();
    }

    @Override
    public void go() {
        currentState.go();
    }

    @Override
    public void stop() {
        currentState.stop();
    }

    @Override
    public void outOfFull() {
        currentState.outOfFull();
    }

    @Override
    public void fillTheCar() {
        currentState.fillTheCar();
    }

    @Override
    public void startSleep() {
        currentState.startSleep();
    }

    @Override
    public void wakeUp() {
        currentState.wakeUp();
    }

    //endregion
}
