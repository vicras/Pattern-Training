package com.company.remote;

import com.company.command.Command;
import com.company.command.NoCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarRemoteController {
    List<Command> commandList;

    public CarRemoteController(int buttonAmount) {
        commandList = Stream.generate(NoCommand::new)
                .limit(buttonAmount)
                .collect(Collectors.toList());
    }

    public void setCommand(int slot, Command command) {
        if (slot >= commandList.size())
            throw new IndexOutOfBoundsException("slot " + slot + " dont exist");
        this.commandList.set(slot, command);
    }

    public void executeCommand(int slot) {
        if (slot >= commandList.size())
            throw new IndexOutOfBoundsException("slot " + slot + " dont exist");
        commandList.get(slot).execute();
    }

}
