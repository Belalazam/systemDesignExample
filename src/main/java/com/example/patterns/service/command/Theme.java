package com.example.patterns.service.command;

public class Theme implements Receiver{


    @Override
    public void darkMode() {
        System.out.println("dark mode activated");
    }

    @Override
    public void lightMode() {
        System.out.println("light mode activated");
    }
}
