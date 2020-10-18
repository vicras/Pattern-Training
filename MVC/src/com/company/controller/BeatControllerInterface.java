package com.company.controller;

public interface BeatControllerInterface {
    void start();
    void stop();
    void increaseBpm();
    void decreaseBpm();
    void setBpm(int bpm);

}
