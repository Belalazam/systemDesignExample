package com.example.patterns.service.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeforeEachLogin implements  CheckPost{

    private Login login;
    private String name;

    public BeforeEachLogin(String name)
    {
        this.name = name;
    }
    @Override
    public void displayUserStatus()
    {
            if(login == null)
            {
                login = new Login(false);
            }

            login.setIsUserAllowed(name.equals("special"));
            login.displayUserStatus();
    }
}
