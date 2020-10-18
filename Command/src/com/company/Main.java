package com.company;

import com.company.command.Command;
import com.company.command.GoForwardCommand;
import com.company.model.Car;
import com.company.remote.CarRemoteController;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Command command = new GoForwardCommand(car);

        CarRemoteController rc = new CarRemoteController(10);

        rc.setCommand(1, car::goForward);

        rc.executeCommand(1);

    }

}
