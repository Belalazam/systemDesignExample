package com.example.patterns.service.factory;

public class MediumDonation implements Messenger{
    @Override
    public void sendMessage() {
        System.out.println("People like you are changing the world, thanks for you donation");
    }
}
