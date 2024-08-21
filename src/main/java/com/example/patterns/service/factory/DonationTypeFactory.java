package com.example.patterns.service.factory;

public class DonationTypeFactory
{
    public Messenger createMessenger(Long n)
    {
        if(n == null)
                return null;

        if (n > 0 && n < 500)
        {
            return new LessDonation();
        }
        else if(n >= 500 && n < 2500)
        {
            return new MediumDonation();
        }
        else
        {
            return new HighDonation();
        }
    }
}
