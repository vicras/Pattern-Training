package com.company.subject;

import com.company.observers.Observer;

public interface Subject {
    public void addNewObserver(Observer o);
    public void removeObserver(Observer o);
    public void sendInformation();
}
