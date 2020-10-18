package com.company.model;

public class BeatModel implements BeatModelInterface {
    private int currentBpm;
    private BeatModelObservable observers;


    void notifyObservers(){
        observers.execute();
    }

    @Override
    public void init() {
        observers = new BeatModelObserver();
    }

    @Override
    public void setOn() {
        System.out.println("Model: set on");
    }

    @Override
    public void setOff() {
        System.out.println("Model: set off");

    }

    @Override
    public int getBPM() {
        return currentBpm;
    }

    @Override
    public void setBPM(int bpm) {
        currentBpm = bpm;

        System.out.println("Model: set bpm");
    }

    @Override
    public void addNewObserver(UpdateObserver observer) {
        System.out.println("Model: set new observer");
        observers.addNewObserver(observer);

    }

    @Override
    public void removeObserver(UpdateObserver observer) {
        System.out.println("Model: remove observer");
        observers.removeObserver(observer);
    }

}
