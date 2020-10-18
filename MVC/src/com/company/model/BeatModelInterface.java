package com.company.model;

public interface BeatModelInterface{
    void init();

    void setOn();
    void setOff();

    int getBPM();
    void setBPM(int bpm);

    void addNewObserver(UpdateObserver observer);
    void removeObserver(UpdateObserver observer);
}
