package com.company.view;

import com.company.controller.BeatControllerInterface;
import com.company.model.BeatModelInterface;
import com.company.model.UpdateObserver;

public interface BeatViewInterface extends UpdateObserver {
    public void init(BeatControllerInterface controller, BeatModelInterface model);
}
