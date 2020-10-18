package com.company.command;

import com.company.model.Car;

public class GoForwardCommand implements Command {
    Car car;


    public GoForwardCommand(Car car) {
        this.car = car;
    }



    @Override
    public void execute() {
        car.goForward();
    }
}
