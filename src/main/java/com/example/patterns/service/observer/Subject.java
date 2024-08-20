package com.example.patterns.service.observer;

public interface Subject
{
    void attach(Observer observer);
    void detach(Observer observer);

    void notifyObservers();
}
