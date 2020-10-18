package com.company.observers;

public class FirstObserver implements Observer{
    @Override
    public void update() {
        System.out.println("Was updated");
    }


}
