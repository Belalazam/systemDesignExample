package com.example.patterns.service.command;

public class DarkMode implements  Command{

    private Theme theme;

    public DarkMode(Theme theme)
    {
        this.theme = theme;
    }

    @Override
    public void execute() {
        theme.darkMode();
    }
}
