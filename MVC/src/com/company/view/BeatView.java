package com.company.view;

import com.company.controller.BeatControllerInterface;
import com.company.model.BeatModelInterface;

public class BeatView implements BeatViewInterface {
    BeatControllerInterface controller;
    BeatModelInterface model;

    @Override
    public void init(BeatControllerInterface controller, BeatModelInterface model) {
        System.out.println("View: init");
        this.controller = controller;
        this.model = model;
        model.addNewObserver(this);
    }

    @Override
    public void bpmHasUpdated() {
        System.out.println("View: BPM = " + model.getBPM());
    }

    public void start(){
        controller.start();
    }

    public void stop(){
        controller.stop();
    }

    public void increaseBpm(){
        controller.increaseBpm();
    }

    public void decreaseBpm(){
        controller.decreaseBpm();
    }

    public void setBpm(int bpm){
        controller.setBpm(bpm);
    }

}
