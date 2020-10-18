package com.company;

import com.company.controller.BeatController;
import com.company.controller.BeatControllerInterface;
import com.company.model.BeatModel;
import com.company.model.BeatModelInterface;
import com.company.view.BeatView;
import com.company.view.BeatViewInterface;

public class Main {

    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        BeatViewInterface view = new BeatView();

        BeatControllerInterface controller = new BeatController(model, view);
    }
}
