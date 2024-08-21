package com.example.patterns.service.factory;

public class LessDonation implements  Messenger {
    @Override
    public void sendMessage() {
        System.out.println("It never mattered how small you contribute, but what percentage of Your Wealth you " +
                "donated, each and every small step count for making the world a better place, thanks for your " +
                "donation");
    }
}
