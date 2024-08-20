package com.example.patterns.service.observer;

public class FemaleObserver implements  Observer
{
    private Subject helperStation;

    public FemaleObserver(Subject helperStation)
    {
        this.helperStation = helperStation;
        helperStation.attach(this);
    }

    @Override
    public void update(String totalHelped)
    {
        System.out.println("Hello mam , thanks for your support, your support is changing the world, we have helper total:" + totalHelped);
    }
}
