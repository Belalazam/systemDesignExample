package com.example.patterns.service.observer;

import java.util.ArrayList;
import java.util.List;

public class HelperStation implements Subject
{
    private List<Observer> observers;
    private String totalHelped;

    public HelperStation()
    {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers)
        {
            observer.update(totalHelped);
        }
    }

    public void setTotalHelped(String totalHelped)
    {
        this.totalHelped = totalHelped;
        notifyObservers();
    }
}
