package com.example.patterns.service.factory;

public class HighDonation implements  Messenger {
    @Override
    public void sendMessage() {
            System.out.println("Thanks For your lovely Donation, Your Donation will change 1000s lives");
    }
}
