package com.example.patterns.service.proxy;

public class Login implements  CheckPost
{
    public boolean isUserAllowed;

    public Login(boolean isUserAllowed)
    {
        this.isUserAllowed = isUserAllowed;
    }

    public void setIsUserAllowed(boolean val)
    {
        isUserAllowed = val;
    }
    @Override
    public void displayUserStatus() {
            System.out.println(isUserAllowed);
    }
}
