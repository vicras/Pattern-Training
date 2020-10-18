package com.company.controller;

import com.company.model.BeatModelInterface;
import com.company.view.BeatViewInterface;

public class BeatController implements BeatControllerInterface {

    BeatModelInterface model;
    BeatViewInterface view;

    public BeatController(BeatModelInterface model, BeatViewInterface view) {
        this.model = model;
        this.view = view;
        model.init();
        view.init(this, model);
    }

    @Override
    public void start() {
        model.setOn();
    }

    @Override
    public void stop() {
        model.setOff();
    }

    @Override
    public void increaseBpm() {
        int bpm = model.getBPM();
        model.setBPM(bpm + 1);
    }

    @Override
    public void decreaseBpm() {
        int bpm = model.getBPM();
        model.setBPM(bpm - 1);
    }

    @Override
    public void setBpm(int bpm) {
        model.setBPM(bpm);
    }
}
